package course.test.groups;

import org.testng.annotations.Test;

/**
 * @author Aimee63
 * @date 2020/12/22 下午5:37
 */
@Test(groups = "teacher")
public class GroupsOnClass3 {

    public void teacher1() {
        System.out.println("这是class3中的teacher1");
    }

    public void teacher2() {
        System.out.println("这是class3中的teacher2");
    }
}
