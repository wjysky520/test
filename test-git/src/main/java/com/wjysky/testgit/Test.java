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
public class Test {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
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
