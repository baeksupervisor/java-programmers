package com.baeksupervisor.programmers.hash;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author wilson
 * @version 1.0
 * @since 2018. 10. 14.
 */
public class PhoneBookTest {

    private String[] phone_book;

    @Before
    public void before() {
        phone_book = new String[]{"119", "97674223", "1195524421"};
        phone_book = new String[]{"123", "456", "789"};
        phone_book = new String[]{"12", "123", "1235", "567", "88"};
    }

    @Test
    public void test() {
        PhoneBook phoneBook = new PhoneBook();
        boolean result = phoneBook.solution(phone_book);

        System.out.println(result);
    }
}