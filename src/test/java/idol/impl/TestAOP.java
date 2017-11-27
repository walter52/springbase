package idol.impl;

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
  @Test
  public void readMindTest() {
//    walter.perform();
    volunteer.thinkOfSomethings("你好");

    System.out.println("return thoughts:"+ magician.getThoughts());
  }

}
