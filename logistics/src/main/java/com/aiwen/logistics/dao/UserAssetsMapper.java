package com.aiwen.logistics.dao;

import com.aiwen.logistics.pojo.UserAssets;
import com.aiwen.logistics.pojo.UserAssetsExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface UserAssetsMapper {
    int countByExample(UserAssetsExample example);

    int deleteByExample(UserAssetsExample example);

    int deleteByPrimaryKey(Integer assetsId);

    int insert(UserAssets record);

    int insertSelective(UserAssets record);

    List<UserAssets> selectByExampleWithRowbounds(UserAssetsExample example, RowBounds rowBounds);

    List<UserAssets> selectByExample(UserAssetsExample example);

    UserAssets selectByPrimaryKey(Integer assetsId);

    int updateByExampleSelective(@Param("record") UserAssets record, @Param("example") UserAssetsExample example);

    int updateByExample(@Param("record") UserAssets record, @Param("example") UserAssetsExample example);

    int updateByPrimaryKeySelective(UserAssets record);

    int updateByPrimaryKey(UserAssets record);

    public List<UserAssets> selectByUserId(@Param("userId") Integer id,@Param("flag") Integer flag);


}