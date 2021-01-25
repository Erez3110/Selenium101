package PageObjects.Web.Forms;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class practiseForms
{
    @FindBy(xpath = "//span[text()='Practice Form']")
    public WebElement practiseForms_btn;

    @FindBy(id = "firstName")
    public WebElement firstName_txt;

    @FindBy(id = "lastName")
    public WebElement lastName_txt;

    @FindBy(id = "userEmail")
    public WebElement userEmail_txt;

    @FindBy(id = "gender-radio-1")
    public WebElement male_radio;

    @FindBy(xpath = "//label[@for='gender-radio-1']")
    public WebElement male_lbl;

    @FindBy(id = "gender-radio-2")
    public WebElement female_radio;

    @FindBy(xpath = "//label[@for='gender-radio-2']")
    public WebElement female_lbl;

    @FindBy(id = "gender-radio-3")
    public WebElement other_radio;

    @FindBy(xpath = "//label[@for='gender-radio-3']")
    public WebElement other_lbl;

    @FindBy(id = "userNumber")
    public WebElement cellPhone_txt;

    @FindBy(id = "dateOfBirthInput")
    public WebElement birthDate_btn;

    @FindBy(id = "subjectsInput")
    public WebElement subject_txt;

    @FindBy(id = "hobbies-checkbox-1")
    public WebElement sports_checkBox;

    @FindBy(id = "hobbies-checkbox-2")
    public WebElement reading_checkBox;

    @FindBy(id = "hobbies-checkbox-3")
    public WebElement music_checkBox;

    @FindBy(id = "uploadPicture")
    public WebElement upload_btn;

    @FindBy(id = "currentAddress")
    public WebElement currentAddress_txt;

    @FindBy(xpath = "//div[text()='Select State']")
    public WebElement state_txt;

    @FindBy(xpath = "//div[text()='Select City']")
    public WebElement city_txt;

    @FindBy(id = "submit")
    public WebElement submit_btn;

    @FindBy(xpath = "//div[@class='modal-content']")
    public WebElement modalContainer;
}
