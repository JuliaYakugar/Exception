package Less_01;

public class Main_03 {
    
    public static void main(String[] args) {

        int[] arr1 = new int[] {9, 16, 15, 49};
        // int[] arr2 = new int[] {3, 4, 5, 7};
        int[] arr2 = new int[] {3, 4, 5};
        int[] arr3 = new_array(arr1, arr2);
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

    }

    public static int[] new_array(int[] arr1, int[] arr2) {

        if (arr1.length != arr2.length) {
            throw new RuntimeException("Разная длина массивов");
        }

        int[] arr3 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i] / arr2[i];
        }
        return arr3;
    }
}
