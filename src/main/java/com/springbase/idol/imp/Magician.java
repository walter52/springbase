package com.springbase.idol.imp;

import com.springbase.idol.MindReader;

/**
 * @author walterwu
 * @date 2017/11/21
 */
public class Magician implements MindReader{
  private String thoughts;

  @Override
  public void interceptThoughts(String thoughts) {
    System.out.println("intercept thoughts:"+thoughts);
    this.thoughts = thoughts;
  }

  @Override
  public String getThoughts() {
    return thoughts;
  }
}
