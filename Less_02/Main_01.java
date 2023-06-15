package Less_02;

import java.util.Scanner;

public class Main_01 {
    
    public static void main(String[] args) {
        scannerFloat();
    }

    public static void scannerFloat() {
        try {
            System.out.println("Введите значение типа float");

            Scanner input = new Scanner(System.in);
            String fl = input.next();
            System.out.println(Float.parseFloat(fl));
            input.close();
        } catch (NumberFormatException e) {
            System.out.println("Неверно введенное значение!");
            scannerFloat();
        }
    }
}

