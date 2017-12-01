package com.lanou.entity;

/**
 * Created by lanou on 2017/12/1.
 */
public class Category {
    private Integer cId;
    private String cName;
    private Integer parentId;
    private Integer state;

    public Category() {
    }

    public Category(Integer cId, String cName, Integer parentId, Integer state) {
        this.cId = cId;
        this.cName = cName;
        this.parentId = parentId;
        this.state = state;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Category{" +
                "cId=" + cId +
                ", cName='" + cName + '\'' +
                ", parentId=" + parentId +
                ", state=" + state +
                '}';
    }
}
