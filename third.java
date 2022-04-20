import java.util.Scanner;
public class third {
    public static void main(String[] args) {
        double a, b, v, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть 1 дробове число: ");
        if (sc.hasNextDouble()) {
            a = sc.nextDouble();
            System.out.print("Введіть 2 дробове число: ");
            if (sc.hasNextDouble()) {
                b = sc.nextDouble();
                System.out.print("Введіть 3 дробове число: ");
                if (sc.hasNextDouble()) {
                    v = sc.nextDouble();
                    if (a >= b && a >= v) {
                        c = a;
                    } else if (b >= a && b >= v) {
                        c = b;
                    } else {
                        c = v;
                    }
                    System.out.println(c);
                } else {
                    System.out.println("Не дробове число");
                }
            } else {
                System.out.println("Не дробове число");
            }
        } else {
            System.out.println("Не дробове число");
        }
    }

    }

