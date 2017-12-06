package com.springbase.idol.imp;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author walterwu
 * @date 2017/12/05
 */
//@Aspect
public class AudienceForAnnotation {

//  @Pointcut("execution(* com.springbase.idol.Performer.perform(..))")
//  public void performance() {
//  }
//
//  @Before("performance()")
//  public void takeSeats() {
//    System.out.println("找座位Annotation");
//  }
//
//  @Before("performance()")
//  public void turnOffCellPhones() {
//    System.out.println("关闭手机Annotation");
//  }
//
//  @AfterReturning("performance()")
//  public void applaud() {
//    System.out.println("鼓掌Annotation");
//  }
//
//  @AfterThrowing("performance()")
//  public void demandRefund() {
//    System.out.println("退款Annotation");
//  }
//
//  @Around("performance()")
//  public void watchPerformance(ProceedingJoinPoint joinPoint){
//    try{
//      System.out.println("找座位Annotation-around");
//      System.out.println("关闭手机Annotation-around");
//      long start = System.currentTimeMillis();
//      joinPoint.proceed();
//      long end = System.currentTimeMillis();
//      System.out.println("鼓掌Annotation-around");
//      System.out.println("时长Annotation-around:"+(end-start));
//    }catch (Throwable t){
//      System.out.println("退款Annotation-around");
//    }
//  }
}
