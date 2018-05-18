package com.springbase.idol.designMode.singleton;

/**
 * 简单的单例模式(多线程高并发下会有问题)
 * @author walterwu
 * @date 2018/03/02
 */
public class SimpleSingleton {

  //1.static单例变量
  private static  SimpleSingleton instance;

  //2.私有的构造方法
  private SimpleSingleton(){
  }

  //3.静态方法为调用者提供单例对象
  public static SimpleSingleton getInstance(){
    if (instance == null){
      instance = new SimpleSingleton();
    }
    return instance;
  }
}
