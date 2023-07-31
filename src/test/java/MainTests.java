import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainTests {

    @Test
    public void testNumEven(){
        //Arrange
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> result = Arrays.asList(2, 4, 8, 16, 32);

        //Act
        List<Integer> evens = new ArrayList<>();
        for (int j : intList)
            if (j % 2 == 0 && j > 0) {
                evens.add(j);
            }
        evens.sort(Comparator.naturalOrder());

        //Assert
        Assertions.assertArrayEquals(new List[]{evens}, new List[]{result});
    }

}
