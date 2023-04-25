
import java.util.Scanner;

//Реализовать простой калькулятор
public class task_3 {
    static int calc(int a, String o, int b){
        if(o.equals("+")) return a + b;
        if(o.equals("-")) return a - b;
        if(o.equals("*")) return a * b;
        if(o.equals("/")) return a / b;
        return 0;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите a: ");
        int a = scan.nextInt();
        System.out.print("Введите знак: ");
        String o = scan.next();
        System.out.print("Введите b: ");
        int b = scan.nextInt();
        System.out.printf("%d %s %d = %d", a, o, b, calc(a, o, b));
    }
}

