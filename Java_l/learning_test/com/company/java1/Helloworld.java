package com.company.java1;
import java.util.Arrays;
/**
 * 2 * @Author: Robin_Wujw
 * 3 * @Date: 2021/8/23 16:56
 * 4
 */
public class Helloworld {
    public static void main(String[] args){
        String[] names = new String[2];
        int[][] arr = new int[][]{{3,5,7,},{1,2,3},{3,4,5}};

        int[] arr1 = new int[]{1,2,3,4};
        int[] arr2 = new int[]{1,3,3,4};
        boolean isEquals = Arrays.equals(arr1,arr2);
        System.out.println(isEquals);
        //调用指定位置的元素
        names[0] = "你好";
        System.out.println(names.length);
    }
}
