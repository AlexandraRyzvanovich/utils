package com.epam.utils;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {
    private static final String testPositiveIntString = "8";

    @Test
    public void isPositiveNumberPositiveDataTest() {
       boolean testResult =  StringUtils.isPositiveNumber(testPositiveIntString);
       Assert.assertTrue(testResult);

    }
}
