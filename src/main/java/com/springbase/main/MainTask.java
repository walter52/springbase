package com.springbase.main;

import com.springbase.aboutJava.AboutReflect;
import com.springbase.idol.Performer;
import com.springbase.idol.imp.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by walter on 2017/6/14.
 */
public class MainTask {

  private final static String SPRING_CONF = "classpath:applicationContext.xml";

  public static void main(String[] args) {
    System.out.println("starting......");
    ApplicationContext ctx = new ClassPathXmlApplicationContext(SPRING_CONF);
    //通过构造器注入参数
    Performer performer = (Performer) ctx.getBean("duke");

    //通过构造器注入引用
//        Performer performer = (Performer) ctx.getBean("poeticJuggler");
//        Stage stage = (Stage) ctx.getBean("theStage");
//        Auditorium auditorium = (Auditorium) ctx.getBean("auditorium");

    //注入和引用Bean的属性
//        performer = (Performer) ctx.getBean("kenny"); //normal
//        performer = (Performer) ctx.getBean("carl"); //通过表达式调用kenny的属性
//        performer = (Performer) ctx.getBean("kennyP"); //利用p命名空间
//        performer = (Performer) ctx.getBean("hankList"); //装配集合（list ，set）
//        performer = (Performer) ctx.getBean("hankMap");//装配map
//        performer = (Performer) ctx.getBean("kenny_autoByName"); //byname 自动装配

    //输出
    performer.perform();

    //反射
//    AboutReflect.doReflect();

  }
}
