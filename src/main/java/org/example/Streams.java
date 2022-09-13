package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {
        stringStreams();
    }

    private static void stringStreams() {
        List<String> stringList = new ArrayList<>(Arrays.asList("one", "two", "three"));
        List<String> result = stringList.stream().filter(str -> str.contains("o")).collect(Collectors.toList());
        System.out.println(result);
    }
}
