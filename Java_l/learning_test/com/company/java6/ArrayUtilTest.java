package com.company.java6;

/**
 * @Author: Robin_Wujw
 * @Date: 2021/8/30 16:03
 */
public class ArrayUtilTest {
    public static void main(String[] args) {
        //ArrayUtil util = new ArrayUtil();
        int[] arr = new int[]{32,35,32,5,6,7,213,53,12,766,-5,0};
        int max = ArrayUtil.getMax(arr);
        System.out.println("最大值为："+max);
        System.out.println("排序前:");
        ArrayUtil.print(arr);
        System.out.println("排序后:");
        ArrayUtil.sort(arr);
        ArrayUtil.print(arr);
        System.out.println("查找：");
        int index = ArrayUtil.getIndex(arr,5);
        if(index>=0){
            System.out.println("找到了，索引地址为："+index);
        }
        else {
            System.out.println("没找到");
        }
    }
}
