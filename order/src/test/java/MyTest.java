import com.jzq.order.annotation.ClassProfile;
import com.jzq.order.bean.TestBean;
import org.junit.Test;

/**
 * @author jian zhi qiang
 * @date 2021/5/27 18:05
 * @description 
 */
public class MyTest {
    @Test
    public void test1() {
        Class clazz = TestBean.class;
        // 类是否被指定注解标注
        if (!clazz.isAnnotationPresent(ClassProfile.class)) {
            throw new RuntimeException("请维护 ClassProfile 标签！");
        }
        ClassProfile annotation = (ClassProfile) clazz.getAnnotation(ClassProfile.class);
        System.out.println(annotation.value());
    }
}
