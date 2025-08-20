class Appliance {
    void turnOn() {
        System.out.println("Appliance is now ON.");
    }

    void turnOff() {
        System.out.println("Appliance is now OFF.");
    }
}

class WashingMachine extends Appliance {
    void washClothes() {
        System.out.println("Washing machine is washing clothes.");
    }
}

class Refrigerator extends Appliance {
    void keepCool() {
        System.out.println("Refrigerator is keeping food cool.");
    }
}

class Microwave extends Appliance {
    void heatFood() {
        System.out.println("Microwave is heating food.");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        Refrigerator fridge = new Refrigerator();
        Microwave oven = new Microwave();

        wm.turnOn();
        wm.washClothes();
        wm.turnOff();

        fridge.turnOn();
        fridge.keepCool();
        fridge.turnOff();

        oven.turnOn();
        oven.heatFood();
        oven.turnOff();
    }
}
