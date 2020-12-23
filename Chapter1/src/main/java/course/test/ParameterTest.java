package course.test;

import org.testng.annotations.*;

/**
 * @author Aimee63
 * @date 2020/12/22 下午6:50
 */
public class ParameterTest {

    @Test
    @Parameters({"name", "age"})
    public void test(String name, int age) {
        System.out.println("name = " + name + "; age = " + age);
    }
}
