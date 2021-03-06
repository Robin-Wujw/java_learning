package com.company.java1;

/**
 * @Author: Robin_Wujw
 * @Date: 2021/8/29 22:02
 */
public class StudentTest {
    public static void main(String[] args) {
        Student[] stus = new Student[20]; //声明Student类型的数组
        for(int i = 0; i <stus.length;i++){
            //给数组元素赋值
            stus[i] = new Student();
            //给Student对象的属性赋值
            stus[i].number = (i+1);
            //年级：[1,6]
            stus[i].state = (int)(Math.random()*(6-1+1)+1);//(b-a+1)+a
            //成绩：[0,100]
            stus[i].score = (int)(Math.random()*(100-0+1));
        }

        for(int i =0 ;i<stus.length;i++){
//            System.out.println(stus[i].number +","+stus[i].state+","+stus[i].score);
            System.out.println(stus[i].info());
        }
        System.out.println("**************************************");
        //打印出三年级的学生的信息
        for(int i=0;i<stus.length;i++){
            if(stus[i].state ==3){
                System.out.println(stus[i].info());
            }
        }
        System.out.println("**************************************");
        //使用冒泡排序按学生成绩排序，并遍历
        for(int i =0;i<stus.length-1;i++){
            for(int j=0;j<stus.length-1;j++){
                if(stus[j].score > stus[j+1].score){
                    Student temp = stus[j];
                    stus[j] = stus[j+1];
                    stus[j+1] = temp;
                }
            }
        }
        for(int i =0 ;i<stus.length;i++){
            System.out.println(stus[i].info());
        }
    }
}
class Student{
    int number;//学号
    int state;//年级
    int score;//成绩
    //显示学生信息的方法
    public String info(){
        return "学号:"+number+"，年级："+state+"，成绩："+score;
    }
}