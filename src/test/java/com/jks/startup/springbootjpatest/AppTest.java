package com.jks.startup.springbootjpatest;

import com.jks.startup.springbootjpatest.controller.MagazineController;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testApp(){
        MagazineController magazineController = new MagazineController();
        String actual = magazineController.test();
        assertEquals("success..", actual);
    }
}
