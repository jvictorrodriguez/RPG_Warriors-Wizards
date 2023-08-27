package org.example.labs.lab_108;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    public static void main(String[] args) {
        BigDecimal numberBigDecimal= BigDecimal.valueOf(4.2545);

        System.out.println(BigDecimalToDouble(numberBigDecimal));
        System.out.println(BigDecimalReverseSign(BigDecimal.valueOf(1.2345)));
        System.out.println(BigDecimalReverseSign(BigDecimal.valueOf(-45.67)));
    }
    private static double BigDecimalToDouble(BigDecimal bigDecimal){
         return bigDecimal.setScale(2, RoundingMode.HALF_EVEN).doubleValue();
    }

    private static double BigDecimalReverseSign(BigDecimal bigDecimal){
        return bigDecimal.negate().setScale(1,RoundingMode.HALF_EVEN).doubleValue();
    }
}
