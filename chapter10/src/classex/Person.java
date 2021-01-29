package classex;

public class Person {
    private String name;
    private int age;

    public Person() {
    };

    public String getName() {
        return this.name;
    }

    public Person(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public Person(int age) {
        this.age = age;
    }

    public String toString() {
        return name;
    }

}
