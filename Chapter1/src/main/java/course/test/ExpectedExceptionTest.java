package course.test;

import org.testng.annotations.Test;

/**
 * @author Aimee63
 * @date 2020/12/22 下午6:31
 */
public class ExpectedExceptionTest {

    @Test(expectedExceptions = RuntimeException.class)
    public void runtimeExceptionFailed() {
        System.out.println("这是我失败的异常测试");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runtimeExceptionSucceed() {
        System.out.println("这是我成功的异常测试");
        throw new RuntimeException();
    }

}
