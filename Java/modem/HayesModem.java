package Java.modem;

public class HayesModem implements Modem {
  @Override
  public void logOn(String user, String password) {
    System.out.println("Logon to hayes");
  }

  @Override
  public void sendData(String data) {
    System.out.println("Send to hayes");
  }
}
