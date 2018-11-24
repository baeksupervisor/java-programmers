package com.baeksupervisor.programmers.util;

/**
 * @author wilson
 * @version 1.0
 * @since 24/11/2018
 */
public class VersionUtils {

    /**
     *	if x < y then -1
     *  if x == y then 0
     *  if x > y then 1
     *
     * @param x
     * @param y
     * @return
     *
     */
    public static int compare(String x, String y) {
        try {
            String[] xSplit= x.split(".");
            String[] ySplit = y.split(".");
            int xCnt = xSplit.length;
            int yCnt = ySplit.length;
            int maxLen = (Integer.compare(xCnt, yCnt) > 0) ? xCnt : yCnt;

            for (int i = 0; i < maxLen; i++) {
                int xVal = (i < xCnt) ? new Integer(xSplit[i]).intValue() : 0;
                int yVal = (i < yCnt) ? new Integer(ySplit[i]).intValue() : 0;

                int result = Integer.compare(xVal, yVal);
                if (result != 0) {
                    return result;
                }
            }

            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }

    }
}
