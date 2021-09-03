package com.moon42;

import java.util.ArrayList;

public class QuotationNoOne {

    public static void main(final String[] args) {

        // create integer list for store numbers
        ArrayList<Integer> numberList = new ArrayList<>();

        // add values for list
        for (int i = 1; i < 10; i++) {
            numberList.add(i);
        }

        // print list values
        System.out.print("Integer List: ");
        numberList.forEach(integer -> System.out.print(integer + ", "));
        System.out.println("");

        // print result
        System.out.println("ForLoop total is: " + sumForLoop(numberList));
        System.out.println("WhileLoop total is: " + sumForWhileLoop(numberList));
        System.out.println("ForRecursion total is: " + sumForRecursion(numberList, 0));
    }

    /**
     * get sum using for loop
     * @param numberList
     * @return int
     */
    private static int sumForLoop(ArrayList<Integer> numberList) {
        // declare total variable and initialization
        int total = 0;
        for (int i = 0; i < numberList.size(); i++) {
            // get number list i th index and sum to total
            total += numberList.get(i);
        }
        // return total value
        return total;
    }

    /**
     * get sum using while loop
     * @param numberList
     * @return int
     */
    private static int sumForWhileLoop(ArrayList<Integer> numberList) {
        // declare count, total variables and initialize
        int count = 0;
        int total = 0;
        while (count < numberList.size()) {
            // get number list by count value index and sum to total
            total += numberList.get(count);
            // increment count
            count++;
        }
        // return total value
        return total;
    }

    /**
     * get sum using recursion
     * @param numberList
     * @param index
     * @return int
     */
    private static int sumForRecursion(ArrayList<Integer> numberList, int index) {
        // check index value equals to list size
        if (index == numberList.size()) {
            return 0;
        } else {
            return numberList.get(index) + sumForRecursion(numberList, index + 1);
        }
    }
}
