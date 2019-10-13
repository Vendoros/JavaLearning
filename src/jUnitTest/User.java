package jUnitTest;

import java.util.*;

public class User {
    private int id;//id обьекта
    private String name;//имя
    private int age;//возраст
    private Sex sex;//пол
    private static Map<Integer, User> allUsers= new HashMap<>();//мапа для хранения пользователей
    private static int countId = 0;//счетчик пользователей

    //==================================================================================================================
    public int getId(int id) {
        return this.id = id;
    }

    public String getName(String name) {
        return this.name = name;
    }

    public int getAge(int age) {
        return this.age = age;
    }

    public Sex getSex(Sex sex) {
        return this.sex = sex;
    }

    //==================================================================================================================

    //
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;//если экземпляр класса равен экземпляру обьекта о вернуть true
        if (o == null || getClass() != o.getClass()) return false;//если обьекта о пуст или тип обьекта не равен экземпляру обьекта о вернуть false
        User user = (User) o; //иначе, создаем экземпляр обьекта user и приводим тип обьекта о к виду user
        return age == user.age && // возвращем age из экземпляра обьекта user
                Objects.equals(name, user.name) &&// сравниваем name данного класса с name экземпляра класса user
                sex == user.sex;//
    }

    //
    @Override
    public int hashCode() {

        return Objects.hash(name, age, sex);
    }

    //
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    //
    private boolean hasUser() {
        for (User user : allUsers.values()) {
            if (user.equals(this) && user.hashCode() == this.hashCode()) {
                return true;
            }
        }
        return false;
    }

    //
    public User(String name, int age, Sex sex) {
        if (name != null && !name.isEmpty() && age > 0 && sex != null){
            this.name = name;
            this.age = age;
            this.sex = sex;

            if (!hasUser()) {
                countId++;
                this.id = countId;
                allUsers.put(id, this);
            }
        }
    }

    //формирует список пользователей
    public static List<User> getAllUsers(){
        return new ArrayList<>(allUsers.values());
    }

    //формирует список пользователей по полу
    public static List<User> getAllUsers(Sex sex){
        List<User> listAllUsers = new ArrayList<>();
        for (User user : allUsers.values()){
            if (user.sex == sex){
                listAllUsers.add(user);
            }
        }
        return listAllUsers;
    }

    //возвращает кол-во пользователей в общем списке
    public static int getHowManyUsers(){
        return allUsers.size();
    }

    //возвращает кол-во пользователей в общем списке по половому признаку
    public static int getHowManyUsers(Sex sex){
        return getAllUsers(sex).size();
    }

    //Посчитать общую сумму по возрасту пользователей
    public static int getAllAgeUsers(){
        int countAge = 0;
        for (User user : allUsers.values()){
            countAge += user.age;
        }
        return countAge;
    }

    //Посчитать общую сумму по возрасту пользователей с разделением по половому признаку
    public static int getAllAgeUsers(Sex sex){
        int countAge = 0;
        for (User user : getAllUsers(sex)){
            countAge += user.age;
        }
        return countAge;
    }

    //Считаем средний возраст
    public static int getAverageAgeOfAllUsers(){
        return getAllAgeUsers() / getHowManyUsers();
    }

    //Считаем средний возраст с разделением по половому призаку
    public static int getAverageAgeOfAllUsers(Sex sex){
        return getAllAgeUsers(sex) / getHowManyUsers(sex);
    }

}
