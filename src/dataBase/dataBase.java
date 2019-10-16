package dataBase;

public class dataBase {
    public static void main(String... args) {
        Client cl = new Client("ada", Sex.FEMALE, "qwerty@mail.com", "+7(999)123-45-67");
        cl.getInfo();
        Trader tr = new Trader("kain", Sex.MALE, null, null);
        tr.getInfo();

        System.out.println(cl.getId() + " " + cl.getName() + " " + cl.getSex() + " " + cl.getEmail() + " " + cl.getPhone());
        System.out.println(tr.getId() + " " + tr.getName() + " " + tr.getSex() + " " + tr.getEmail() + " " + tr.getPhone());

    }
}
