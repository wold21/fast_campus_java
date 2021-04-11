package ch06;

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

        AnimalTest test = new AnimalTest();
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
        test.testDownCasting(animalList);
    }

    public void testDownCasting(ArrayList<Animal> animalList) {
        for (int i = 0; i < animalList.size(); i++) {
            Animal animal = animalList.get(i);

            if (animal instanceof Human) {
                Human human = (Human) animal;
                human.readBook();
            } else if (animal instanceof Tiger) {
                Tiger tiger = (Tiger) animal;
                tiger.hunting();
            } else if (animal instanceof Hawk) {
                Hawk hawk = (Hawk) animal;
                hawk.flying();
            } else {
                System.out.println("Unsupported Type");
            }
        }
    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }
}
