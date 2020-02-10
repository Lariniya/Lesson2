package svetlana.company;

public class MobilePhone {

    private boolean isOn;
    private String producer;

    public MobilePhone(String producer) {
        this.isOn = false;
        this.producer = producer; //телефон определенного производителя по-умолчанию выключен
    }

    public boolean turnOnOff(){
        isOn = !isOn;
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MobilePhone that = (MobilePhone) o;

        return producer != null ? producer.equals(that.producer) : that.producer == null;
    }

    @Override
    public int hashCode() {
        return producer != null ? producer.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "isSoldOut=" + isOn +
                ", producer='" + producer + '\'' +
                '}';
    }
}
