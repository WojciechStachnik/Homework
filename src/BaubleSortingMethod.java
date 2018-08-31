import java.util.Arrays;
import java.util.Collections;

public class BaubleSortingMethod {
    public static void baubleSorter() {
        boolean flag = false;
        int temp;
        int[] temporary = new int[DataStorage.numbers.size()];
        for (int i = 0; i < DataStorage.numbers.size() ; i++) {
            temporary[i] = DataStorage.numbers.get(i).intValue();
        }
        do {
            flag = false;
            for (int i = 0; i < temporary.length-1; i++) {
                if (temporary[i] > temporary[i + 1]) {
                    temp = temporary[i + 1];
                    temporary[i + 1] = temporary[i];
                    temporary[i] = temp;
                    flag=true;
                                    }
            }
        }while(flag);


        for (int i = 0; i <temporary.length ; i++) {
            DataStorage.sortedNumber.add(temporary[i]);
        }
    }
    }