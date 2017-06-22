package com.springbase.main;

import com.springbase.idol.Performer;
import com.springbase.idol.imp.Auditorium;
import com.springbase.idol.imp.Instrumentalist;
import com.springbase.idol.imp.Juggler;
import com.springbase.idol.imp.Stage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by walter on 2017/6/14.
 */
public class MainTask {
    private final static String SPRING_CONF = "classpath:applicationContext.xml";
    private static Performer performer;

    public static void main(String[] args) {
        System.out.println("starting......");
        ApplicationContext ctx = new ClassPathXmlApplicationContext(SPRING_CONF);

        //通过构造器注入参数
        //Performer performer = (Performer) ctx.getBean("duke");


//        //通过构造器注入引用
//        Performer performer = (Performer) ctx.getBean("poeticJuggler");
//        Stage stage = (Stage) ctx.getBean("theStage");
//        Auditorium auditorium = (Auditorium) ctx.getBean("auditorium");

        //注入和引用Bean的属性
        performer = (Performer) ctx.getBean("kenny");

        //输出
        performer.perform();
    }
}
