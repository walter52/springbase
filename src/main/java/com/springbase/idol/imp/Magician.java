package com.springbase.idol.imp;

import com.springbase.idol.MindReader;
import org.springframework.stereotype.Component;

/**
 * @author walterwu
 * @date 2017/11/21
 */
@Component("magician")
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
