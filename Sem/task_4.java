

import java.util.Scanner;

//* Дополнительно: +Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса,
// например, 2? + ?5 = 69.
// Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
// Под знаками вопросов - одна и та же цифра
// Ввод: 2? + ?5 = 69 Вывод: 24 + 45 = 69
public class task_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите уравнение(q + w = e, q, w, e >= 0): ");
        String[] src = scan.nextLine().split("[\\+\\=]");
        Integer x = null;
        for(int i = 0; i < 10; i++){
            if(Integer.parseInt(src[0].replace('?', Character.forDigit(i, 10))) +
                    Integer.parseInt(src[1].replace('?', Character.forDigit(i, 10))) ==
                    Integer.parseInt(src[2].replace('?', Character.forDigit(i, 10)))) {
                x = i;
                break;
            }
        }
        if(x != null) System.out.printf("%s + %s = %s", src[0].replace('?', Character.forDigit(x, 10)),
                src[1].replace('?', Character.forDigit(x, 10)),
                src[2].replace('?', Character.forDigit(x, 10)));
        else System.out.println("Решения нет");
    }
}


