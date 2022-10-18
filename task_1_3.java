// Реализовать простой калькулятор

import java.util.Scanner;
public class task_1_3 {

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
    public static void main(String [] args) {
        //System.out.print("Введите число: ");
        // Scanner fl = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        float num_1 = readInt();
        System.out.print("Ведите знак действия: ");
        String symbol = s.next();
        //System.out.print("Введите число: ");
        float num_2 = readInt();
        int t = 2;
        if(symbol.equalsIgnoreCase("+")){System.out.printf("%.2f+%.2f=%.2f", num_1, num_2, num_1+num_2);}
        else if(symbol.equalsIgnoreCase("-")){System.out.printf("%.2f+%.2f=%.2f", num_1, num_2, num_1-num_2);}
        else if(symbol.equalsIgnoreCase("*")){System.out.printf("%.2f+%.2f=%.2f", num_1, num_2, num_1*num_2);}
        else if(symbol.equalsIgnoreCase("/")){System.out.printf("%.2f+%.2f=%.2f", num_1, num_2, num_1/num_2);}
        else {System.out.print("Вы ввели не корректный знак действия введите + или - или * или /");}
        
    }
}
