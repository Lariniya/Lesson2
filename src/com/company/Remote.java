package com.company;

public class Remote { // у нас есть пульт от чего-либо

    private boolean isOn; // переменная для обозначения состояния устройства, которым управляет пульт
    private long serialNumber; //серийный номер пульта

    public Remote(long serialNumber) {
        this.isOn = false;
        this.serialNumber = serialNumber; // пульт с определенным серийным номером, по-умолчанию устройтво выключено
    }

    public boolean turnOnOff(){
        isOn = !isOn;
        return true; // метод включает или выключает устройство и возвращает true, что он отработал
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Remote remote = (Remote) o;

        return serialNumber == remote.serialNumber;
    }

    @Override
    public int hashCode() {
        return (int) (serialNumber ^ (serialNumber >>> 32));
    }

    @Override
    public String toString() {
        return "Remote{" +
                "isOn=" + isOn +
                ", serialNumber=" + serialNumber +
                '}';
    }
}
