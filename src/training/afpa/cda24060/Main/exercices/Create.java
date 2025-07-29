package training.afpa.cda24060.Main.exercices;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Create {
    public static int[] arr1() {

        int n = 10;
        int[] arr = new int[n];
        Set<Integer> usedNumbers = new HashSet<>();
        Random r = new Random();

        int i = 0;
        while (i < n) {
            int randomNum = r.nextInt(10);
            if (!usedNumbers.contains(randomNum)) {
                arr[i] = randomNum;
                usedNumbers.add(randomNum);
                i++;
            }
        }
            System.out.println("Tableau original: " + Arrays.toString(arr));

            Arrays.sort(arr);
            System.out.println("Tableau trie: " + Arrays.toString(arr));

            return arr;

    }
}