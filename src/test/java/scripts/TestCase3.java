package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLibrary.Base;
import pomPages.CoreJavaPage;
import pomPages.SkillraryLoginPage;
import pomPages.Wishlistpage;

public class TestCase3 extends Base
{
   @Test
   public void tc3() throws IOException, InterruptedException
   {
	   SkillraryLoginPage s=new SkillraryLoginPage(driver);
	   s.searchtextbox(pdata.getPropertdata("coursedata"));
	   s.searcbutton();   
	    
	   CoreJavaPage c=new CoreJavaPage(driver);
	   c.seleniumtraining();
	   
	   Wishlistpage w=new Wishlistpage(driver);
	   Utilities.switchFrame(driver);
	   Thread.sleep(5000);
	   w.playbutton();
	   Thread.sleep(1000);
	   w.pausebutton();
	   Utilities.switchbackframe(driver);;
	   w.addtowishlistbtn();
	   
	   
   
   }
}
