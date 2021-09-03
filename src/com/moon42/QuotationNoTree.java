package com.moon42;

import java.util.ArrayList;
import java.util.List;

public class QuotationNoTree {

    public static void main(final String[] args) {

        // create list for store fibonacci numbers
        List<Integer> numberList = new ArrayList<>(0);

        // a b c variable declaration and initialization
        int a, b = 0, c = 1;

        for (int i = 1; i <= 100; i++) {
            a = b;
            b = c;
            c = a + b;
            // add to list
            numberList.add(a);
        }

        // print the fibonacci numbers
        numberList.forEach(integer -> System.out.print(integer + ", "));
    }
}
