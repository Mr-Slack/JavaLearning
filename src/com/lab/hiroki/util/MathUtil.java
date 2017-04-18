package com.lab.hiroki.util;

import java.math.BigDecimal;

public class MathUtil {
    /**
     * 文字列をDecimal型へ変換する処理
     * 
     * @param number
     * @return
     */
    public static BigDecimal stringToBigDecimal(String number) {
        BigDecimal bgd = new BigDecimal(number);
        return bgd;
    }
    
    /**
     * 指定した桁数（少数点）で四捨五入した値を返す
     * 
     * @param number
     * @param digits
     * @return
     */
    public static BigDecimal doRound(String number,int digits) {
        BigDecimal bgd = stringToBigDecimal(number);
        bgd = bgd.setScale(digits, BigDecimal.ROUND_HALF_UP);
        return bgd;
    }
}
