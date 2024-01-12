package com.example.hzsr_layuidemo1.mapper;


import com.example.hzsr_layuidemo1.pojo.student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface UserMapper {
    @Select("select * from tbstudent")
    public List<student> findAll();
}
