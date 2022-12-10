package edu.AnastasiiaTkachuk;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(6);
        list.add(10);
        list.add(12);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(27);
        list.add(5);

        list.stream()
                .filter(value -> value % 2 != 0)
                .filter(value -> value % 5 == 0)
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(System.out::println);
    }
}
