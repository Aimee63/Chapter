package course.test;

import org.testng.annotations.*;

/**
 * @author Aimee63
 * @date 2020/12/18 11:49 上午
 */
public class BasicAnnotation {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("测试套件执行之前");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("测试套件执行之后");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("这是在执行开始之前运行的");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("这是在执行结束之后运行的");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("这是在测试方法之前运行的");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("这是在测试方法之后运行的");
    }

    @Test
    public void testCase1() {
        System.out.println("这是测试用例1");
    }

    @Test
    public void testCase2() {
        System.out.println("这是测试用例2");
    }
}
