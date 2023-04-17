import java.util.Scanner;

public class task_1 {

    static int factorial(int n){
        if(n == 0){
            return 1;
        } else if (n>0) {
            return n * factorial(n-1);
        }else {
            return n;
        }
    }
    static void numbTriNat(int n){
        int triangle = (n*(n+1))/2;
        int natural = factorial(n);
        System.out.printf("n-ое тругольное от %d равно %d\n%d! Факториал: %d", n, triangle, n, natural);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int num = scan.nextInt();
        numbTriNat(num);
    }
}
