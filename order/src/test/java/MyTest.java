import com.jzq.order.OrderApplication;
import com.jzq.order.annotation.ClassProfile;
import com.jzq.order.bean.StudentBO;
import com.jzq.order.bean.TestBean;
import com.jzq.order.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author jian zhi qiang
 * @date 2021/5/27 18:05
 * @description 
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = OrderApplication.class)
public class MyTest {
    @Resource
    StudentService studentService;

    @Test
    public void contextLoads() {
        StudentBO studentBO = new StudentBO();
        studentBO.setName("华为");
        studentService.save(studentBO);
        System.out.println("成功");
    }
}
