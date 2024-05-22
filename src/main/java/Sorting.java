import java.util.List;

public class Sorting {

    public List<Integer> sort(List<Integer> sortingList) {

        int listSize = sortingList.size();

        for (int i = 0; i < listSize - 1; i++) {
            for (int j = 0; j < listSize - i - 1; j++) {
                if (sortingList.get(j) > sortingList.get(j + 1)) {
                    int n = sortingList.get(j);
                    sortingList.set(j, sortingList.get(j + 1));
                    sortingList.set(j + 1, n);
                }
            }
        }
        return sortingList;
    }
}
