package com.role.mis.test;

import org.junit.Test;

import java.util.Arrays;

public class StringTest {

    @Test
    public void test(){
        String s = "1";
        String[] split = s.split("-");
        System.out.println(Arrays.toString(split));
    }
}
