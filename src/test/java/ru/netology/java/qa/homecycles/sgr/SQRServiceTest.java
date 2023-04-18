package ru.netology.java.qa.homecycles.sgr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/volume.csv")
    public void testVolumeInRange(int expected, int start, int end) {
        SQRService service = new SQRService();


        int actual = service.calcVolumeSqrt(start, end);
        Assertions.assertEquals(expected, actual);

    }
}
