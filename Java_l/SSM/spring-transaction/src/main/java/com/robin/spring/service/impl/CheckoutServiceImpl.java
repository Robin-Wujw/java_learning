package com.robin.spring.service.impl;

import com.robin.spring.service.BookService;
import com.robin.spring.service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-08-31 0:23
 */
@Service
public class CheckoutServiceImpl implements CheckoutService {

    @Autowired
    private BookService bookService;
    @Override
    public void checkout(Integer userId, Integer[] bookIds) {
        for(Integer bookId:bookIds){
            bookService.buyBook(userId,bookId);
        }
    }
}
