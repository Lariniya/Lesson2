package com.company;

public class Main {

    public static void main(String[] args) {

        //demoEqualsAndHashCode();

        Remote remote = new ClimatControlRemote(444);
        System.out.println(remote.toString());
        System.out.println("Влючаем кондей");
        remote.turnOnOff();
        System.out.println(remote.toString());
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