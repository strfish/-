package com.example.hzsr_layuidemo1.Vo;

import java.util.List;

public class menusonVo {
    private String title;
    private String icon;
    private List<menusonVo> list;
    private String jump;
    private boolean spread;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public List<menusonVo> getList() {
        return list;
    }

    public void setList(List<menusonVo> list) {
        this.list = list;
    }

    public String getJump() {
        return jump;
    }

    public void setJump(String jump) {
        this.jump = jump;
    }

    public boolean isSpread() {
        return spread;
    }

    public void setSpread(boolean spread) {
        this.spread = spread;
    }
}
