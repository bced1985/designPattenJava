package com.chrisweb.designpatterns.factory.exemple1;

public class ComputerFactory {

    public static Computer getComputer(String type) {
        switch (type) {
            case "pc" :
                return new Pc("8Go", "1 To SATA", "2.3 Ghz");
            case "gamer" :
                return new PCGamer("32Go", "2To SSd", "4.0 Gh");
            case "server" :
                return new Pc("128Go", "8To SDD", "600.3 Ghz");
            case "imaginaire" :
                return new PcImaginaire("1To", "100 To SSD", "24.0 Ghz");
            default:
                //return null;
                throw new IllegalArgumentException("Ce type de PC n'existe pas encore");
        }
    }
}
