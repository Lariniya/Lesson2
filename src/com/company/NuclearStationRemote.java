package com.company;

public class NuclearStationRemote extends Remote {

    private long energy;

    public NuclearStationRemote(long serialNumber) {
        super(serialNumber);
        energy = serialNumber * 2;
    }

    @Override
    public String toString() {
        return "Я пульт от ядерной станции. Ваша станция содержит" + energy
                + "энергии";
    }

    @Override
    public boolean turnOnOff() {
        System.out.println("Меня нельзя выключить с пульта, пожалуйста, " +
                "позвоните в техподдержку 88855667766");
        return false;
    }
}
