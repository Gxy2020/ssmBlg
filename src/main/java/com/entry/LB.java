package com.entry;

/**
 * @author GUO
 * @Classname LB
 * @Description TODO
 * @Date 2020/6/23 13:41
 */
public class LB {
    private String name;
    private Integer count;
    private Boolean stu;

    public Boolean getStu() {
        return stu;
    }

    public void setStu(Boolean stu) {
        this.stu = stu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "LB{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", stu=" + stu +
                '}';
    }
}