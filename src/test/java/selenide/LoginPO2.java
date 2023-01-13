package selenide;

import static com.codeborne.selenide.Selenide.$;

public class LoginPO2 {

  public void loginWithPassportAndCard(String card, String password) {

  }

  public HomePO loginWithUsernameAndPassword(String username, String password) {
    $("#username").setValue(username);
    $("#password").setValue(password);
    $("#submit-btn").click();
    return new HomePO();
  }


}
