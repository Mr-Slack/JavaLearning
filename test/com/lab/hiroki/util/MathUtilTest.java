package com.lab.hiroki.util;

import java.math.BigDecimal;

import junit.framework.TestCase;

public class MathUtilTest extends TestCase {

    public void testStringToBigDecimal() {
        assertEquals(new BigDecimal("1234567"),MathUtil.stringToBigDecimal("1234567"));
        assertEquals(new BigDecimal("0.0000123"),MathUtil.stringToBigDecimal("0.0000123"));
        assertEquals(BigDecimal.ZERO,MathUtil.stringToBigDecimal("0"));
    }

    public void testDoRound() {
        
    }

}
