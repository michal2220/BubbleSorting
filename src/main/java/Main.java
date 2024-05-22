import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Sorting sorting = new Sorting();
        List<Integer> numbersToBeSorted = Arrays.asList(44,3,1,7,9,5,2,33);

        List<Integer> sortedList = sorting.sort(numbersToBeSorted);
        System.out.println(sortedList);
    }
}
