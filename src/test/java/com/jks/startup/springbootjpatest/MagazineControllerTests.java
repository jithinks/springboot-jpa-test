package com.jks.startup.springbootjpatest;

import com.jks.startup.springbootjpatest.controller.MagazineController;
import com.jks.startup.springbootjpatest.jpa.MagazineRepo;
import com.jks.startup.springbootjpatest.model.Magazine;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.Assert.assertEquals;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MagazineControllerTests {

    @InjectMocks
    private MagazineController magazineController;

    @Mock
    private MagazineRepo magazineRepo;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testMagazineList(){
        Magazine magazine = new Magazine();
        magazine.setId(100l);
        magazine.setName("National");
        when(magazineRepo.findOne(100l)).thenReturn(magazine);

        Magazine m = magazineController.findOne(100l);

        verify(magazineRepo).findOne(100l);
        assertEquals("National", m.getName());
    }
}
