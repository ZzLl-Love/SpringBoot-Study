package cn.zyy;

import cn.zyy.domain.Dog;
import cn.zyy.domain.Monster;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class HspSpringboot01Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext ioc = SpringApplication.run(HspSpringboot01Application.class, args);

//        System.out.println("================测试使用传统方式来获取beans.xml中配置的bean======================");
//
//        ApplicationContext ioc = new ClassPathXmlApplicationContext("beans.xml");
//        Monster monster1 = ioc.getBean("monster1", Monster.class);
//        System.out.println(monster1);
//        System.out.println("================测试使用传统方式来获取beans.xml中配置的bean======================");

//        System.out.println("====================测试使用@Configuration + @Bean 来注入bean========================");
//        boolean monster1 = ioc.containsBean("monster01");
//        System.out.println(monster1);
//        System.out.println("====================测试使用@Configuration + @Bean 来注入bean========================");


//        System.out.println("====================测试使用@Import来注入bean========================");
//        String[] beanNamesForType = ioc.getBeanNamesForType(Dog.class);
//        for (String s : beanNamesForType) {
//            System.out.println("s=" + s);
//        }
//        Object bean = ioc.getBean("cn.zyy.domain.Dog");
//        System.out.println(bean);
//        System.out.println("====================测试使用@Import来注入bean========================");


            System.out.println("====================测试使用@ImportResource来注入bean========================");
            Monster monster1 = ioc.getBean("monster1", Monster.class);
            System.out.println(monster1);
            System.out.println("====================测试使用@ImportResource来注入bean========================");


    }

}
