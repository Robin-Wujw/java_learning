package com.robin.spring.service;

import org.springframework.stereotype.Service;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-08-30 23:19
 */

public interface BookService {
    /**
     * 买书
     * @param userId
     * @param bookId
     */
    void buyBook(Integer userId, Integer bookId);
}
