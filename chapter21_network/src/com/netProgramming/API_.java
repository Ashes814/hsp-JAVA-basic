package com.netProgramming;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author 欧欧
 * @version 1.0
 */
public class API_ {
    public static void main(String[] args) throws UnknownHostException {
        // get local InetAddress Object
        InetAddress localhost = InetAddress.getLocalHost();
        System.out.println(localhost);

        // get InetAddress Object by host name
        InetAddress byName = InetAddress.getByName("zhangouwendeMacBook-Pro.local");
        System.out.println(byName);

        // get InetAddress Object by domain name
        InetAddress byDomain = InetAddress.getByName("www.bilibili.com");
        System.out.println(byDomain);

        // get Address by InetAddress Object
        String address =  byDomain.getHostAddress();
        System.out.println(address);

        // get host/domain Name by InetAddress Object
        String hostName =  byDomain.getHostName();
        System.out.println(hostName);

    }
}

