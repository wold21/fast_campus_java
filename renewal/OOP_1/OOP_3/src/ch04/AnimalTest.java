package ch04;

import java.util.ArrayList;

class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal {
    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void readBook() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {
    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 걷습니다.");
    }

    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Hawk extends Animal {
    @Override
    public void move() {
        System.out.println("독수리가 하늘을 날아다닙니다.");
    }

    public void flying() {
        System.out.println("독수리가 양날개를 쭉 펴고 날아오릅니다.");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal human = new Human();
        Animal tiger = new Tiger();
        Animal hawk = new Hawk();

        // AnimalTest test = new AnimalTest();
        // test.moveAnimal(human);
        // test.moveAnimal(tiger);
        // test.moveAnimal(hawk);

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(human);
        animalList.add(tiger);
        animalList.add(hawk);

        for (Animal animal : animalList) {
            animal.move();
        }
    }

    // 어떤 인스턴스가 들어가느냐에 따라 무브의 내용이 달라진다.
    // 이것이 다형성이다.
    // 상속, 인터페이스, 오버라이드, 형변환
    public void moveAnimal(Animal animal) {
        animal.move();
    }
}
