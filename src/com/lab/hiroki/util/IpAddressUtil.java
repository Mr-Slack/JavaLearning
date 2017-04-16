package com.lab.hiroki.util;

import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
/**
 * 
 * IPアドレス用ユーティリティクラス
 * 
 * @since 2017/04/16
 * @author HIROKI
 * 
 */
public class IpAddressUtil {

    /**
     * IPV4用正規表現パターン
     */
    private static final Pattern IPV4_FORMAT = Pattern.compile("^\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}$");
    
    /**
     * IPV4アドレス形式チェック
     * (0.0.0.0 ~ 255.255.255.255)
     * 
     * @param str
     * @return
     */
    public static boolean isIpv4Address(String str) {
        if(StringUtils.isEmpty(str)) {
            return false;
        }
        return isIpv4Address(str, true);
    }
    
    /**
     * IPV4アドレス形式チェック
     * (0.0.0.0 ~ 255.255.255.255)
     * 
     * @param str
     * @return
     */
    public static boolean isIpv4Address(String str, boolean strict) {
        if (strict) {
            return IPV4_FORMAT.matcher(str).matches();
        }
        
        String[] addrs = str.split("\\.");
        if (addrs.length != 4) {
            return false;
        }
        for (String addr : addrs) {
            try {
                int b = Integer.parseInt(addr);
                if (b < 0 || 255 < b) return false;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }
    
}
