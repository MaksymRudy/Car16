public class Main {
    public static void main(String[] args) {

        Car Sab1 = new Car();
        Car Sab2 = new Car();

        System.out.println(Sab1.getAge());
        System.out.println(Sab1.calculateIndex());
        System.out.println(Sab2.power);
        System.out.println(Sab2.upgradePower(100));
        System.out.println(Sab2.calculateIndex());

    }
}