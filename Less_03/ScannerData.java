package Less_03;

import java.util.Scanner;

public class ScannerData {
    String[] data = new String[6];

    public ScannerData() {
        this.data = dataCreate();
    }

    public String[] dataCreate() {
        System.out.println("Введите данные через пробел: Фамилия, Имя, Отчество, Дата рождения(ДД/ММ/ГГГГ), Номер телефона, Пол(f/m)");
        data = new Scanner(System.in).nextLine().split(" ");
        lengthException(data);
        return data;
    }

    public String[] getData() {
        return data;
    }

    public void lengthException(String[] data) {
        if (data.length < 6) {
            System.out.println("Мало данных");
            dataCreate();
        }
        else if (data.length > 6) {
            System.out.println("Много данных");
            dataCreate();
        }
    }
}
