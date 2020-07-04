package com.accp.domain;

public class BillDetail {
    private String billno;

    private Integer lineid;

    private String goodsname;

    private Integer goodsnum;

    private Double goodsprice;

    private Double goodsmoneyamt;

    private Integer ispresent;

    public String getBillno() {
        return billno;
    }

    public void setBillno(String billno) {
        this.billno = billno;
    }

    public Integer getLineid() {
        return lineid;
    }

    public void setLineid(Integer lineid) {
        this.lineid = lineid;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public Integer getGoodsnum() {
        return goodsnum;
    }

    public void setGoodsnum(Integer goodsnum) {
        this.goodsnum = goodsnum;
    }

    public Double getGoodsprice() {
        return goodsprice;
    }

    public void setGoodsprice(Double goodsprice) {
        this.goodsprice = goodsprice;
    }

    public Double getGoodsmoneyamt() {
        return goodsmoneyamt;
    }

    public void setGoodsmoneyamt(Double goodsmoneyamt) {
        this.goodsmoneyamt = goodsmoneyamt;
    }

    public Integer getIspresent() {
        return ispresent;
    }

    public void setIspresent(Integer ispresent) {
        this.ispresent = ispresent;
    }
}