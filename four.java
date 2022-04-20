import java.util.Scanner;
public class four {
    public static void main(String[] args) {
        String s1 , s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть 1 ім'я: ");
        s1= sc.nextLine();
        System.out.println("Введіть 2 ім'я: ");
        s2 = sc.nextLine();
        System.out.println();
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Перше і друге ім'я ідентичні ");
        }
        else {
            System.out.println("Імена різні");
        }
    }
}
