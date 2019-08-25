package com.yuli;

import java.util.Deque;
import java.util.LinkedList;

/**
 *题目：239. 滑动窗口最大值
 * 解题思路：
 */
public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if( nums == null || k ==0){
            return null;
        }
        Deque<Integer> window = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            window.add(i);
        }
        return nums;
    }
}
