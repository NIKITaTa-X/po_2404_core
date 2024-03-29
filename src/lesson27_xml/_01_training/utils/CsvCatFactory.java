package lesson27_xml._01_training.utils;


import lesson27_xml._01_training.exceptions.TxtException;
import lesson27_xml._01_training.model.CsvCat;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;

import java.util.Arrays;

public class CsvCatFactory {

    public static CsvCat getInstance(String catString) throws TxtException {
        var lexemes = catString.split(",");
        try {
            validateStringLength(lexemes.length);
            validateIsNumber(lexemes[0], lexemes[2]);
            validateNameByEmpty(lexemes[1]);
            var id = validateOrAgeByNegative(Integer.parseInt(lexemes[0]));
            var name = lexemes[1];
            var age = validateOrAgeByNegative(Integer.parseInt(lexemes[2]));
            return new CsvCat(id, name, age);
        } catch (IllegalStateException e) {
            throw new TxtException(catString, e);
        }
    }

    private static void validateStringLength(int length) {
        if (length != 3) {
            throw new IllegalStateException("Wrong line format");
        }
    }

    private static void validateIsNumber(String... lexemes) {
        try {
            Arrays.stream(lexemes).forEach(Integer::parseInt);
        } catch (NumberFormatException e) {
            throw new IllegalStateException("ID or Age not a Number");
        }

    }

    private static void validateNameByEmpty(String name) {
        if (StringUtils.isBlank(name))
            throw new IllegalStateException("Name is empty");
    }

    private static int validateOrAgeByNegative(int value) {
        if (value < 0) {
            throw new IllegalStateException("wrong id or age");
        }
        return value;
    }
}
