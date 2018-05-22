package cn.dw.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// 演示如何从Spring中创建对象
public class SpringTest {

	public static void main(String[] args) {
		// 1: 获取Spring的配置文件
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-bean.xml");
		System.out.println("-----上面已经加载spring配置文件------");
		// 2: 通过ID查找相应的Class并且创建对象
		System.out.println(context.getBean("product"));
		System.out.println(context.getBean("product"));
	}
}