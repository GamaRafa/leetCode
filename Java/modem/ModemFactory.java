package Java.modem;

public class ModemFactory {
  public static Modem createModem(String type) {
    switch (type.toLowerCase()) {
      case "hayes":
        return new HayesModem();
      case "courrier":
        return new CourrierModem();
      case "ernie":
        return new ErnieModem();
      default:
        throw new Error("Unknown modem type: " + type);
    }
  }
}
