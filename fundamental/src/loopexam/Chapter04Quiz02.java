package loopexam;

import java.util.Scanner;

public class Chapter04Quiz02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("홀수를 입력해주세요.");

        int lineCount = sc.nextInt();
        int spaceCount = lineCount / 2 + 1;
        int starCount = 1;
        sc.close();

        for (int i = 0; i < lineCount; i++) {
            for (int j = 0; j < spaceCount; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < starCount; j++) {
                System.out.print('*');
            }
            for (int j = 0; j < spaceCount; j++) {
                System.out.print(' ');
            }
            if (i < lineCount / 2) {
                spaceCount -= 1;
                starCount += 2;
            } else {
                spaceCount += 1;
                starCount -= 2;
            }
            System.out.println();
        }

    }

}
