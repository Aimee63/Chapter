package course.test;

import org.testng.annotations.Test;

/**
 * @author Aimee63
 * @date 2020/12/23 上午11:33
 */
public class MultiThreadOnAnnotation {

    @Test(invocationCount = 10,threadPoolSize = 3)
    public void testMultiThread() {
        System.out.printf("Thread ID: %s%n",Thread.currentThread().getId());
        System.out.println(1);
    }
}
