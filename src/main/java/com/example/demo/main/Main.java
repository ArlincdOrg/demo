package com.example.demo.main;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);
    }

    public static void format(String url, String... args) {
        // 第三个没用到注释
        String format = new MessageFormat(url).format(args);
        System.out.println(format);
        // 随便提交一个注释
        // 再提交一个注释
        // 222
    }
}
