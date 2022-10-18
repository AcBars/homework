/* Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса,
например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно
решение или сообщить, что его нет. */

import java.util.Scanner;

public class task_1_4 {
    public static int readInt() {
        while (true) {
            System.out.print("Введите число: ");
            Scanner s = new Scanner(System.in);
            String line = s.nextLine();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.err.println("Вы ввели не число!");
            }
        }
    }
    public static void main(String [] args){
        float t = readInt();
        System.out.print(t);
    }
}
