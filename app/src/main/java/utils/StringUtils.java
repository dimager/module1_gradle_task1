/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean  isPositiveNumber(String str) {
        return NumberUtils.isParsable(str) ? Double.parseDouble(str) > 0 : false;
    }
}
