package com.example.demo.main;

import java.text.MessageFormat;

public class Main {

    public static void main(String[] args) {
        // 加一个没用到注释
        String url = "/openapi-doc/manual/di-san-fang-ji-cheng/fei-shu-ji-cheng/shi-yong-fang-fa.html?source=feishu&type=all_desc";
        String host = "https://ligai.cn";
        format(url, host);
        // 这里也加一个没用到注释
    }

    public static void format(String url, String... args) {
        // 第三个没用到注释
        String format = new MessageFormat(url).format(args);
        System.out.println(format);
        // 随便提交一个注释
        // 再提交一个注释
    }
}
