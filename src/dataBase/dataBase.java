package dataBase;

public class dataBase {


    public static void main(String... args) {

        user user1 = new user();
        user1.setName("Adam");
        user1.setSex(sex.MALE);
        user user2 = new user("Eva", sex.FEMALE);
        user user3 = new user("Cain");
        user3.setSex(sex.MALE);
        user user4 = new user();


        user.getInfo(user1);
        user.getInfo(user2);
        user.getInfo(user3);
        user.getInfo(user4);
    }
}
