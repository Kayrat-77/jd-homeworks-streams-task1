import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> sortEvenList = numEven(intList);
        sortEvenList.sort(Comparator.naturalOrder());
        numPrint(sortEvenList);
    }

    public static List<Integer> numEven(List<Integer> list) {
        List<Integer> evens = new ArrayList<>();
        for (int j : list)
            if (j % 2 == 0 && j > 0) {
                evens.add(j);
            }
        return evens;
    }

    public static void numPrint(List<Integer> list) {
        for (Object j : list)
            System.out.println(j);
    }
}