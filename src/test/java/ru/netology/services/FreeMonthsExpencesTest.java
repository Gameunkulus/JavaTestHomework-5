package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class FreeMonthsExpencesTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/bonus.csv")
    void ShouldCalculateForZeroStart(int expected, int income, int expences, int threshold) {
        FreeMonthsExpences prog = new FreeMonthsExpences();
        int actual = prog.calculate(income, expences, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
