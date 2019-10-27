package dataBase;

import org.jetbrains.annotations.Contract;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

//@SuppressWarnings({"unused"})
abstract class User {

    private int id;
    private String name;
    private Sex sex;
    private String email;
    private String phone;
    private static final AtomicInteger COUNTER = new AtomicInteger(1);
    private static Map<Integer, jUnitTest.User> allUsers = new HashMap<>();//мапа для хранения пользователей


    private String getEmail() {
        return email;
    }

    private String getPhone() {
        return phone;
    }

    void getInfo() {
        System.out.printf("ID:%3d %9s %6s %18s %19s\n", this.id, this.getName(), this.getSex(), this.email, this.phone);
    }

    private String getSex() {
        try {
            return sex.toString();
        } catch (NullPointerException e) {
            sex = Sex.UNDEFINED;
            return sex.toString();
        }
    }

    private int getId() {
        return id;
    }

    private String getName() {
        if (name == null) {
            name = "Unnamed";
        }
        return name;
    }

    protected void setEmail(String email) {
        // TODO: 16.10.2019 проверка email на валидность
        this.email = email;
    }

    protected void setPhone(String phone) {
        // TODO: 16.10.2019 проверка phone на валидность
        this.phone = phone;
    }

    protected void setSex(Sex sex) {
        this.sex = sex;
    }

    protected void setName(String name) {
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

    User(String name, Sex sex, String email) {
        this.id = COUNTER.getAndIncrement();
        this.name = name;
        this.sex = sex;
        this.email = email;
    }

    User(String name, Sex sex, String email, String phone) {
        this.id = COUNTER.getAndIncrement();
        this.name = name;
        this.sex = sex;
        this.email = email;
        this.phone = phone;
    }

}
