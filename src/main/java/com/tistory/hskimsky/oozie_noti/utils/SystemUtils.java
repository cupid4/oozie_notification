package com.tistory.hskimsky.oozie_noti.utils;

import java.lang.management.ManagementFactory;

public class SystemUtils {

    public static String getPid() {
        try {
            String name = ManagementFactory.getRuntimeMXBean().getName();
            if (name != null) {
                return name.split("@")[0];
            }
        } catch (Throwable ex) {
            // Ignore
        }
        return "????";
    }
}