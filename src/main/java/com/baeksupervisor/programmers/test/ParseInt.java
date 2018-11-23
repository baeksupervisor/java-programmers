package com.baeksupervisor.programmers.test;

/**
 * @author wilson
 * @version 1.0
 * @since 24/11/2018
 */
public class ParseInt {

    public static void main(String[] args) throws Exception {
        System.out.println(parseInt("123"));
    }

    public static int parseInt(String s) {
        int retVal = 0;
        for (int i=0, sLen = s.length() ; i<sLen ; i++) {
            char ch = s.charAt(i);
            int intVal = (int) ((Math.pow(10, sLen - (i + 1)) * (ch - '0')));
            retVal += intVal;
        }

        return retVal;
    }
}
