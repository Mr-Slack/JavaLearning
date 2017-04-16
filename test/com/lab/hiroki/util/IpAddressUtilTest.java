package com.lab.hiroki.util;

import junit.framework.TestCase;

public class IpAddressUtilTest extends TestCase {

    public void testIsIpv4AddressString() {
        assertEquals(true,IpAddressUtil.isIpv4Address("10.172.9.0"));
        assertEquals(true,IpAddressUtil.isIpv4Address("0.0.0.0"));
        assertEquals(true,IpAddressUtil.isIpv4Address("255.255.255.255"));
        assertEquals(false,IpAddressUtil.isIpv4Address("1000.172.9.0"));
        assertEquals(false,IpAddressUtil.isIpv4Address("100.0.0..1"));
        assertEquals(false,IpAddressUtil.isIpv4Address("168.9.0.1.."));
        assertEquals(false,IpAddressUtil.isIpv4Address("AAA.BBB.CCC.DDD"));
        assertEquals(true,IpAddressUtil.isIpv4Address("001.002.003.004"));
    }

}
