package com.moon42;

import java.util.ArrayList;
import java.util.List;

public class QuotationNoTwo {

    public static void main(final String[] args) {
        // create list for store integers add values to list
        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);

        // print integer list 
        System.out.print("Number list: ");
        numberList.forEach(System.out::print);
        System.out.println("");

        // create list for store strings and add values to list
        List<String> stringList = new ArrayList<>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");
        stringList.add("F");

        // print string list
        System.out.print("String list: ");
        stringList.forEach(System.out::print);
        System.out.println("");

        // print combine list
        List<Object> combines = getCombines(numberList, stringList);
        System.out.print("Combine list: ");
        combines.forEach(value -> System.out.print(value + ", "));
    }

    /**
     * getCombines list
     * @param numberList
     * @param stringList
     * @return List<Object>
     */
    private static List<Object> getCombines(List<Integer> numberList, List<String> stringList) {
        // create list for store combine values
        List<Object> combineList = new ArrayList<>();

        // get list size
        int numSize = numberList.size();
        int stringSize = stringList.size();

        // find max list size
        int max = Math.max(numSize, stringSize);

        for (int i = 0; i < max; i++) {
            // check size greater than i
            if (i < numSize) {
                // add to combine list
                combineList.add(numberList.get(i));
            }
            // check size greater than i
            if (i < stringSize) {
                // add to combine list
                combineList.add(stringList.get(i));
            }
        }
        // return list
        return combineList;
    }

}
