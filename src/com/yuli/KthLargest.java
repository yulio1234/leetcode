package com.yuli;

import java.util.PriorityQueue;

/**
 * 703. 数据流中的第K大元素
 * 解题思路：求K大元素，维护一个K大最小堆，每个数据比较堆顶的元素，大于就放进最小堆里。
 *
 */
public class KthLargest {
    PriorityQueue<Integer> heap;
    int k;
    public KthLargest(int k, int[] nums) {
        heap = new PriorityQueue<>(k);
        this.k = k;
        for (int num : nums) {
            //循环将元素放进堆里
            add(num);
        }
    }

    public int add(int val) {
        //如果堆没有K个元素，就放进去。
        if (heap.size() < k) {
            heap.add(val);
            //如果元素大于堆里最小元素，就取出最小元素，并放进去。
        }else if(val > heap.peek()){
            heap.poll();
            heap.add(val);
        }
        //返回第K个最小元素
        return heap.peek();
    }
}
