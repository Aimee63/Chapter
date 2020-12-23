package course.test;

import org.testng.annotations.*;

/**
 * @author Aimee63
 * @date 2020/12/22 下午4:58
 */
public class GroupsTest {

    @BeforeGroups("server")
    public void serverBeforeGroups() {
        System.out.println("这是在服务端测试执行前运行的");
    }

    @AfterGroups("server")
    public void serverAfterGroups() {
        System.out.println("这是在服务端测试执行后运行的");
    }

    @BeforeGroups("client")
    public void clientBeforeGroups() {
        System.out.println("这是在客户端测试执行前运行的");
    }

    @AfterGroups("client")
    public void clientAfterGroups() {
        System.out.println("这是在客户端测试执行后运行的");
    }

    @Test(groups = "server")
    public void test1() {
        System.out.println("这是服务端组的测试方法1");
    }

    @Test(groups = "server")
    public void test2() {
        System.out.println("这是服务端组的测试方法22");
    }

    @Test(groups = "client")
    public void test3() {
        System.out.println("这是客户端组的测试方法333");
    }

    @Test(groups = "client")
    public void test4() {
        System.out.println("这是客户端组的测试方法4444");
    }
}
