package TestJavassist.test;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-07-08 19:27
 */
@Author(name="Robin",year=2022)
public class Emp {
    private int empno;
    private String ename;

    public void sayHello(int a){
        System.out.println("sayHello,"+a);
    }
    public int getEmpno() {
        return empno;
    }
    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Emp(int empno, String ename) {
        this.empno = empno;
        this.ename = ename;
    }

    public Emp() {
    }
}
