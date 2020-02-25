package com.baizhi.testgithub;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestGithubApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println("github传来");
        System.out.println("从idea传来");
    }

}
