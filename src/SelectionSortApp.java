public class SelectionSortApp {
    public static void main(String[] args) {
//        int[] numbers = {234,2,342,1,2,31,23,5,-4,1,-4,-111,-24,0,123};
        int[] numbers = {-123,123,11,5,7,822,6,7,994,133131,523,-123,-512341,-12};

        numbers = SelectionSort.sort(numbers);

        for (int number : numbers) {
            System.out.print(number+", ");
        }
    }
}
