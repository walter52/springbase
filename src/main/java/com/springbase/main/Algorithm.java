package com.springbase.main;

import com.sun.net.httpserver.HttpServer;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.servlet.HttpServletBean;

/**
 * @author walterwu
 * @date 2018/03/12
 */
public class Algorithm {

  public static void change(Test test){
    test.setA(2);
    test.setB("gfd");
  }

  public static void changeInt(int a){
    a =2;
  }

  public static void changeStr(String b){
    b = "str2";
  }

  public static void main(String[] args){
    Test test = new Test();
    test.setA(1);
    test.setB("abc");
    change(test);
    System.out.println("a:"+test.getA()+",b:"+test.getB());

    int a =1;
    changeInt(a);
    System.out.println("a:"+a);

    String b = "str1";
    changeStr(b);
    System.out.println("b:"+b);
  }

}


