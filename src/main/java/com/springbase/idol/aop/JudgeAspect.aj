package com.springbase.idol.aop;

import com.springbase.idol.CriticismEngine;

/**
 * @author walterwu
 * @date 2017/12/06 
 */
public aspect JudgeAspect {
  public JudgeAspect(){}

  pointcut performanceJ():execution(* perform(..));

  after() returning() : performanceJ(){
    System.out.println(criticismEngine.getCriticism());
  }

  private CriticismEngine criticismEngine;

  public void setCriticismEngine(CriticismEngine criticismEngine) {
    this.criticismEngine = criticismEngine;
  }
}
