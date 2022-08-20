import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class AscendingSequenceTest {
    AscendingSequence as;              // выносим вначало ,так как это должно использоваться во всех тестах,чтобы в них
                                        //не писать каждый раз

    @BeforeEach
    void setUp() {
        as = new AscendingSequence();
    }


    @Order(1) // в каком порядке должны идити тесты. Позитивные всегда в начале
   // @RepeatedTest(20)  повторить тест какое.то количество раз
    @Test
    public void testAscendingSequenceHappyPathPositiveNumber() {    //положительный результат


        // 0,1,2,3,4,5
        int start = 0;
        int end = 5;
        int step = 1;
        int[] expectedResult = {0, 1, 2, 3, 4, 5};

        AscendingSequence as = new AscendingSequence();
//     тип данных,это     название  создается новый объект
//     название класса    объекта
//      обект            сюда складывается
//                       ccылка на новый
//                       объект
//Тип данных у нового обеъекта такой же как название класса в котором лежит метод.От название обекта вызвываем метод

        int[] actualResult = as.ascendingSequenceTestAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }
    @Order(2)
    @Test
    public void testAscendingSequenceHappyPathNegativeNumber() {    //отрицательный результат


        // -10,-9,-8,-7
        int start = -10;
        int end = -7;
        int step = 1;
        int[] expectedResult = {-10, -9, -8, -7};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceTestAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Order(3)
    @Test
    public void testAscendingSequenceHappyPathStepTwo() {    //от шага зависит длина массива


        int start = 0;
        int end = 5;
        int step = 2;
        int[] expectedResult = {0, 2, 4};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceTestAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Order(4)
    @Test
    public void testAscendingSequenceStartLagerThenEnd() {    //от шага зависит длина массива


        int start = 5;
        int end = 0;
        int step = 2;
        int[] expectedResult = {};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceTestAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Order(5)
    @Test
    public void testAscendingSequence() {    //от шага зависит длина массива


        int start = 5;
        int end = 0;
        int step = 2;
        int[] expectedResult = {};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceTestAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);


    }

    @Order(6)
    @Test
    public void testAscendingSequenceNegativeStep() {    //от шага зависит длина массива


        int start = 5;
        int end = 0;
        int step = -1;
        int[] expectedResult = {};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceTestAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }


    @Order(7)
    @Test
    public void testAscendingSequenceStepZero() {    //от шага зависит длина массива


        int start = 5;
        int end = 0;
        int step = 0;
        int[] expectedResult = {};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceTestAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }


}