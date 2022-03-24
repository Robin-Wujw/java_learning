package com.company.java12;

/**
 * @Author: Robin_Wujw
 * @Date: 2022/3/2 19:44
 * Error:
 * Java 虚拟机无法解决的严重问题。 如：JVM系统内部错误、资源耗尽等严重情况。比如StackOverflowError和OOM。 一般不编写针对性得代码进行处理。
 *
 * Exception:
 * 其他因编程错误或偶然的外在因素导致的一般性问题，可以使用针对性的代码进行处理。例如：
 * 空指针访问、试图读取不存在的文件、网络连接终端、数组角标越界
 *
 * 对于这些错误 一般有两种解决方法：
 * 1.遇到错误就终止程序的运行 2.由程序员在编写程序时，考虑到错误的检测、错误消息的提示以及错误的处理
 */
public class ErrorTest {
    public static void main(String[] args) {
        //1.栈溢出: java.lang.StackOverflowError
//        main(args);
        //2.堆溢出: java.lang.OutOfMemoryError
        Integer[] arr = new Integer[1024*1024*1024];
    }
}
