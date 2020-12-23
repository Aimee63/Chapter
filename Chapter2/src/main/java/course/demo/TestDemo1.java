package course.demo;

import org.testng.Reporter;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Aimee63
 * @date 2020/12/23 下午6:14
 */
public class TestDemo1 {

    @Test
    public void test1() {
        Assert.assertEquals(1,1);
    }

    @Test
    public void test2() {
        Assert.assertEquals(1,2);
    }

    @Test
    public void test3() {
        Assert.assertEquals("aaa","aaa");
    }

    @Test
    public void logTest() {
        Reporter.log("这是我自己写的日志");
        throw new RuntimeException("这是我自己的运行时异常");
    }
}