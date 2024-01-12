package com.example.hzsr_layuidemo1.mapper;

import com.example.hzsr_layuidemo1.pojo.menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface MenuMapper {
    @Select("select * from hzsr_base_config_menu where parentid = 0")
    public List<menu> findAll();
}
