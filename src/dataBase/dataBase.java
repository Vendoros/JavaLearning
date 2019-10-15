package dataBase;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class dataBase {
    public static void main(String... args) {

        user user1 = new user();
        user1.setName("Adam");
        user1.setSex(sex.MALE);
        user user2 = new user("Eva", sex.FEMALE);
        user user3 = new user("Cain");
        user3.setSex(sex.MALE);
        user user4 = new user();

        ArrayList<user> arr = new ArrayList<user>();
        arr.add(user1);
        arr.add(user2);
        arr.add(user3);
        arr.add(user4);

        for (user user : arr){
            new user().getInfo(user);
        }
    }
}
