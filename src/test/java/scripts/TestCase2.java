package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLibrary.Base;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;
import pomPages.TestingPage;

public class TestCase2 extends Base
{
	@Test
public void tc2() throws IOException
{
	SkillraryLoginPage s=new SkillraryLoginPage(driver);
	  s.gearsbutton();
	  s.skillrarydemoapplication();
	
	SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
    Utilities.switchingtabs(driver);
    Utilities.dropDown(sd.getCourseadd(),pdata.getPropertdata("courseadd"));
    
    
    TestingPage tp=new TestingPage(driver);
    Utilities.dragdrop(driver,tp.getSeleniumtraining(),tp.getCarttab());
    Point loc=tp.getFacebooktab().getLocation();
    int x=loc.getX();
    int y=loc.getY();
    
    
    Utilities.scrollBar(driver, x, y);
    tp.facebookicon();
}
}
