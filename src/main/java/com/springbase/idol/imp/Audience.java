package com.springbase.idol.imp;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author walterwu
 * @date 2017/11/14
 */
public class Audience {
  public void takeSeats(){
    System.out.println("找座位");
  }
  public void turnOffCellPhones(){
    System.out.println("关闭手机");
  }

  public void applaud(){
    System.out.println("鼓掌");
  }

  public void demandRefund(){
    System.out.println("退款");
  }

  public void watchPerformance(ProceedingJoinPoint joinPoint){
    try{
      System.out.println("找座位around");
      System.out.println("关闭手机around");
      long start = System.currentTimeMillis();
      joinPoint.proceed();
      long end = System.currentTimeMillis();
      System.out.println("鼓掌around");
      System.out.println("时长around:"+(end-start));
    }catch (Throwable t){
      System.out.println("退款around");
    }
  }
}
