package com.company;

public class ClimatControlRemote extends Remote {

    private int temperature;

    public ClimatControlRemote(long serialNumber) {
        super(serialNumber);
        temperature = 21;
    }

    @Override
    public String toString() {
        return "Я контролирую климат";
    }

    public boolean setTemperature(int newTemperature) {
        if(validateTemperature(newTemperature)) {
            this.temperature = newTemperature;
            return true;
        }
        return false;
    }

    private boolean validateTemperature(int temperature) {
        if(temperature>30){
            System.out.println("Будет слишком жарко");
            return false;
        }

        if(temperature<10){
            System.out.println("ай эм нот холодильник");
            return false;
        }
        else return true;
    }
}
