package com.accp.dao;

import com.accp.domain.Bill;
import com.accp.domain.BillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BillMapper {
	String findMaxBillNo(String billdate);
	
    int countByExample(BillExample example);

    int deleteByExample(BillExample example);

    int deleteByPrimaryKey(String billno);

    int insert(Bill record);

    int insertSelective(Bill record);

    List<Bill> selectByExample(BillExample example);

    Bill selectByPrimaryKey(String billno);

    int updateByExampleSelective(@Param("record") Bill record, @Param("example") BillExample example);

    int updateByExample(@Param("record") Bill record, @Param("example") BillExample example);

    int updateByPrimaryKeySelective(Bill record);

    int updateByPrimaryKey(Bill record);
}