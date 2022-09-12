package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage
{
@FindBy(id="course")
private WebElement coursetab;

public WebElement getCoursetab() {
	return coursetab;
}

@FindBy(name="addresstype")
private WebElement courseadd;

public WebElement getCourseadd() {
	return courseadd;
}

@FindBy(xpath="//a[text()='Selenium Training']")
private WebElement seleniumtraining;

public SkillraryDemoLoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void seleniumtrainingbtn()
{
	seleniumtraining.click();
}


}
