package com.example;

import org.junit.jupiter.api.Test;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;

/**
 * @author naihe
 * @date 2025/09/17 ❤ 下午 03:06
 */
public class SimpleTest {

    @Test
    void test10() {
        MemoryMXBean mxBean = ManagementFactory.getMemoryMXBean();
        MemoryUsage heapMemoryUsage = mxBean.getHeapMemoryUsage();
        long usageInit = heapMemoryUsage.getInit();
        System.out.printf("Init: %sMB\n", usageInit / 1024 / 1024);
        long usageUsed = heapMemoryUsage.getUsed();
        System.out.printf("Used: %sMB\n", usageUsed / 1024 / 1024);
        long usageCommitted = heapMemoryUsage.getCommitted();
        System.out.printf("Committed: %sMB\n", usageCommitted / 1024 / 1024);
        long usageMax = heapMemoryUsage.getMax();
        System.out.printf("Max: %sMB\n", usageMax / 1024 / 1024);

        mxBean.gc();
    }
}
