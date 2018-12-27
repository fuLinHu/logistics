package com.aiwen.logistics.dao;

import com.aiwen.logistics.pojo.Menu;
import com.aiwen.logistics.pojo.MenuExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface MenuMapper {

    List<Menu> findListBy(Menu menu);

    int countByExample(MenuExample example);

    int deleteByExample(MenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Menu record);

    int insertSelective(Menu record);

    List<Menu> selectByExampleWithRowbounds(MenuExample example, RowBounds rowBounds);

    List<Menu> selectByExample(MenuExample example);

    Menu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByExample(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
}