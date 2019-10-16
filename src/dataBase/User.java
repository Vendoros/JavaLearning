package dataBase;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

//@SuppressWarnings("ALL")
abstract class User {

    private int id;
    private String name;
    private Sex sex;
    private String email;
    private String phone;
    private static final AtomicInteger COUNTER = new AtomicInteger(1);
    private static Map<Integer, jUnitTest.User> allUsers= new HashMap<>();//мапа для хранения пользователей


    String getEmail(){
        return email;
    }

    String getPhone(){
        return phone;
    }

    void getInfo() {
        System.out.printf("ID:%3d %9s %6s %18s %19s\n", this.id, this.getName(), this.getSex(), this.email, this.phone);
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

    void setEmail(){
        // TODO: 16.10.2019 проверка мыла на валидность
    }

    void setPhone(){
        // TODO: 16.10.2019 проверка ноомера телефона
    }

    void setSex(Sex sex) {
        this.sex = sex;
    }

    void setName(String name) {
        this.name = name;
    }

    //constructors
    User() {
        this.id = COUNTER.getAndIncrement();
    }

    User(String name) {
        this.id = COUNTER.getAndIncrement();
        this.name = name;
    }

    User(String name, Sex sex) {
        this.id = COUNTER.getAndIncrement();
        this.name = name;
        this.sex = sex;
    }

    User(String name, Sex sex, String email){
        this.id = COUNTER.getAndIncrement();
        this.name = name;
        this.sex = sex;
        this.email = email;
    }

    User(String name, Sex sex, String email, String phone){
        this.id = COUNTER.getAndIncrement();
        this.name = name;
        this.sex = sex;
        this.email = email;
        this.phone = phone;
    }

}
