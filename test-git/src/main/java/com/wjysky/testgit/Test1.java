package com.wjysky.testgit;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * Test
 *
 * @author 王俊元（wangjunyuan@talkweb.com.cn）
 * @date 2023-02-27 14:07:14
 * @apiNote
 */
public class Test1 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1111111);
        list.add(2222222);
        list.add(555555555);
        list.add(5666666);
        list.add(33);
        list.add(44);
        list.add(55);
        list.add(21);
        list.add(22);
        list.add(23);
        list.add(24);
        list.add(25);
        list.add(11);
        list.add(22);
        list.add(33333344);
        list.add(444444);
        list.add(33);
        list.add(44);
        list.add(55);
        list.add(10);
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);
        list.add(61);
        list.add(72);
        list.add(83);
        list.add(94);
        list.add(105);
        System.out.println(JSON.toJSONString(list));
    }
}
