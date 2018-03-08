package com.springbase.idol.designMode;

/**
 * @author walterwu
 * @date 2018/03/02
 */
public class LanhanSingleton {

  private static LanhanSingleton instance;

  private LanhanSingleton() {
  }

  //增加synchronized关键字，该方法为同步方法，保证多线程单例对象唯一
  public static synchronized LanhanSingleton getInstance() {
    if (instance == null) {
      instance = new LanhanSingleton();
    }
    return instance;
  }
}
