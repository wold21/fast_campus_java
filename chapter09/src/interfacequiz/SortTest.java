package interfacequiz;

import java.io.IOException;

public class SortTest {
    public static void main(String[] args) throws IOException {
        System.out.println("정렬방식을 선택하세요.");
        System.out.println("B : BubbleSort");
        System.out.println("H : HeaSort");
        System.out.println("Q : QuickSort");
        int select = System.in.read();
        // System.in.read(); -> data를 아스키코드로 입력받음.(문자 하나만 가능.)
        // 그래서 int 타입인것. 이후 사용할 때 적절히 캐스팅 필요.
        // 예외처리를 해줘야함.
        Sort sort = null;
        if (select == 'B' || select == 'b') {
            sort = new BubbleSort();
        } else if (select == 'H' || select == 'h') {
            sort = new HeaSort();
        } else if (select == 'Q' || select == 'q') {
            sort = new QuickSort();
        } else {
            System.out.println("잘못된 값을 입력하셨습니다.");
            return;
        }
        int[] arr = new int[10];
        sort.ascending(arr);
        sort.decending(arr);
        sort.description();
    }

}
