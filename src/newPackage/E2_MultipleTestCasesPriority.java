package newPackage;

import org.testng.SkipException;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class E2_MultipleTestCasesPriority {
  @SuppressWarnings("Just for Fun")
  @Test(priority=3)
  public void c_test() {
	  Assert.fail();
  }
  
  @Test(priority=0)
  public void a_test() {
	  Assert.assertTrue(true);
  }
  
  @Test(priority=7)
  public void b_test() {
	  throw new SkipException("Skip b_test");
  }
  
}