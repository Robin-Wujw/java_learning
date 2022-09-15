package mapper;

import pojo.tbUser;

import java.util.List;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-07-19 19:38
 */
public interface UserMapper {

    List<tbUser> selectAll();
    tbUser selectById();
}
