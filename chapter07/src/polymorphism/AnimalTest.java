package polymorphism;

import java.util.ArrayList;

class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}

class Human extends Animal {
    public void move() {
        System.out.println("사람이 움직입니다.");
    }

    public void readBooks() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {
    public void move() {
        System.out.println("호랑이가 네발로 뜁니다.");
    }

    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eagle extends Animal {
    public void move() {
        System.out.println("독수리가 땅에 내려와 걷습니다.");
    }

    public void flying() {
        System.out.println("독수리가 날개를 쭉펴고 날아오릅니다.");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        // // 방법 1
        // Human human = (Human) hAnimal;
        // human.readBooks();

        // // 방법 1의 오류형태
        // Eagle human = (Eagle) hAnimal; // 컴파일에러가 나지 않음.

        // // 이런 휴먼오류를 방지하기위해 instanceof를 사용해야한다.
        // // 안정적인 형번환
        // if (hAnimal instanceof Human) {
        // Human human = (Human) hAnimal;
        // human.readBooks();
        // }

        // AnimalTest test = new AnimalTest();
        // test.moveAnimal(hAnimal);
        // test.moveAnimal(tAnimal);
        // test.moveAnimal(eAnimal);

        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);
        AnimalTest test = new AnimalTest();
        test.testDownCasting(animalList);

        // // 이것도 다형성이다.
        // for (Animal animal : animalList) {
        // animal.move();
        // }
    }

    public void testDownCasting(ArrayList<Animal> list) {
        for (int i = 0; i < list.size(); i++) {
            Animal animal = list.get(i);
            if (animal instanceof Human) {
                Human human = (Human) animal;
                human.readBooks();
            } else if (animal instanceof Tiger) {
                Tiger tiger = (Tiger) animal;
                tiger.hunting();
            } else if (animal instanceof Eagle) {
                Eagle eagle = (Eagle) animal;
                eagle.flying();
            } else {
                System.out.println("Error");
            }
        }
    }

    // 다형성을 구현한 코드 한줄로 각 클래스의 move()를
    // 실행할 수 있고 클래스에 따른 다양한 결과를 받을 수 있다.
    public void moveAnimal(Animal animal) {
        animal.move();
    }

}
