package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {
    public static void main(String[] args)
            throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException,
            SecurityException, IllegalArgumentException, InvocationTargetException {

        Person person = new Person("James");
        System.out.println(person);

        // 디폴트 생성자.
        Class c1 = Class.forName("classex.Person");
        Person person1 = (Person) c1.newInstance();
        System.out.println(person1);

        // 파라미터가 있는 생성자
        Class[] parameterTypes = { String.class };
        Constructor cons = c1.getConstructor(parameterTypes);
        Object[] initargs = { "김유신" };

        Person personlee = (Person) cons.newInstance(initargs);
        System.out.println(personlee);
    }

}
