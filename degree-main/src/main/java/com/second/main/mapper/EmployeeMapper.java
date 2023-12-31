package com.second.main.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.second.main.entity.EmployeeEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * {@code @author}  chou401
 * {@code @date} 2023/12/1
 * {@code @description} EmployeeMapper
 */
public interface EmployeeMapper extends BaseMapper<EmployeeEntity> {

    @Insert("<script>" +
            "insert into employee (age, employee_name, birth_date, gender, id_number, create_time, update_time, status) " +
            "values " +
            "<foreach collection='employeeList' item='employee' index='index' separator=','>" +
            "(#{employee.age}, #{employee.employeeName}, #{employee.birthDate}, #{employee.gender}, #{employee.idNumber}, #{employee.createTime}, #{employee.updateTime}, #{employee.status})" +
            "</foreach>" +
            "</script>")
    Integer saveBatchEmployee(@Param("employeeList") List<EmployeeEntity> employeeList);

}
