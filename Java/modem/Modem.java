package Java.modem;

public interface Modem {
  public void logOn(String user, String password);
  public void sendData(String data);
}
