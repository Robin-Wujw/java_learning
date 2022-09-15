package com.company.java12;

/**
 * @Author: Robin_Wujw
 * @Date: 2022/3/15 18:39
 * //自定义异常类
 *
 */
public class EcDef extends Exception{
    static final long serialVersionUID = -33875164229948L;
    public EcDef(){

    }
    public EcDef(String msg){
        super(msg);
    }
}
