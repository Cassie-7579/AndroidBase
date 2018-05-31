package com.fengzhi.mybase.bean;

import java.util.List;

/**
 * 供应商数据
 * Created by admin on 2018/3/23.
 */

public class SupplierDataBean {


    /**
     * data : [{"fid":12,"sex":2,"borndate":"","bankaccount":"","remark":"",
     * "createdate":"2018-04-11 15:38:11","type":44,"contact":"","business":"","city":"",
     * "invoice_type":1,"mobile_phone":"","area":"","level":"B","nature":1,"settle_way":2,
     * "name":"ff","province":"","bank":"","invoice_address":"","license":"","qq":"",
     * "taxpoint":0.8,"office_phone":"d","post":"","fax":"","form":"","website":"","code":"11",
     * "supply_type":2,"typeName":"汽修厂","address":"","email":"","zero_type":1,"badrecord":"",
     * "wechat":"","enddate":"","editdate":"2018-04-11 18:02:58"},{"fid":11,"sex":1,
     * "borndate":"","bankaccount":"","remark":"","createdate":"2018-04-10 17:47:54","type":45,
     * "contact":"","business":"","city":"","invoice_type":1,"mobile_phone":"","area":"",
     * "level":"B","nature":1,"settle_way":1,"name":"","province":"","bank":"",
     * "invoice_address":"","license":"","qq":"","taxpoint":0.8,"office_phone":"","post":"",
     * "fax":"","form":"","website":"","code":"2222","supply_type":1,"typeName":"汽配厂",
     * "address":"","email":"","zero_type":1,"badrecord":"","wechat":"","enddate":"",
     * "editdate":"2018-04-11 14:05:15"},{"fid":10,"sex":2,"borndate":"","bankaccount":"",
     * "remark":"","createdate":"2018-04-10 16:34:29","type":43,"contact":"","business":"",
     * "city":"","invoice_type":1,"mobile_phone":"","area":"","level":"C","nature":2,
     * "settle_way":2,"name":"222","province":"","bank":"","invoice_address":"","license":"",
     * "qq":"","taxpoint":0.8,"office_phone":"","post":"","fax":"","form":"","website":"",
     * "code":"111","supply_type":2,"typeName":"维修站","address":"","email":"","zero_type":1,
     * "badrecord":"","wechat":"","enddate":"","editdate":"2018-04-11 14:59:38"},{"fid":1,
     * "sex":1,"borndate":"1","bankaccount":"1","remark":"12","createdate":"2018-01-24 16:38:34",
     * "type":45,"contact":"1","business":"1","city":"1","invoice_type":1,"mobile_phone":"1",
     * "area":"","level":"A","nature":1,"settle_way":1,"name":"supplier","taxID":"1",
     * "province":"1","bank":"1","invoice_address":"1","license":"1","qq":"1","taxpoint":0,
     * "office_phone":"1","post":"1","fax":"1","form":"","website":"1","code":"001",
     * "supply_type":1,"postcode":"1","typeName":"汽配厂","address":"1","email":"1","zero_type":1,
     * "badrecord":"","wechat":"1","enddate":"","editdate":"2018-04-11 10:43:30"}]
     * errcode : 0
     * message : 成功
     * success : true
     */

    private int errcode;
    private String message;
    private boolean success;
    private List<DataBean> data;

    public int getErrcode() {
        return errcode;
    }

    public void setErrcode(int errcode) {
        this.errcode = errcode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * fid : 12
         * sex : 2
         * borndate :
         * bankaccount :
         * remark :
         * createdate : 2018-04-11 15:38:11
         * type : 44
         * contact :
         * business :
         * city :
         * invoice_type : 1
         * mobile_phone :
         * area :
         * level : B
         * nature : 1
         * settle_way : 2
         * name : ff
         * province :
         * bank :
         * invoice_address :
         * license :
         * qq :
         * taxpoint : 0.8
         * office_phone : d
         * post :
         * fax :
         * form :
         * website :
         * code : 11
         * supply_type : 2
         * typeName : 汽修厂
         * address :
         * email :
         * zero_type : 1
         * badrecord :
         * wechat :
         * enddate :
         * editdate : 2018-04-11 18:02:58
         * taxID : 1
         * postcode : 1
         */

        private int fid;
        private int sex;
        private String borndate;
        private String bankaccount;
        private String remark;
        private String createdate;
        private int type;
        private String contact;
        private String business;
        private String city;
        private int invoice_type;
        private String mobile_phone;
        private String area;
        private String level;
        private int nature;
        private int settle_way;
        private String name;
        private String province;
        private String bank;
        private String invoice_address;
        private String license;
        private String qq;
        private double taxpoint;
        private String office_phone;
        private String post;
        private String fax;
        private String form;
        private String website;
        private String code;
        private int supply_type;
        private String typeName;
        private String address;
        private String email;
        private int zero_type;
        private String badrecord;
        private String wechat;
        private String enddate;
        private String editdate;
        private String taxID;
        private String postcode;

        public int getFid() {
            return fid;
        }

        public void setFid(int fid) {
            this.fid = fid;
        }

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }

        public String getBorndate() {
            return borndate;
        }

        public void setBorndate(String borndate) {
            this.borndate = borndate;
        }

        public String getBankaccount() {
            return bankaccount;
        }

        public void setBankaccount(String bankaccount) {
            this.bankaccount = bankaccount;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        public String getCreatedate() {
            return createdate;
        }

        public void setCreatedate(String createdate) {
            this.createdate = createdate;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getContact() {
            return contact;
        }

        public void setContact(String contact) {
            this.contact = contact;
        }

        public String getBusiness() {
            return business;
        }

        public void setBusiness(String business) {
            this.business = business;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public int getInvoice_type() {
            return invoice_type;
        }

        public void setInvoice_type(int invoice_type) {
            this.invoice_type = invoice_type;
        }

        public String getMobile_phone() {
            return mobile_phone;
        }

        public void setMobile_phone(String mobile_phone) {
            this.mobile_phone = mobile_phone;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getLevel() {
            return level;
        }

        public void setLevel(String level) {
            this.level = level;
        }

        public int getNature() {
            return nature;
        }

        public void setNature(int nature) {
            this.nature = nature;
        }

        public int getSettle_way() {
            return settle_way;
        }

        public void setSettle_way(int settle_way) {
            this.settle_way = settle_way;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getBank() {
            return bank;
        }

        public void setBank(String bank) {
            this.bank = bank;
        }

        public String getInvoice_address() {
            return invoice_address;
        }

        public void setInvoice_address(String invoice_address) {
            this.invoice_address = invoice_address;
        }

        public String getLicense() {
            return license;
        }

        public void setLicense(String license) {
            this.license = license;
        }

        public String getQq() {
            return qq;
        }

        public void setQq(String qq) {
            this.qq = qq;
        }

        public double getTaxpoint() {
            return taxpoint;
        }

        public void setTaxpoint(double taxpoint) {
            this.taxpoint = taxpoint;
        }

        public String getOffice_phone() {
            return office_phone;
        }

        public void setOffice_phone(String office_phone) {
            this.office_phone = office_phone;
        }

        public String getPost() {
            return post;
        }

        public void setPost(String post) {
            this.post = post;
        }

        public String getFax() {
            return fax;
        }

        public void setFax(String fax) {
            this.fax = fax;
        }

        public String getForm() {
            return form;
        }

        public void setForm(String form) {
            this.form = form;
        }

        public String getWebsite() {
            return website;
        }

        public void setWebsite(String website) {
            this.website = website;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public int getSupply_type() {
            return supply_type;
        }

        public void setSupply_type(int supply_type) {
            this.supply_type = supply_type;
        }

        public String getTypeName() {
            return typeName;
        }

        public void setTypeName(String typeName) {
            this.typeName = typeName;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public int getZero_type() {
            return zero_type;
        }

        public void setZero_type(int zero_type) {
            this.zero_type = zero_type;
        }

        public String getBadrecord() {
            return badrecord;
        }

        public void setBadrecord(String badrecord) {
            this.badrecord = badrecord;
        }

        public String getWechat() {
            return wechat;
        }

        public void setWechat(String wechat) {
            this.wechat = wechat;
        }

        public String getEnddate() {
            return enddate;
        }

        public void setEnddate(String enddate) {
            this.enddate = enddate;
        }

        public String getEditdate() {
            return editdate;
        }

        public void setEditdate(String editdate) {
            this.editdate = editdate;
        }

        public String getTaxID() {
            return taxID;
        }

        public void setTaxID(String taxID) {
            this.taxID = taxID;
        }

        public String getPostcode() {
            return postcode;
        }

        public void setPostcode(String postcode) {
            this.postcode = postcode;
        }
    }
}
