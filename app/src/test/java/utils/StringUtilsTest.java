package utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    @DisplayName("isPositiveNumber test")
    void isPositiveNumber() {
        Assertions.assertAll(() -> Assertions.assertTrue(StringUtils.isPositiveNumber("123")),
                () -> Assertions.assertFalse(StringUtils.isPositiveNumber("-432.3")),
                () -> Assertions.assertFalse(StringUtils.isPositiveNumber("string")),
                () -> Assertions.assertFalse(StringUtils.isPositiveNumber(null)));
    }
}