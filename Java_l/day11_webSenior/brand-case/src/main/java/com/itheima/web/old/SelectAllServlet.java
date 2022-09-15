package com.itheima.web.old; /**
 * @Author: Robin_Wujw
 * @Date: 2022-08-18 19:22
 */

import com.alibaba.fastjson.JSON;
import com.itheima.pojo.Brand;
import com.itheima.service.BrandService;
import com.itheima.service.impl.BrandServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

//@WebServlet("/selectAllServlet")
public class SelectAllServlet extends HttpServlet {
    private BrandService brandService = new BrandServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        //1.调用service查询
        List<Brand> brands = brandService.selectAll();
        //2.转为json
        String jsonString = JSON.toJSONString(brands);
        //3.写数据
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(jsonString);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        this.doGet(request, response);
    }
}