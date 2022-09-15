package com.robin.spring.service;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-08-31 0:22
 */
public interface CheckoutService {
    void checkout(Integer userId, Integer[] bookIds);
}
