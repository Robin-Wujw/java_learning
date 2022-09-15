/**
 * 泛型的擦除
 * 1.继承|实现声明不指定类型
 * 2.使用时不指定类型
 * 统一Object对待
 * 1.编译器警告 消除警告使用Object
 * 2.不完全等同于Object，编译不会类型检查
 * @Author: Robin_Wujw
 * @Date: 2022-04-17 16:33
 */
public class Student03<T> {
    private T javaScore;
    private T oracleScore;

    public T getJavaScore() {
        return javaScore;
    }

    public void setJavaScore(T javaScore) {
        this.javaScore = javaScore;
    }

    public T getOracleScore() {
        return oracleScore;
    }

    public void setOracleScore(T oracleScore) {
        this.oracleScore = oracleScore;
    }

    public static void main(String[] args) {
        Student03 stu1 = new Student03();
        Student03<Object> stu = new Student03<Object>();

        test(stu1); //stu1相当于Object 但是不完全等同于Object
        //擦除，不会类型检查
        //test(stu);
        test1(stu1);
        test1(stu);
    }
    public static void test(Student03<Integer> a ){

    }
    public static void test1(Student03<?> a ){

    }
}