package dataBase;

public class Trader extends User {

    Trader(){
        super();
    }

    Trader(String name){
        super(name);
    }

    Trader(String name, Sex sex){
        super(name,sex);
    }

    Trader(String name, Sex sex, String email){
        super(name, sex, email);
    }

    Trader(String name, Sex sex, String email, String phone){
        super(name, sex, email, phone);
    }


}
