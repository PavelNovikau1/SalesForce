package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewAccountModalPageTests extends HeaderPageTests {

    private static final String ACCOUNT_NAME = "TMS Account";
    private static final String WEBSITE = "www.TMS.by";
    private static final String DESCRIPTION = "TeachMeSkills - это школа программирования, " +
            "где мы научим тебя востребованным сегодня знаниям. " +
            "Все наши программы составлены Senior и Lead разработчиками ведущих IT компаний" +
            " специально для новичков в IT.";

    @Test
    public void createNewAccountTest(){
        loginPage.login();
        newAccountModalPage.createNewAccount(ACCOUNT_NAME,WEBSITE, DESCRIPTION );
        Assert.assertEquals(newCreatedAccountPage.getNameOfCreatedAccount(), ACCOUNT_NAME);
    }
}
