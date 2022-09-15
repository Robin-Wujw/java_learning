package mapper;

import org.apache.ibatis.annotations.*;
import pojo.Brand;

import java.util.List;

/**
 * @Author: Robin_Wujw
 * @Date: 2022-08-08 19:48
 */
public interface BrandMapper {

    /**
     * 查询所有
     * @return
     */
    @Select("select * from tb_brand")
    @ResultMap("brandResultMap")
    List<Brand> selctAll();

    @Insert("insert into tb_brand values(null,#{brandName},#{companyName},#{ordered},#{description},#{status})")
    void add(Brand brand);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @Select("select * from tb_brand where id=#{id}")
    @ResultMap("brandResultMap")
    Brand selectById(int id);

    /**
     * 修改
     * @param brand
     */
    @Update("update tb_brand set brand_name = #{brandName},company_name = #{companyName},ordered = #{ordered},description = #{description},status=#{status} where id = #{id}")
    void update(Brand brand);

    @Delete("delete from tb_brand where id = #{id}")
    void deleteById(int id);
}
