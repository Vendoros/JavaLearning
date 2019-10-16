package dataBase;

class Client extends User {

    Client() {
        super();
    }

    Client(String name) {
        super(name);
    }

    Client(String name, Sex sex) {
        super(name,sex);
    }

    Client(String name, Sex sex, String email){
        super(name,sex,email);
    }

    Client(String name, Sex sex, String email, String phone){
        super(name, sex, email, phone);
    }




}
