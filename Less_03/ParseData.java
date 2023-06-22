package Less_03;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParseData {
    String family;
    String name;
    String surname;
    Date DOB;
    int phoneNumber;
    String sex;
    
    public ParseData(String[] data) {
        family = data[0];
        name = data[1];
        surname = data[2];
        
        try {
            DOB = new SimpleDateFormat("dd/MM/yyyy").parse(data[3]);
        } catch (ParseException  e) {
            System.out.println("Неверный формат даты");
        }

        try {
            phoneNumber = Integer.parseInt(data[4]);
        } catch (NumberFormatException  e) {
            System.out.println("Неверный формат телефона");
        }

        if (data[5].equals("f") || data[5].equals("m")) {
            sex = data[5];
        } else {
            System.out.println("Неверно указан пол");
        }
        
    }

    public String getFamily() {
        return family;
    }
        public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getDOB() {
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        String dateString = df.format(this.DOB);
        return dateString;
    }
    public String getPhoneNumber() {
        return Integer.toString(phoneNumber);
    }
    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "----------------------------\n" + surname + " " + name + " " + family + " " + DOB + " " + phoneNumber + " " + sex; 
    }
}
