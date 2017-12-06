package com.springbase.idol.imp;

import com.springbase.idol.CriticismEngine;

/**
 * @author walterwu
 * @date 2017/12/06
 */
public class CriticismEngineImpl implements CriticismEngine {

  public CriticismEngineImpl() {
  }

  @Override
  public String getCriticism() {
    int i =(int)(Math.random()*criticismPool.length);
    return criticismPool[i];
  }

  private String[] criticismPool;
  public void setCriticismPool(String[] criticismPool){
    this.criticismPool = criticismPool;
  }

}
