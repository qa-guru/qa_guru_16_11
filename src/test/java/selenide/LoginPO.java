package selenide;

import static com.codeborne.selenide.Selenide.$;

public class LoginPO {

  public void loginWithPassportAndCard(String card, String password) {

  }

  public void loginWithUsernameAndPassword(String username, String password) {
    $("#username").setValue(username);
    $("#password").setValue(password);
    $("#submit-btn").click();
  }


}
