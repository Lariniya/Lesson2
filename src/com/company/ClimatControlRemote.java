package com.company;

public class ClimatControlRemote extends Remote {

    public ClimatControlRemote(long serialNumber) {
        super(serialNumber); //идея требует такой же конструктор, как в классе-родителе. Создан автоматически. Слово super появилось автоматически, чтобы не писать много
    } // isOn и serialNumber - приватные переменные, мы не можем их изменять и упоминать в этом классе. Можем только методы использовать
}
