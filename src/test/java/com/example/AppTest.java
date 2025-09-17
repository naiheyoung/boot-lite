package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import javax.annotation.Resource;

/**
 * @author naihe
 * @date 2024/10/11 ❤ 下午 05:46
 */
@SpringBootTest(classes = {AppTest.class})
public class AppTest {

    @Resource
    ApplicationContext applicationContext;

    @Test
    void test01() {
        System.out.println("hello test!");
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
