package com.wenshuay.utils;

import java.util.Random;

/**
 * Created by apple on 18/1/9.
 */
public class KeyUtil {
    public synchronized static String getUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;

        return System.currentTimeMillis() + String.valueOf(number);
    }
}
