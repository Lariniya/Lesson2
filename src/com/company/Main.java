package com.company;

public class Main {

    public static void main(String[] args) {

        demoEqualsAndHashCode();

        demoEncapsulation();

        demoPublicAndPrivate();
    }

    private static void demoPublicAndPrivate() {
        System.out.println("пульт от кондея");
        ClimatControlRemote climatControlRemote = new ClimatControlRemote(123);
        climatControlRemote.setTemperature(-5);
        climatControlRemote.setTemperature(23);

        System.out.println("а давайте выключим или включим атомную станцию");
        NuclearStationRemote remoteNuclear = new NuclearStationRemote(321);
        remoteNuclear.turnOnOff();
    }

    private static void demoEncapsulation() {
        Remote remote1 = new ClimatControlRemote(444);
        System.out.println(remote1.toString());
        System.out.println("Влючаем кондей");
        remote1.turnOnOff();
        System.out.println(remote1.toString());

        Remote remote2 = new NuclearStationRemote(123);
        Remote[] remotesArray = new Remote[2];
        remotesArray[0] = remote1;
        remotesArray[1] = remote2;

        System.out.println("демонстрирую полиморфизм");
        for(int remoteNumber = 0; remoteNumber < remotesArray.length; remoteNumber ++){
            System.out.println(remotesArray[remoteNumber].toString());
        }
    }

    private static void demoEqualsAndHashCode() {
        Remote remote1 = new ClimatControlRemote(123);
        Remote remote2 = new ClimatControlRemote(123);
        Remote remote3 = new ClimatControlRemote(42);

        System.out.println("Сравниваю с помощью equals");
        System.out.println(remote1.equals(remote2));
        System.out.println("Сравниваю с помощью ==");
        System.out.println(remote1 == remote2);
        System.out.println("Хэш коды");
        System.out.println(remote1.hashCode() + " " + remote2.hashCode() + " " + remote3.hashCode());
    }
}
