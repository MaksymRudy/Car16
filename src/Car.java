public class Car {
    int age = 0;
    int power = 100;
    int turbo = 50;

    int getAge() {
        return age;
    }

    int calculateIndex() {
        return power*10+turbo;
    }

    int upgradePower(int newPower) {
        power = power + newPower;
        return power;
    }

}
