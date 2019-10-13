package Kata.kyu8.basicSubclasses;

public class God {
    public static Human[] create(){
        Man adam = new Man("adam", 25, 100);
        Woman eve = new Woman("eve", 25, 100);

        Human[] array = {adam, eve};
        return array;
    }
}

abstract class Human{
    private String name;
    private int age;

    public Human(String n, int a){
        name = n;
        age = a;
    }
}

class Man extends Human{
    private int strength;

    public Man(String n, int a, int s){
        super(n, a);
        strength = s;
    }
}

class Woman extends Human{
    private int love;

    public Woman (String n, int a, int l){
        super(n, a);
        love = l;
    }
}

