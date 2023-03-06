package org.example.cw4;
// Верно ли, что массив целых чисел симметричен
public class Ex4 {
    public static void main(String[] args) {
        int[] arr = new int[] {3, 4, 5, 6, 5, 5, 3};
        if(isArraySymmetrical(arr))
            System.out.println("Массив симметричен");
        else
            System.out.println("Массив не симметричен");
    }

    public static boolean isArraySymmetrical(int[] arr){
        for (int i=0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - i - 1])
                return false;
        }
        return true;
    }
}
