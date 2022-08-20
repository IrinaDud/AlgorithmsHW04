import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class OddEvenTest {

    // Task 1
    // Создать алгоритм OddEven, который принимает на вход целое число, возвращает “Odd”,  если число нечетное, и
    // “Even”, если число четное. Во всех остальных случаях результат будет “Undefined”.
    //Test Data:
    //        -345 →  “Odd”
    //        0 →  “Even”
    //        222222 →  “Even”
    //        2147483647 + 1 →  “Undefined”

    @Order(1)
    @Test
    public void testOddEvenPatPositiveOddNumber(){
        long number = 1;
        String expectedResult = "Odd";

        OddEven as = new OddEven();
      //  String actualResult = as.oddEvenAlgorithm();



    }


}
