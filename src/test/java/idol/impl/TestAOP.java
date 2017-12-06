package idol.impl;

import com.springbase.idol.Contestant;
import com.springbase.idol.MindReader;
import com.springbase.idol.Thinker;
import com.springbase.idol.imp.Juggler;
import idol.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author walterwu
 * @date 2017/11/23
 */
public class TestAOP extends BaseTest {
  @Autowired
  private Juggler walter;
  @Autowired
  private Thinker volunteer;
  @Autowired
  private MindReader magician;

  //xml配置使用AOP
  @Test
  public void readMindTest() {
//    walter.perform();  //aop:在方法前后执行切面方法
//    volunteer.thinkOfSomethings("你好");  //从方法中截取参数，然后在切面中处理
    Contestant contestant = (Contestant)walter; //为一个对象增加新的方法
    contestant.receiveAward();  //调用AOP添加的父类方法必须强转才能调用
    System.out.println("return thoughts:"+ magician.getThoughts());
  }

  //利用注解的方法使用AOP（AudienceForAnnotation）
  @Test
  public void AnnotationAOPTest(){
    walter.perform();
  }

  //利用aspectJ实施更细致的AOP，此切面有两点注意：1，编译器要切换为aspectJ的编译器 2.与spring注解切面冲突
  @Test
  public void aspectJAopTest(){
    walter.perform();
  }
}
