package com.baeksupervisor.programmers.util;

import java.util.Collections;

/**
 * @author wilson
 * @version 1.0
 * @since 24/11/2018
 */
public class ObjectUtils {


    public static <T> Iterable<T> emptyIfNull(Iterable<T> iterable) {
        return iterable == null ? Collections.<T>emptyList() : iterable;
    }


}
