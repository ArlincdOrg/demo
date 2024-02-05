package com.example.demo.main;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);

        // 区间合并
        int[][] merge = merge(new int[][]{{1, 4}, {0, 2}, {3, 5}, {5, 7}, {8, 10}, {15, 18}});
        System.out.println(Arrays.deepToString(merge));
    }

    public static void format(String url, String... args) {
        // 第三个没用到注释
        String format = new MessageFormat(url).format(args);
        System.out.println(format);
        // 随便提交一个注释
        // 再提交一个注释
        // 222
    }

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int start = intervals[0][0];
        int end = intervals[0][1];
        List<int[]> ans = new ArrayList<>();
        for (int[] interval : intervals) {
            if (interval[0] <= end) {
                end = Math.max(end, interval[1]);
            } else {
                ans.add(new int[]{start, end});
                start = interval[0];
                end = interval[1];
            }
        }
        ans.add(new int[]{start, end});
        return ans.toArray(new int[ans.size()][]);
    }
}
