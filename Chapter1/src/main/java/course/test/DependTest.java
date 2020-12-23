package course.test;

import org.testng.annotations.Test;

/**
 * @author Aimee63
 * @date 2020/12/22 下午6:41
 */
public class DependTest {

    @Test
    public void test1() {
        System.out.println("test1 run");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2() {
        System.out.println("test2 run");
    }

}
