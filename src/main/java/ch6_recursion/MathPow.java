package ch6_recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MathPow {
    private Integer result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число которое будите возводить в степень: ");
        Integer x = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Введите степень: ");
        Integer y = Integer.parseInt(bufferedReader.readLine());

        System.out.println(power(x, y));
    }

    private static Integer power(Integer x, Integer y) {

        if (y == 1)
            return x;
        else {
            Integer x1 = power(x * x, y / 2);
            return y % 2 == 0 ? x1 : (x1*= x);
        }

    }

}
