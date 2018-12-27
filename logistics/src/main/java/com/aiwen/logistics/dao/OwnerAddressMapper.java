package com.aiwen.logistics.dao;

import com.aiwen.logistics.pojo.OwnerAddress;
import com.aiwen.logistics.pojo.OwnerAddressExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface OwnerAddressMapper {
    int countByExample(OwnerAddressExample example);

    int deleteByExample(OwnerAddressExample example);

    int deleteByPrimaryKey(Integer ownerAddressId);

    int insert(OwnerAddress record);

    int insertSelective(OwnerAddress record);

    List<OwnerAddress> selectByExampleWithRowbounds(OwnerAddressExample example, RowBounds rowBounds);

    List<OwnerAddress> selectByExample(OwnerAddressExample example);

    OwnerAddress selectByPrimaryKey(Integer ownerAddressId);

    int updateByExampleSelective(@Param("record") OwnerAddress record, @Param("example") OwnerAddressExample example);

    int updateByExample(@Param("record") OwnerAddress record, @Param("example") OwnerAddressExample example);

    int updateByPrimaryKeySelective(OwnerAddress record);

    int updateByPrimaryKey(OwnerAddress record);
}