package youngCalendar;

import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        System.out.println("Hello, Calendar");
        System.out.println(
                "일 월  화  수  목 금  토 \n" +
                        "--------------------\n" +
                        "1  2  3  4  5  6  7 \n" +
                        "8  9  10 11 12 13 14 \n" +
                        "15 16 17 18 19 20 21 \n" +
                        "22 23 24 25 26 27 28"
        );

        //월입력 -> 며칠
        Scanner sc = new Scanner(System.in);
        int[] arr_month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int m = sc.nextInt();
        System.out.println("달을 입력하세요.");
        System.out.printf("%d월은 %d일까지 있습니다.\n", m, arr_month[m-1]);

    }

}


