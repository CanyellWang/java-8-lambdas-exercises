package com.insightfullogic.java8.answers.chapter6;

import java.util.ArrayList;
import java.util.List;

public class BuggyReduce {

    /*
    Buggy Version:
    // BEGIN buggyMultiplyThrough
public static int multiplyThrough(List<Integer> linkedListOfNumbers) {
    return linkedListOfNumbers.stream()
                  .reduce(5, (acc, x) -> x * acc);
}
    // END buggyMultiplyThrough
    */

    public static int multiplyThrough(List<Integer> numbers) {
        return 5 * numbers.parallelStream()
                          .reduce(1, (acc, x) -> x * acc);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        int i = multiplyThrough(list);
        System.out.println(i);
    }

}
