package course.test;

import org.testng.annotations.Test;

/**
 * @author Aimee63
 * @date 2020/12/22 下午4:57
 */
public class IgnoreTest {

    @Test
    public void ignore1() {
        System.out.println("ignore1执行！");
    }

    @Test(enabled = false)
    public void ignore2() {
        System.out.println("ignore2执行！");
    }

    @Test(enabled = true)
    public void ignore3() {
        System.out.println("ignore3执行！");
    }
}
