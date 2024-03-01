package com.example.demo.main;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Arlin
 * @date: 2024/2/5
 * @description:
 */
@Slf4j
public class FastJsonTest {

    public static void main(String[] args) {
        String json = "[2022,2023,2024";
        List<Integer> list = new ArrayList<>();
        try {
            list = JSON.parseArray(json, Integer.class);
        } catch (Exception e) {
            log.error("json parse error", e);
        }
        System.out.println(list);
    }
}
