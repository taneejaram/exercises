package com.happyday;

public class JavaBuzz {

    public static String javabuzz(int number) {
        if (number % 15 == 0) {
            return "JavaBuzz";
        }
        else if (number % 3 == 0) {
            return "Java";
        }
        else if (number % 5 == 0) {
            return "Buzz";
        }
        return number + " ";
    }
}
