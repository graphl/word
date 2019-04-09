package com.word.test;

import com.word.util.MD5Util;
import org.junit.Test;

public class test {
    @Test
    public void test(){
        System.out.println(MD5Util.MD5EncodeUtf8("1234"));
    }
}
