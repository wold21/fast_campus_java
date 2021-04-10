package ch07;

import java.util.Calendar;

public class CompanyTest {
    public static void main(String[] args) {

        // static일 경우 클래스 이름으로 접근함.
        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();

        System.out.println(company1);
        System.out.println(company2);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
    }
}
