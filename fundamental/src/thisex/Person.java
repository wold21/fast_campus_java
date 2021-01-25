package thisex;

public class Person {
    String name;
    int age;

    public Person() {
        this("이름없음", 15);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.println(name + "," + age + "입니다.");
    }

    public Person getSelf() {
        return this;
    }
}
