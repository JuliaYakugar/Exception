package Less_02;

import java.util.Scanner;

public class Main_04 {
    public static void main(String[] args) {
        scannerString();
    }

    public static void scannerString() {
        try {
            System.out.println("Введите строку");

            Scanner input = new Scanner(System.in);
            String fl = input.nextLine();
            int intL = 10 / fl.length();
            System.out.println(fl);
            input.close();
        } catch (Exception e) {
            System.out.println("Пустые строки вводить нельзя!");
            scannerString();
        }
    }
}
