package Less_01;

public class Main_02 {

    public static int sum2d(String[][] arr){ 
        int sum = 0;
        for (int i = 0; i < arr.length; i++) { 
            for (int j = 0; j < 5; j++) {       // если j выйдет за пределы массива (например j максимум 3)
                int val = Integer.parseInt(arr[i][j]);  // если значение нельзя будет преобразовать в int (например "Hello")
                sum += val;     // если переполнится int (больше 2 147 483 647)
            }
        }
        return sum;
    }
}
