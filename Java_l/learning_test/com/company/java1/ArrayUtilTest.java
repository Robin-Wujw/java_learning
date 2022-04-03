package com.company.java1;

/**
 * @Author: Robin_Wujw
 * @Date: 2021/8/30 16:03
 */
public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil util = new ArrayUtil();
        int[] arr = new int[]{32,35,32,5,6,7,213,53,12,766,-5,0};
        int max = util.getMax(arr);
        System.out.println("最大值为："+max);
        System.out.println("排序前:");
        util.print(arr);
        System.out.println("排序后:");
        util.sort(arr);
        util.print(arr);
        System.out.println("查找：");
        int index = util.getIndex(arr,5);
        if(index>=0){
            System.out.println("找到了，索引地址为："+index);
        }
        else {
            System.out.println("没找到");
        }
    }
}
