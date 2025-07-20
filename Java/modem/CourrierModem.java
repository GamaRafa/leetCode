package Java.modem;

public class CourrierModem implements Modem {
  @Override
  public void logOn(String user, String password) {
    System.out.println("Logon to courrier");
  }

  @Override
  public void sendData(String data) {
    System.out.println("Send to courrier");
  }
}
