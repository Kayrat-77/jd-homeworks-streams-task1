import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        Stream<Integer> stream = intList.stream();
//        Отфильтруйте положительные числа.
        stream.filter(x -> x > 0)
//        Найдите среди этих положительных чисел четные.
                .filter(x -> x % 2 == 0)
//        Отсортируйте отфильтрованные числа в порядке возрастания.
                .sorted(Comparator.naturalOrder())
//        Выведите результат на экран.
                .forEach(System.out::println);
    }
}