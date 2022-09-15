package com.company.myproject03.junit;

import com.company.myproject03.domain.Employee;
import com.company.myproject03.service.NameListService;
import com.company.myproject03.service.TeamException;
import org.junit.Test;

/**
 * 对NameListService的测试
 * @Author: Robin_Wujw
 * @Date: 2022/3/21 20:09
 */
public class NameListServiceTest {
    @Test
    public void testGetAllEmployees(){
        NameListService service = new NameListService();
        Employee[] employees = service.getAllEmployees();
        for(int i =0;i<employees.length;i++){
            System.out.println(employees[i]);
        }
    }
    @Test
    public void testGetEmployee(){
        NameListService service = new NameListService();
        int id = 110;

        try {
            Employee employee = service.getEmployee(id);
            System.out.println(employee);
        }catch (TeamException e){
            System.out.println(e.getMessage());
        }
    }
}
