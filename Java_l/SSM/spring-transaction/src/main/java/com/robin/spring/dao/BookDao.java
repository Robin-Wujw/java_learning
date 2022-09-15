package com.robin.spring.dao;

import org.springframework.stereotype.Repository;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-08-30 23:20
 */

public interface BookDao {
    /**
     * 根据图书id查询图书价格
     * @param bookId
     * @return
     */
    Integer getPriceByBookId(Integer bookId);

    /**
     * 更新图书的库存
     * @param bookId
     */

    void updateStock(Integer bookId);

    /**
     * 更新图书的余额
     * @param userId
     * @param price
     */

    void updateBalance(Integer userId, Integer price);
}
