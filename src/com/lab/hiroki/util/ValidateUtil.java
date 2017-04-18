package com.lab.hiroki.util;

import org.apache.commons.lang3.StringUtils;

public class ValidateUtil {

    /**
     * 空文字あるいはnullであるかをチェックする
     * 
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
        return StringUtils.isEmpty(str);
    }
    
    /**
     * 数値であるかどうかをチェックする
     * 
     * @param str
     * @return
     */
    public static boolean isNumber(String str) {
        if(!isEmpty(str)) {
            return false;
        } else {
            try {
                Integer.parseInt(str);
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }
    
    
}
