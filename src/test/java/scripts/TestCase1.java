package scripts;

import org.testng.annotations.Test;

import genericLibrary.Base;
import pomPages.AddToCart;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;
public class TestCase1 extends Base
{
  @Test
  public void tcl()
  {
	  SkillraryLoginPage s=new SkillraryLoginPage(driver);
	  s.gearsbutton();
	  s.skillrarydemoapplication();
	  
	  Utilities.switchingtabs(driver);
	  
	  SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
	  Utilities.mouseHover(driver, sd.getCoursetab());
	 sd.seleniumtrainingbtn();
	 
	 AddToCart d=new AddToCart(driver);
	 Utilities.doubleClick(driver, d.getAddbtn());
	 d.carttocarbtn();
	 Utilities.alertPopup(driver);
  }
}
