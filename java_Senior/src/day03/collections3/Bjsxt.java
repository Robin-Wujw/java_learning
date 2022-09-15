/**
 * @Author: Robin_Wujw
 * @Date: 2022-04-17 17:07
 */
public class Bjsxt <T>{
    T stu;

    public static void main(String[] args) {
        //泛型的嵌套
        Bjsxt<Student04<String>> room = new Bjsxt<Student04<String>>();
        //从外到内拆分
        room.stu = new Student04<String>();
        Student04<String> stu = room.stu;
        String score = stu.score;
        System.out.println(score);

    }
}

