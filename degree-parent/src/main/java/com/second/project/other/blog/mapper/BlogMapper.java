package com.second.project.other.blog.mapper;//package com.second.project.other.blog.mapper;
//
//import com.second.project.other.blog.pojo.Blog;
//import com.second.project.other.blog.pojo.BlogExample;
//import org.apache.ibatis.annotations.Param;
//
//import java.util.List;
//
//public interface BlogMapper {
//    /**
//     * This method was generated by MyBatis Generator.
//     * This method corresponds to the database table blog
//     *
//     * @mbggenerated Fri Oct 21 15:15:23 CST 2022
//     */
//    int countByExample(BlogExample example);
//
//    /**
//     * This method was generated by MyBatis Generator.
//     * This method corresponds to the database table blog
//     *
//     * @mbggenerated Fri Oct 21 15:15:23 CST 2022
//     */
//    int deleteByExample(BlogExample example);
//
//    /**
//     * This method was generated by MyBatis Generator.
//     * This method corresponds to the database table blog
//     *
//     * @mbggenerated Fri Oct 21 15:15:23 CST 2022
//     */
//    int deleteByPrimaryKey(Integer id);
//
//    /**
//     * This method was generated by MyBatis Generator.
//     * This method corresponds to the database table blog
//     *
//     * @mbggenerated Fri Oct 21 15:15:23 CST 2022
//     */
//    int insert(Blog record);
//
//    /**
//     * This method was generated by MyBatis Generator.
//     * This method corresponds to the database table blog
//     *
//     * @mbggenerated Fri Oct 21 15:15:23 CST 2022
//     */
//    int insertSelective(Blog record);
//
//    /**
//     * This method was generated by MyBatis Generator.
//     * This method corresponds to the database table blog
//     *
//     * @mbggenerated Fri Oct 21 15:15:23 CST 2022
//     */
//    List<Blog> selectByExampleWithBLOBs(BlogExample example);
//
//    /**
//     * This method was generated by MyBatis Generator.
//     * This method corresponds to the database table blog
//     *
//     * @mbggenerated Fri Oct 21 15:15:23 CST 2022
//     */
//    List<Blog> selectByExample(BlogExample example);
//
//    /**
//     * This method was generated by MyBatis Generator.
//     * This method corresponds to the database table blog
//     *
//     * @mbggenerated Fri Oct 21 15:15:23 CST 2022
//     */
//    Blog selectByPrimaryKey(Integer id);
//
//    /**
//     * This method was generated by MyBatis Generator.
//     * This method corresponds to the database table blog
//     *
//     * @mbggenerated Fri Oct 21 15:15:23 CST 2022
//     */
//    int updateByExampleSelective(@Param("record") Blog record, @Param("example") BlogExample example);
//
//    /**
//     * This method was generated by MyBatis Generator.
//     * This method corresponds to the database table blog
//     *
//     * @mbggenerated Fri Oct 21 15:15:23 CST 2022
//     */
//    int updateByExampleWithBLOBs(@Param("record") Blog record, @Param("example") BlogExample example);
//
//    /**
//     * This method was generated by MyBatis Generator.
//     * This method corresponds to the database table blog
//     *
//     * @mbggenerated Fri Oct 21 15:15:23 CST 2022
//     */
//    int updateByExample(@Param("record") Blog record, @Param("example") BlogExample example);
//
//    /**
//     * This method was generated by MyBatis Generator.
//     * This method corresponds to the database table blog
//     *
//     * @mbggenerated Fri Oct 21 15:15:23 CST 2022
//     */
//    int updateByPrimaryKeySelective(Blog record);
//
//    /**
//     * This method was generated by MyBatis Generator.
//     * This method corresponds to the database table blog
//     *
//     * @mbggenerated Fri Oct 21 15:15:23 CST 2022
//     */
//    int updateByPrimaryKeyWithBLOBs(Blog record);
//
//    /**
//     * This method was generated by MyBatis Generator.
//     * This method corresponds to the database table blog
//     *
//     * @mbggenerated Fri Oct 21 15:15:23 CST 2022
//     */
//    int updateByPrimaryKey(Blog record);
//}