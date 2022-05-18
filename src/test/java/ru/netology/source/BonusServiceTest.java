package ru.netology.source;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class BonusServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")


    public void bonus (String nameTest, String bonusAmount ,int amount, boolean isRegistered, int expected) {
        BonusService service = new BonusService();

        long actual = service.calculate(amount,isRegistered);
        System.out.println(actual==expected);

        Assertions.assertEquals(actual,expected);

    }

}
