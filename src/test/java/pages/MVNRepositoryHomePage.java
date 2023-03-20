package pages;

import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

public class MVNRepositoryHomePage {

    public MVNRepositoryHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

}
