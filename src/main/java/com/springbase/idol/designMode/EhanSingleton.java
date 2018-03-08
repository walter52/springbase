package com.springbase.idol.designMode;

/**
 * @author walterwu
 * @date 2018/03/02
 */
public class EhanSingleton {

  //1.static final单例对象，类加载的时候就初始化
  private static final EhanSingleton instance = new EhanSingleton();

  //2.私有构造方法，使得外界不能直接new
  private EhanSingleton() {
  }

  //3.公有静态方法，对外提供获取单例接口
  public static EhanSingleton getInstance() {
    return instance;
  }
}
