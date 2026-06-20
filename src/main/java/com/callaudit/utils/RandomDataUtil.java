package com.callaudit.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class RandomDataUtil {

    private static final Random random = new Random();

    public static String generateName(String prefix) {
        String timestamp = new SimpleDateFormat("HHmmss").format(new Date());
        return prefix + "_" + timestamp;
    }

    public static String generateUsername() {
        return "user_" + new SimpleDateFormat("HHmmss").format(new Date());
    }

    public static String generateEmail() {
        return "test_" + new SimpleDateFormat("HHmmss").format(new Date()) + "@callaudit.com";
    }

    public  String generateNumeric(int digits) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < digits; i++) {
            sb.append(random.nextInt(9) + 1);
        }
        return sb.toString();
    }

    public static String generateExtensionRange(int start, int end) {
        return start + "-" + end;
    }
}
