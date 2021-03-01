import com.wzg.demo.MyBeans;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @DESCRIPTION: new Class
 * @AUTHOR wangzengguang
 * @DATE 2021/3/1 10:57 上午
 **/
public class MyTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		MyBeans myBeans = (MyBeans) context.getBean("myBeans");
		System.out.println(myBeans);
	}
}
