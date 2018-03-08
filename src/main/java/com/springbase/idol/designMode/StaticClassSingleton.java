package com.springbase.idol.designMode;

/**
 * @author walterwu
 * @date 2018/03/02
 */
public class StaticClassSingleton {
  private StaticClassSingleton(){}

  //静态内部类(延时加载)
  private static class StaticClassSingletonHolder{
    //第一次加载内部类的时候，实例化单例对象
    private static final StaticClassSingleton instance = new StaticClassSingleton();
  }

  public static StaticClassSingleton getInstance(){
    return StaticClassSingletonHolder.instance;
  }

}
