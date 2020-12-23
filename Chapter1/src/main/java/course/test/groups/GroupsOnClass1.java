package course.test.groups;

import org.testng.annotations.Test;

/**
 * @author Aimee63
 * @date 2020/12/22 下午5:36
 */

@Test(groups = "students")
public class GroupsOnClass1 {

    public void student1() {
        System.out.println("这是class1中的student1");
    }

    public void student2() {
        System.out.println("这是class1中的student2");
    }
}
