package thisex;

public class PersonTest {
    public static void main(String[] args) {
        Person personNoname = new Person();

        personNoname.showInfo();

        Person personNoname01 = new Person("Lee", 20);
        personNoname01.showInfo();
        System.out.println(personNoname01);

        Person p = personNoname01.getSelf();
        System.out.println(p);
    }

}
