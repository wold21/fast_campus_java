package streamquiz;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {
    public static void main(String[] args) {
        TravelCustomer lee = new TravelCustomer("lee", 35, 100);
        TravelCustomer kim = new TravelCustomer("kim", 27, 100);
        TravelCustomer hong = new TravelCustomer("hong", 12, 50);

        List<TravelCustomer> cList = new ArrayList<TravelCustomer>();
        cList.add(lee);
        cList.add(kim);
        cList.add(hong);

        // System.out.println(cList);

        cList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));

        int total = cList.stream().mapToInt(c -> c.getPrice()).sum();
        System.out.println(total);

        cList.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));
        cList.stream().filter(c -> c.getAge() <= 20).forEach(s -> System.out.println(s));
    }

}
