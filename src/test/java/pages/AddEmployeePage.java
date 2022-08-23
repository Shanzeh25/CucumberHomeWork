package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddEmployeePage extends CommonMethods {

    @FindBy(id="firstName")
    public WebElement firstName;

    @FindBy(id="middleName")
    public WebElement middleName;

    @FindBy(id="lastName")
    public WebElement lastName;

    @FindBy(id="btnSave")
    public WebElement saveButton;

    @FindBy(id="photofile")
    public WebElement photograph;

    @FindBy(id="chkLogin")
    public WebElement checkBox;

    @FindBy(id="user_name")
    public WebElement usernameEmployee;

    @FindBy(id="user_password")
    public WebElement passwordEmployee;

    @FindBy(id="re_password")
    public WebElement confirmPasswordEmployee;

    @FindBy(id="employeeId")
    public WebElement empIdLoc;

    @FindBy(id="personal_txtEmpNickName")
    public WebElement nickName;

    @FindBy(id="btnSave")
    public WebElement edit;

    @FindBy(id="personal_txtLicenNo")
    public WebElement licenseNo;

    @FindBy(id ="personal_txtOtherID")
    public WebElement otherID;

    @FindBy(id="personal_txtNICNo")
    public WebElement ssnNo;

  @FindBy(id="personal_txtSINNo")
  public WebElement sinNo;

  @FindBy(id="personal_txtMilitarySer")
  public WebElement militaryService;

  @FindBy(id = "personal_txtLicExpDate")
  public WebElement calenderExpiryIcon;

  @FindBy(className ="ui-datepicker-month")
  public WebElement monthClick;

  @FindBy(className = "ui-datepicker-year")
  public WebElement yearClick;

  @FindBy(xpath = "//a[text() = '2']")
   public WebElement date;

  @FindBy(id="personal_DOB")
  public WebElement dob;

    @FindBy(xpath = "//a[text() = '6']")
    public WebElement dobDate;

    @FindBy(id="personal_cmbMarital")
    public WebElement maritalStatus;

    @FindBy(id="personal_cmbNation")
    public WebElement nationality;

    @FindBy(id="personal_chkSmokeFlag")
    public WebElement smoker;

    @FindBy(id ="personal_optGender_2")
    public WebElement gender;
    public AddEmployeePage(){
        PageFactory.initElements(driver, this);
    }

}

