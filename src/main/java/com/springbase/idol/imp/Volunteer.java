package com.springbase.idol.imp;

import com.springbase.idol.Thinker;

/**
 * @author walterwu
 * @date 2017/11/23
 */
public class Volunteer implements Thinker {
  private String thought;
  @Override
  public void thinkOfSomethings(String thought) {
    this.thought = thought;
  }
  public String getThoughts(){
    return thought;
  }
}
