package com.accp.dao;

import com.accp.domain.BillDetail;
import com.accp.domain.BillDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BillDetailMapper {
    int countByExample(BillDetailExample example);

    int deleteByExample(BillDetailExample example);

    int insert(BillDetail record);

    int insertSelective(BillDetail record);

    List<BillDetail> selectByExample(BillDetailExample example);

    int updateByExampleSelective(@Param("record") BillDetail record, @Param("example") BillDetailExample example);

    int updateByExample(@Param("record") BillDetail record, @Param("example") BillDetailExample example);
}