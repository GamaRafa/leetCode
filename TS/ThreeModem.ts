// class Modem {
//   static readonly MODEM_TYPE_HAYES = 'hayes';
//   static readonly MODEM_TYPE_COURRIER = 'courrier';
//   static readonly MODEM_TYPE_ERNIE = 'ernie';
 
//   private type: string;
 
//   constructor(modemType: string) {
//     this.type = modemType;
//   }
 
//   logOn(user: string, password: string): void {
//     if (this.type === Modem.MODEM_TYPE_COURRIER) {
//       console.log('Logon in courrier');
//     } else if (this.type === Modem.MODEM_TYPE_ERNIE) {
//       console.log('Logon in ernie');
//     } else if (this.type === Modem.MODEM_TYPE_HAYES) {
//       console.log('Logon in hayes');
//     }
//   }
 
//   send(data: string): void {
//     if (this.type === Modem.MODEM_TYPE_COURRIER) {
//       console.log('Send to courrier');
//     } else if (this.type === Modem.MODEM_TYPE_ERNIE) {
//       console.log('Send to ernie');
//     } else if (this.type === Modem.MODEM_TYPE_HAYES) {
//       console.log('Send to hayes');
//     }
//   }
// }

interface Modem {
  logOn(user: string, password: string): void;
  sendData(data: string): void;
}

class HayesModem implements Modem {
  logOn(user: string, password: string): void {
      console.log("Logon to hayes");
  }

  sendData(data: string): void {
      console.log('Send to hayes');
  }
}

class ErnieModem implements Modem {
  logOn(user: string, password: string): void {
      console.log("Logon to ernie");
  }

  sendData(data: string): void {
      console.log('Send to ernie');
  }
}

class CourrierModem implements Modem {
  logOn(user: string, password: string): void {
      console.log("Logon to courrier");
  }

  sendData(data: string): void {
      console.log('Send to courrier');
  }
}

class ModemFactory {
  static createModem(type: string) {
    switch (type.toLowerCase()) {
      case 'hayes':
        return new HayesModem();
      case 'courrier':
        return new CourrierModem();
      case 'ernie':
        return new ErnieModem();
      default:
        throw new Error(`Unknown modem type: ${type}`);
    }
  }
}

const modem: Modem = ModemFactory.createModem('hayes');