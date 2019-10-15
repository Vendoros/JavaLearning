package dataBase;

import java.util.concurrent.atomic.AtomicInteger;

class user {

    private int id;
    private String name;
    private sex sex;
    private static final AtomicInteger COUNTER = new AtomicInteger(1);

    void getInfo(user user) {
        System.out.printf("ID:%3d %9s %6s\n", user.id, user.getName(), user.getSex());
    }

    String getSex() {
        try {
            return sex.toString();
        } catch (NullPointerException e) {
            sex = sex.UNDEFINED;
            return sex.toString();
        }
    }

    int getId() {
        return id;
    }

    String getName() {
        if (name == null) {
            name = "Unnamed";
        }
        return name;
    }

    void setSex(sex sex) {
        this.sex = sex;
    }

    void setName(String name) {
        this.name = name;
    }

    //constructors
    user() {
        this.id = COUNTER.getAndIncrement();
    }

    user(String name) {
        this.id = COUNTER.getAndIncrement();
        this.name = name;
    }

    user(String name, sex sex) {
        this.id = COUNTER.getAndIncrement();
        this.name = name;
        this.sex = sex;
    }

}
