package course.test;

import org.testng.annotations.*;

import java.lang.reflect.Method;

/**
 * @author Aimee63
 * @date 2020/12/22 下午7:16
 */
public class DataProviderTest {

    @Test(dataProvider = "data1")
    public void test1(String name, int age) {
        System.out.println("name=" + name + "; age=" + age);
    }

    @DataProvider(name = "data1")
    public Object[][] data1() {
        Object[][] object = {
                {"张三", 16},
                {"李四", 18},
                {"王五", 20}
        };
        return object;
    }

    @Test(dataProvider="data2")
    public void test2(String name, int age) {
        System.out.println("test2方法: name=" + name + ", age=" + age);
    }

    @Test(dataProvider="data2")
    public void test3(String name, int age) {
        System.out.println("test3方法: name=" + name + ", age=" + age);
    }

    @DataProvider(name="data2")
    public Object[][] data2(Method method) {
        Object[][] object = null;
        if(method.getName().equals("test2")) {
            object = new Object[][]{
                    {"张三",16},
                    {"李四",18}
            };
        }else if(method.getName().equals("test3")) {
            object = new Object[][]{
                    {"王五",55},
                    {"赵六",60}
            };
        }
        return object;
    }
}
