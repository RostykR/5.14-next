import java.util.Scanner;
public class fifth {
    public static void main(String[] args) {
        String s1, s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть 1 рядок: ");
        s1 = sc.nextLine();
        System.out.println("Введіть 2 рядок: ");
        s2 = sc.nextLine();
        System.out.println();
        if (s1.length() == s2.length()) {
            System.out.println(" 1 і 2 рядки рівні ");
        } else if (s1.length() > s2.length()) {
            System.out.println("Найбільший рядок 1 : " + s1);
        } else {
            System.out.println("Найбільший рядок 2 : " + s2);
        }
    }
}
