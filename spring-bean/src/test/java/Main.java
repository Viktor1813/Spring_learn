import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    @Test
    public void test(){

        // 创建IOC 容器对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        //从IOC容器中获取实例bean
        Object person = ctx.getBean("person");

        System.out.println(person);
    }

}
