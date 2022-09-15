package com.company.project.service;
import com.company.project.bean.Customer;

/**
 * @Author: Robin_Wujw
 * @Date: 2021/9/8 12:56
 * 内部用数组管理一组Customer对象，并提供相应的添加、修改、删除和遍历方法供CustomerView调用
 */
public class CustomerList {
    private Customer[] customers;
    private int total = 0;
    /*
     * @Author Robin_Wu
     * @Description 用来初始化customers数组的构造器
     * @Date 13:14 2021/9/8
     * @Param [totalCustomer] 指定数组的长度
     * @return
     **/
    public CustomerList(int totalCustomer){
        customers = new Customer[totalCustomer];
    }
    /*
     * @Author Robin_Wu
     * @Description  将指定客户添加到数组中
     * @Date 13:15 2021/9/8
     * @Param [customer]
     * @return boolean 添加成功则True 否则 False
     **/
    public boolean addCustomer(Customer customer){
        if(total >= customers.length){
            return false;
        }
        customers[total] = customer;
        total++;
        return true;
    }
    /*
     * @Author Robin_Wu
     * @Description 修改指定索引位置的客户信息
     * @Date 13:17 2021/9/8
     * @Param [index, cust]
     * @return boolean 修改成功 true 否则 false
     **/
    public boolean replaceCustomer(int index,Customer cust){
        if(index < 0 || index >= total){
            return false;
        }
        customers[index]  = cust;
        return true;
    }
    /*
     * @Author Robin_Wu
     * @Description  删除指定索引位置上的客户
     * @Date 13:30 2021/9/8
     * @Param [index]
     * @return boolean true删除成功 false 删除失败
     **/
    public boolean deleteCustomer(int index){
        if(index < 0 || index >= total){
            return false;
        }
        for(int i = index;i<total-1;i++){
            customers[i] = customers[i+1];
        }
        //最后有数据的元素需要置空
        customers[total-1] = null;
        total--;
        return true;
    }
    /*
     * @Author Robin_Wu
     * @Description 获取所有的客户信息
     * @Date 13:34 2021/9/8
     * @Param []
     * @return com.company.project.bean.Customer[]
     **/
    public Customer[] getAllCustomers(){
        Customer[] custs = new Customer[total];
        for(int i =0 ;i<total;i++){
            custs[i] = customers[i];
        }
        return custs;
    }
    /*
     * @Author Robin_Wu
     * @Description 获取指定索引位置上的客户
     * @Date 13:38 2021/9/8
     * @Param [index]
     * @return com.company.project.bean.Customer 如果找到了元素则返回，没有则返回null
     **/
    public Customer getCustomer(int index){
        if(index < 0 || index >= total){
            return null;
        }
        return customers[index];
    }
    /*
     * @Author Robin_Wu
     * @Description  获取存储的客户的数量
     * @Date 13:39 2021/9/8
     * @Param []
     * @return int
     **/
    public int getTotal(){
        return total;
    }

}
