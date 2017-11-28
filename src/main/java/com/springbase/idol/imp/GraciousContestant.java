package com.springbase.idol.imp;

import com.springbase.idol.Contestant;

/**
 * @author walterwu
 * @date 2017/11/28
 */
public class GraciousContestant implements Contestant {

  @Override
  public void receiveAward() {
    System.out.println("（增加新的方法）获奖！");
  }
}
