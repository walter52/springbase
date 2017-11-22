package com.springbase.aboutJava;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author walterwu
 * @date 2017/11/14
 */
public class AboutReflect {
  public static void doReflect(){
    try {
      Class class1 = Class.forName("com.springbase.idol.imp.City");
      Field[] fs = class1.getDeclaredFields();
      StringBuffer sb = new StringBuffer();
      sb.append(
          Modifier.toString(class1.getModifiers()) + " class " + class1.getSimpleName() + "{\n");
      for (Field fd : fs) {
        sb.append("\t")
            .append(Modifier.toString(fd.getModifiers()) + " ")
            .append(fd.getType().getSimpleName() + " ")
            .append(fd.getName()+" ;\n");
      }
      sb.append("}");
      Field fdName = class1.getDeclaredField("name");  //获取属性
      Object o = class1.newInstance();
      fdName.setAccessible(true);  //使反射可以访问私有属性
      fdName.set(o,"walter");
      Method md = class1.getMethod("getName");  //获取方法
      Object mo = md.invoke(o);  //执行方法
      System.out.println(sb);
      System.out.println(fdName.get(o));
      System.out.println(mo);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
