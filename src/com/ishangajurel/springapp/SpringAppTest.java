package com.ishangajurel.springapp;

import junit.framework.TestCase;

public class SpringAppTest extends TestCase {

    public void testGetAge() {
        int age = 109;
        SpringApp sa = new SpringApp();
        sa.setAge(age);
        assertEquals(sa.getAge(),age+1);
    }

    public void testSetAge() {
    }
}