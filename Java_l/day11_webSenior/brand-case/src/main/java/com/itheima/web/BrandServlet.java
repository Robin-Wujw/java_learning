package com.itheima.web;

import com.alibaba.fastjson.JSON;
import com.itheima.pojo.Brand;
import com.itheima.pojo.PageBean;
import com.itheima.service.BrandService;
import com.itheima.service.impl.BrandServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-08-23 21:12
 */
@WebServlet("/brand/*")
public class BrandServlet extends BaseServlet {
    private BrandService brandService = new BrandServiceImpl();
    public void selectAll(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        //1.调用service查询
        List<Brand> brands = brandService.selectAll();
        //2.转为json
        String jsonString = JSON.toJSONString(brands);
        //3.写数据
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(jsonString);
    }

    public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        //1.接收品牌数据
        BufferedReader br = request.getReader();
        String params = br.readLine();//json字符串

        //转为Brand对象
        Brand brand = JSON.parseObject(params,Brand.class);

        //2.调用service添加
        brandService.add(brand);

        //3.响应成功的标识
        response.getWriter().write("success");
    }

    public void update(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        //1.接收品牌数据
        BufferedReader br = request.getReader();
        String params = br.readLine();//json字符串

        //转为Brand对象
        Brand brand = JSON.parseObject(params,Brand.class);

        //2.调用service添加
        brandService.update(brand);

        //3.响应成功的标识
        response.getWriter().write("success");

    }
    public void deleteById(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        //this parameter is transited by GET way, so no need JSON.parseObject
        String sid = request.getParameter("id");
        //convert to int
        int id = Integer.parseInt(sid);

        brandService.deleteById(id);

        response.getWriter().write("success");
    }

    /**
     * 批量删除
     */
    public void deleteByIds(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        //1.接收数据 [1,2,3]
        BufferedReader br = request.getReader();
        String params = br.readLine();//json字符串

        //转为int[]
        int[] ids = JSON.parseObject(params,int[].class);

        //2.调用service添加
        brandService.deleteByIds(ids);

        //3.响应成功的标识
        response.getWriter().write("success");
    }

    /**
     * 分页查询
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void selectByPage(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        //1.接收当前页码和每页展示条数 url?currentPage=1&pageSize=5
        String _currentPage = request.getParameter("currentPage");
        String _pageSize = request.getParameter("pageSize");

        int currentPage = Integer.parseInt(_currentPage);
        int pageSize = Integer.parseInt(_pageSize);

        PageBean<Brand> pageBean= brandService.selectByPage(currentPage,pageSize);
        //2.转为json
        String jsonString = JSON.toJSONString(pageBean);
        //3.写数据
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(jsonString);

    }
    /**
     * 分页条件查询
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void selectByPageAndCondition(HttpServletRequest request, HttpServletResponse response) throws ServletException,
            IOException {
        //1.接收当前页码和每页展示条数 url?currentPage=1&pageSize=5
        String _currentPage = request.getParameter("currentPage");
        String _pageSize = request.getParameter("pageSize");

        int currentPage = Integer.parseInt(_currentPage);
        int pageSize = Integer.parseInt(_pageSize);

        //获取查询条件对象
        BufferedReader br = request.getReader();
        String params = br.readLine();//json字符串

        //转为Brand对象
        Brand brand = JSON.parseObject(params,Brand.class);

        PageBean<Brand> pageBean= brandService.selectByPageAndCondition(currentPage,pageSize,brand);
        //2.转为json
        String jsonString = JSON.toJSONString(pageBean);
        //3.写数据
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(jsonString);

    }
}
