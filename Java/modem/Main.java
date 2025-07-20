package Java.modem;

public class Main {
  public static void main(String[] args) {
    Modem modem1 = ModemFactory.createModem("hayes");
    Modem modem2 = ModemFactory.createModem("courrier");
    Modem modem3 = ModemFactory.createModem("ernie");

    System.out.println(modem1.getClass().getSimpleName());
    System.out.println(modem2.getClass().getSimpleName());
    System.out.println(modem3.getClass().getSimpleName());
  }
}
