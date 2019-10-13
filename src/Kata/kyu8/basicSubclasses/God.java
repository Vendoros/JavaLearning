package Kata.kyu8.basicSubclasses;

public class God {
    public static Human[] create() {
        Man adam = new Man("adam", 25, 100);
        Woman eve = new Woman("eve", 25, 100);

        Human[] array = {adam, eve};
        return array;
    }
}

abstract class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Man extends Human {
    private int strength;

    public Man(String name, int age, int strength) {
        super(name, age);
        this.strength = strength;
    }
}

class Woman extends Human {
    private int love;

    public Woman(String name, int age, int love) {
        super(name, age);
        this.love = love;
    }
}

