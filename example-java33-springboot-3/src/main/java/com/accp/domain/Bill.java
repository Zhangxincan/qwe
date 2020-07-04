package com.accp.domain;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Bill {
    private String billno;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date billdate;

    private String suppliername;

    private String supplieraddress;

    private String department;

    private String warehouse;

    private String buyer;

    private String executor;
    
    private Double sumprice;
    public void setSumprice(Double sumprice) {
		this.sumprice = sumprice;
	}
    
    public Double getSumprice() {
		return sumprice;
	}
    
    private List<BillDetail> details;
    public void setDetails(List<BillDetail> details) {
		this.details = details;
	}
    
    public List<BillDetail> getDetails() {
		return details;
	}

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno;
    }

    public Date getBilldate() {
        return billdate;
    }

    public void setBilldate(Date billdate) {
        this.billdate = billdate;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
    }

    public String getSupplieraddress() {
        return supplieraddress;
    }

    public void setSupplieraddress(String supplieraddress) {
        this.supplieraddress = supplieraddress;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }
}