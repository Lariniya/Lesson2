package svetlana.company;

public class MobilePhone {

    private boolean isSoldOut;
    private String producer;

    public MobilePhone(String producer) {
        this.isSoldOut = false;
        this.producer = producer; //телефон определенного производителя по-умолчанию не продан и лежит в магазине
    }

    public boolean turnOnOff(){
        isSoldOut = !isSoldOut;
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
                "isSoldOut=" + isSoldOut +
                ", producer='" + producer + '\'' +
                '}';
    }
}
