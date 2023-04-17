
//Вывести все простые числа от 1 до 1000
public class task_2 {
    public static void main(String[] args) {
        String res = "2, 3, 5, 7";
        for(int i = 8; i < 1000; i++){
            if(!(i%2 == 0 || i%3 == 0 || i%5 == 0 || i%7 == 0 )){
                res += ", " + i;
            }
        }
        System.out.println(res);
    }
}