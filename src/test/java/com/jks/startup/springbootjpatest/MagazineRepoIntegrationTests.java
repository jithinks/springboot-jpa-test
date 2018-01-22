package com.jks.startup.springbootjpatest;

import com.jks.startup.springbootjpatest.jpa.MagazineRepo;
import com.jks.startup.springbootjpatest.model.Magazine;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MagazineRepoIntegrationTests {

    @Autowired
    private MagazineRepo magazineRepo;

    @Test
    public void testFindAll(){
        List<Magazine> list = magazineRepo.findAll();
        assertThat(list.size(), is(greaterThanOrEqualTo(0)));
    }
}
