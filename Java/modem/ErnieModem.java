package Java.modem;

public class ErnieModem implements Modem {
  @Override
  public void logOn(String user, String password) {
    System.out.println("Logon to ernie");
  }

  @Override
  public void sendData(String data) {
    System.out.println("Send to ernie");
  }
}
