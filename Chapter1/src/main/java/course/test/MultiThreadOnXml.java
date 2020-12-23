package course.test;

import org.testng.annotations.Test;

/**
 * @author Aimee63
 * @date 2020/12/23 下午12:37
 */
public class MultiThreadOnXml {

    @Test
    public void test1() {
        System.out.printf("Thread Id: %s%n", Thread.currentThread().getId());
    }

    @Test
    public void test2() {
        System.out.printf("Thread Id: %s%n", Thread.currentThread().getId());
    }

    @Test
    public void test3() {
        System.out.printf("Thread Id: %s%n", Thread.currentThread().getId());
    }
}
