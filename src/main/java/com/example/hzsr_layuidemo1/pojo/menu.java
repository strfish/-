package com.example.hzsr_layuidemo1.pojo;

import java.util.Date;


public class menu {
    private int menuid; //主键
    private String menuname; //菜单名称
    private String urllink; //链接
    private int parentid; //父菜单id
    private int sortid; //菜单排序
    private int prodid; //项目id
    private int mtype; //1.普通菜单 2.初始菜单
    private Date createtime; //创建时间
    private Date updatedata; //修改时间
    private int imgtype; // 0.有图标 1无图标
    private String menuimage;// 菜单图标
    private int storageflag;


    public int getMenuid() {
        return menuid;
    }

    public void setMenuid(int menuid) {
        this.menuid = menuid;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    public String getUrllink() {
        return urllink;
    }

    public void setUrllink(String urllink) {
        this.urllink = urllink;
    }

    public int getParentid() {
        return parentid;
    }

    public void setParentid(int parentid) {
        this.parentid = parentid;
    }

    public int getSortid() {
        return sortid;
    }

    public void setSortid(int sortid) {
        this.sortid = sortid;
    }

    public int getProdid() {
        return prodid;
    }

    public void setProdid(int prodid) {
        this.prodid = prodid;
    }

    public int getMtype() {
        return mtype;
    }

    public void setMtype(int mtype) {
        this.mtype = mtype;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatedata() {
        return updatedata;
    }

    public void setUpdatedata(Date updatedata) {
        this.updatedata = updatedata;
    }

    public int getImgtype() {
        return imgtype;
    }

    public void setImgtype(int imgtype) {
        this.imgtype = imgtype;
    }

    public String getMenuimage() {
        return menuimage;
    }

    public void setMenuimage(String menuimage) {
        this.menuimage = menuimage;
    }

    public int getStorageflag() {
        return storageflag;
    }

    public void setStorageflag(int storageflag) {
        this.storageflag = storageflag;
    }

    @Override
    public String toString() {
        return "menu{" +
                "menuid=" + menuid +
                ", menuname='" + menuname + '\'' +
                ", urllink='" + urllink + '\'' +
                ", parentid=" + parentid +
                ", sortid=" + sortid +
                ", prodid=" + prodid +
                ", mtype=" + mtype +
                ", createtime=" + createtime +
                ", updatedata=" + updatedata +
                ", imgtype=" + imgtype +
                ", menuimage='" + menuimage + '\'' +
                ", storageflag=" + storageflag +
                '}';
    }
}
