package training.afpa.cda24060.Main.exercices;

import java.util.Arrays;
import java.util.Random;

public class Create {
    public static int[] arr1() {

        int n = 10;
        int [] arr = new int [n];

        Random r = new Random();
        for (int i = 0; i < n; i++) {

            arr[i] = r.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));


       Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
