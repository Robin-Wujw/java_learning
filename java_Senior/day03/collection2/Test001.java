import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-04-15 15:59
 */
public class Test001 {
    public static void main(String[] args) {
        Employee e = new Employee(0301,"Robin",3000,"项目部","2007-10");
        Employee e2 = new Employee(0302,"Robin2",3000,"教学部","2009-10");
        Employee e3 = new Employee(0303,"Robin3",3000,"项目部","2008-10");
        List<Employee> list  = new ArrayList<Employee>();

        list.add(e);
        list.add(e2);
        list.add(e3);
        printEmpName(list);
    }

    public static void printEmpName(List<Employee> list){
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i).getName());
        }
    }
}
