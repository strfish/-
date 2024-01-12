package com.example.hzsr_layuidemo1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
class ApplicationTests {
//    1.1 直接插入排序
//    把n个元素分为有序列和无序列，刚开始时，有序列默认是1个元素，
//    无序列时剩余的n-1个元素，每次从无序列种取出1个元素与有序列进行排序，最终得到一个排序好的有序列。
    @Test
    void contextLoads() {
    int[] nums = new int[]{1,5,2,7,9,6,0,4};
    System.out.println("未改变的数组："+ Arrays.toString(nums));
    for(int i = 1;i<nums.length;i++){
        int item = nums[i];
    }
    }

}
