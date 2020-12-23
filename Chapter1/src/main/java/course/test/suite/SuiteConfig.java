package course.test.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * @author Aimee63
 * @date 2020/12/18 1:42 下午
 */
public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite 执行啦");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite 执行啦");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test 执行啦");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Class 执行啦");
    }
}
