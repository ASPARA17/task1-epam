package com.epam.jwd.view;

import java.util.ArrayList;
import java.util.HashSet;

public class Output {
    public static void output(String str) {
        System.out.println(str);
    }

    public static <T> void printCollection(ArrayList<T> arrayList) {
        for (T element : arrayList) {
            System.out.println(element);
        }
    }

    public static <T> void printCollection(HashSet<T> arrayList) {
        for (T element : arrayList) {
            System.out.println(element);
        }
    }
}
