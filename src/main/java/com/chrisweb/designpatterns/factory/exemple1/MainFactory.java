package com.chrisweb.designpatterns.factory.exemple1;

public class MainFactory {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc");
        System.out.println("Ma configuration PC : " + pc);

        Computer server = ComputerFactory.getComputer("server");
        System.out.println("Ma configuration SERVER : " + server);

        /*Computer introuvable = ComputerFactory.getComputer("introuvable");
        System.out.println("Ma configuration INTROUVABLE : " + introuvable);*/

        Computer imaginaire = ComputerFactory.getComputer("imaginaire");
        System.out.println("Ma configuration IMAGINAIRE : " + imaginaire);
    }
}
