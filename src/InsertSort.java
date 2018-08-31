

public class InsertSort {
    public static void insertSort(){
        DataStorage.sortedNumber.add(DataStorage.numbers.get(0));
        for (int i = 1; i < DataStorage.numbers.size(); i++) {
            Integer numberInputToList = DataStorage.numbers.get(i);
            int indexToInsert = findIndexToInsert(numberInputToList);
            DataStorage.sortedNumber.add(indexToInsert, numberInputToList);
        }

    }
    public static int findIndexToInsert(Integer numberToInsert) {
        for (int i = 0; i < DataStorage.sortedNumber.size(); i++) {
            if (numberToInsert < DataStorage.sortedNumber.get(i)) {
                return i;
            }

        }
        return DataStorage.sortedNumber.size();
    }
}
