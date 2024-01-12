package com.example.hzsr_layuidemo1.pojo;

public class student {
    private int id;
    private String stuname;
    private boolean stusex;
    private String stubirth;
    private String stuaddr;
    private int stuphoto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname;
    }

    public boolean isStusex() {
        return stusex;
    }

    public void setStusex(boolean stusex) {
        this.stusex = stusex;
    }

    public String getStubirth() {
        return stubirth;
    }

    public void setStubirth(String stubirth) {
        this.stubirth = stubirth;
    }

    public String getStuaddr() {
        return stuaddr;
    }

    public void setStuaddr(String stuaddr) {
        this.stuaddr = stuaddr;
    }

    public int getStuphoto() {
        return stuphoto;
    }

    public void setStuphoto(int stuphoto) {
        this.stuphoto = stuphoto;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", stuname='" + stuname + '\'' +
                ", stusex=" + stusex +
                ", stubirth='" + stubirth + '\'' +
                ", stuaddr='" + stuaddr + '\'' +
                ", stuphoto=" + stuphoto +
                '}';
    }
}
