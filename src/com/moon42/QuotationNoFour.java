package com.moon42;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QuotationNoFour {

    public static void main(final String[] args) {

        // create integer list for store int numbers
        List<Integer> numberList = new ArrayList<>();
        // add data to list
        numberList.add(50);
        numberList.add(2);
        numberList.add(1);
        numberList.add(9);

        // print max number
        System.out.println(maxNumber(numberList));
    }

    /**
     * get the largest possible number.
     * @param numberList
     * @return String
     */
    public static String maxNumber(List<Integer> numberList) {
        return numberList.stream()
                // convert integer value to string
                .map(String::valueOf)
                // sort using custom comparator
                .sorted((o1, o2) -> (o2 + o1).compareTo(o1 + o2))
                // join sorted items, forming max possible number
                .collect(Collectors.joining());
    }

}
