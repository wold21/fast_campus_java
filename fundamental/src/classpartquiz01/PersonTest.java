package classpartquiz01;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();

        person.age = 40;
        person.name = "James";
        person.isMarried = true;
        person.numberOfChild = 3;

        System.out.println("Age: " + person.age);
        System.out.println("Name: " + person.name);
        System.out.println("Married: " + person.isMarried);
        System.out.println("have child? " + person.numberOfChild);
    }

}
