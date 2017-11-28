package com.springbase.idol.imp;

import com.springbase.idol.Thinker;
import org.springframework.stereotype.Component;

/**
 * @author walterwu
 * @date 2017/11/23
 */
@Component("volunteer")
public class Volunteer implements Thinker {
  private String thought;
  @Override
  public void thinkOfSomethings(String thought) {
    this.thought = thought;
  }

  public String getThought(){
    return thought;
  }
}
