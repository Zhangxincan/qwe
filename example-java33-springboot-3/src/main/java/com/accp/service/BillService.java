package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.BillDetailMapper;
import com.accp.dao.BillMapper;
import com.accp.domain.Bill;
import com.accp.domain.BillDetail;
import com.accp.domain.BillDetailExample;

@Service
@Transactional
public class BillService {
	
	@Autowired
	private BillMapper mapper;
	
	@Autowired
	private BillDetailMapper detailMapper;
	
	public List<Bill> find(){
		List<Bill> list = mapper.selectByExample(null);
		for(Bill b:list) {
			BillDetailExample example = new BillDetailExample();
			example.createCriteria().andBillnoEqualTo(b.getBillno());
			List<BillDetail> details = detailMapper.selectByExample(example);
			double sumprice = 0;
			for(BillDetail d:details) {
				sumprice+=d.getGoodsmoneyamt();
			}
			b.setSumprice(sumprice);
		}
		return list;
	}
	
	public Bill findByBillNo(String billno) {
		Bill b = mapper.selectByPrimaryKey(billno);
		BillDetailExample example = new BillDetailExample();
		example.createCriteria().andBillnoEqualTo(billno);
		List<BillDetail> details = detailMapper.selectByExample(example);
		b.setDetails(details);
		return b;
	}

	public int create(Bill bill) {
		int count = mapper.insert(bill);
		if(count>0) {
			for(BillDetail d : bill.getDetails()) {
				d.setBillno(bill.getBillno());
				detailMapper.insert(d);
			}
		}
		return count;
	}
	public String findMaxBillNo(String billDate) {
		String billno = mapper.findMaxBillNo(billDate);
		if(billno==null) {
			return billDate.replaceAll("-", "")+"001";
		}else {
			String suffix = billno.substring(9, billno.length());
			int sf = Integer.valueOf(suffix);
			if(sf<10) {
				return billDate.replaceAll("-", "")+"00"+(sf+1);
			}else if(sf<100) {
				return billDate.replaceAll("-", "")+"0"+(sf+1);
			}else {
				return billDate.replaceAll("-", "")+(sf+1);
			}
		}
	}
}
