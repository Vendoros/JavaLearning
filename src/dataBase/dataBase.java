package dataBase;

public class dataBase {
    public static void main(String... args) {
        Client cl = new Client("ada", Sex.FEMALE, "qwerty@mail.com", "+7(999) 123-45-67");
        cl.getInfo();
        Trader tr1 = new Trader("kain", Sex.MALE, null, null);
        tr1.getInfo();
        Trader tr2 = new Trader();
        tr2.getInfo();

    }
}
