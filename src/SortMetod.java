public class SortMetod {
        public static String sortingType = null;
           public static void sorter(){
                switch (sortingType){
                    case "BO":
                        BaubleSortingMethod.baubleSorter();
                        break;
                    case "CHO":
                        InsertSort.insertSort();
                        break;
                }
               System.out.println(DataStorage.numbers);
               System.out.println(DataStorage.sortedNumber);
        }
}
