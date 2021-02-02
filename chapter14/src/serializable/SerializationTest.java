package serializable;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
    // implements Externalizable
    // 직접 읽고 쓰는 것을 구현하는 인터페이스

    String name;
    String job;
    // transient String job; // 이 변수는 serialization하지말라는 표기.

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public String toString() {
        return name + ", " + job;
    }
}

public class SerializationTest {
    public static void main(String[] args) {
        Person lee = new Person("lee", "선생님");
        Person kim = new Person("kim", "엔지니어");

        try (FileOutputStream fos = new FileOutputStream("serial.dat");
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(lee);
            oos.writeObject(kim);
        } catch (IOException e) {
            System.out.println(e);
        }

        try (FileInputStream fis = new FileInputStream("serial.dat");
                ObjectInputStream ois = new ObjectInputStream(fis)) {

            Person p1 = (Person) ois.readObject();
            Person p2 = (Person) ois.readObject();
            System.out.println(p1);
            System.out.println(p2);

        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }

}
