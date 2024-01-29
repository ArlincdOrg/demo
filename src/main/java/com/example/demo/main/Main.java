package com.example.demo.main;

import java.text.MessageFormat;

public class Main {

    public static void main(String[] args) {
        // 测试
        String url = "/openapi-doc/manual/di-san-fang-ji-cheng/fei-shu-ji-cheng/shi-yong-fang-fa.html?source=feishu&type=all_desc";
        String host = "https://ligai.cn";
        format(url, host);
    }

    public static void format(String url, String... args) {
        String format = new MessageFormat(url).format(args);
        System.out.println(format);
    }
}
