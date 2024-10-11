package com.how;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author naihe
 * @date 2024/10/11 ❤ 下午 05:46
 */
@SpringBootTest(classes = {AppTest.class})
public class AppTest {

    @Test
    void test01() {
        System.out.println("hello test!");
    }
}
