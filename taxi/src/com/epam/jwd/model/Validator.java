package com.epam.jwd.model;

import com.epam.jwd.view.Output;

import static com.epam.jwd.view.Input.inputInt;

public class Validator {
    public static int notEqualZero(int number) {
        while(number == 0) {
            Output.output("Number should be above zero!");
            number = inputInt("");
        }
        return number;
    }
}
