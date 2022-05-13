package youngCalendar;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) { //nextInt or 문자열로 받은걸 parseInt로 변환
        int a, b;
        String s1, s2;
        System.out.println("두 수를 입력하세요");
        Scanner sc = new Scanner(System.in);
        s1 = sc.next();
        s2 = sc.next();
        a = Integer.parseInt(s1);
        b = Integer.parseInt(s2);
        //int c = a + b;
        System.out.println("정답은 " +a+b);
    }
}

