package Less_03;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        
        ScannerData sData = new ScannerData();
        ParseData pData = new ParseData(sData.getData());

        try (FileWriter fw = new FileWriter(pData.getFamily(), true)) {
            fw.append(pData.getFamily() + " " + pData.getName() + " " + pData.getSurname() + " " +
                        pData.getDOB() + " " + pData.getPhoneNumber() + " " + pData.getSex() + "\n");
        } catch (IOException e) {
            System.out.println("Ошибка работы с файлом");
        }

    }

}
