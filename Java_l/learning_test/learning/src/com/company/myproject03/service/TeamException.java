package com.company.myproject03.service;

/**
 * 自定义异常类
 * @Author: Robin_Wujw
 * @Date: 2022/3/21 19:55
 */
public class TeamException extends Exception{
    static final long serialVersionUID = -3387514229948L;

    public TeamException(){
        super();
    }
    public TeamException(String msg){
        super(msg);
    }
}
