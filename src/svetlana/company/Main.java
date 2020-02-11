package svetlana.company;


public class Main {

    public static void main(String[] args) {

        demoPublicAndPrivate();

    }

    private static void demoPublicAndPrivate() {
        System.out.println("Новый айфончик умеет много фоткать");
        iPhone iphone = new iPhone("USA");
        iphone.createPhoto(4);
        iphone.createPhoto(25);

        System.out.println("Давайте посмотрим Ксаоми! Какой дешевый телефон!");
        Xiaomi xiaomi = new Xiaomi("China", 20000);
        xiaomi.turnOnOff();
    }

}
