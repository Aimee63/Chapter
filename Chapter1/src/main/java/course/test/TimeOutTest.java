package course.test;

import org.testng.annotations.Test;

/**
 * @author Aimee63
 * @date 2020/12/23 下午1:51
 */
public class TimeOutTest {

    @Test(timeOut=3000)
    public void testSucceed() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Test(timeOut=3000)
    public void testFailed() throws InterruptedException {
        Thread.sleep(4000);
    }
}
