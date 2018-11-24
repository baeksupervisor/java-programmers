package com.baeksupervisor.programmers.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wilson
 * @version 1.0
 * @since 24/11/2018
 */
public class StringUtils {

    public static void main(String[] args) throws Exception {
        System.out.println(removeZeroHead("01012345678"));
        Map<String, Object> params = new HashMap<>();
        params.put("param1", 123);
        params.put("param2", "456");
        params.put("param3", false);
        params.put("param4", 789L);

        System.out.println(makeQueryString(params));
    }

    /**
     * 앞자리 '0'을 제거
     *
     * @param s ex."01012345678"
     * @return
     */
    public static String removeZeroHead(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        for (; i < chars.length; ++i) {
            if (chars[i] != '0') {
                break;
            }
        }
        return new String(chars, i, chars.length - i);
    }

    /**
     * GET 요청을 위한 queryString 을 만들어냄
     * @param parameter
     * @return
     */
    public static String makeQueryString(Map<String, Object> parameter) {
        List<String> signatureParam = new ArrayList<String>();
        for (String key : parameter.keySet()) {
            signatureParam.add(key + "=" + parameter.get(key));
        }

        return String.join("&", signatureParam);
    }
}
