package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Bill;
import com.accp.service.BillService;

/**
 * @author admin
 *
 */
@Controller
public class BillController {
	
	@Autowired
	private BillService service;
	
	@RequestMapping("/toBill")
	public String toBill() {
		return "bill";
	}
	@RequestMapping("/find")
	@ResponseBody
	public List<Bill> find(){
		return service.find();
	}
	@RequestMapping("/findByBillNo")
	@ResponseBody
	public Bill findByBillNo(String billno) {
		return service.findByBillNo(billno);
	}
	@RequestMapping("/create")
	@ResponseBody
	public int create(@RequestBody Bill bill) {
		int count = service.create(bill);
		return count;
	}
	@RequestMapping("/findMaxBillNo")
	@ResponseBody
	public String findMaxBillNo(String billDate) {
		return service.findMaxBillNo(billDate);
	}
}
