package com.company.java7;

/**
 * @Author: Robin_Wujw
 * @Date: 2021/9/28 15:31
 */
public class MainDemo {
    public static void main(String[] args) {
        for(int i =0;i<args.length;i++){
            System.out.println("*****"+args[i]);

            int num = Integer.parseInt(args[i]);
            System.out.println("#####"+num);
        }
    }
}
