import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        String str ="";
        System.out.print("Введите переменную a");
        if (sc.hasNextInt()) {
            a = sc.nextInt();
            int b = 3;
            int c = a % b;
            if (c == 0) {
                System.out.print("Число a делится на 3 без остатка");
            } else {
                System.out.println("Число a не делится на 3 без остатка");
            }
        }
        else {
            str = sc.next();
            System.out.print("Неверный тип данных: "+str);
        }
    }
}