package com.kubertX.springboot.action.orm.mybatis.pagehelper.model;

import java.io.Serializable;

public class User implements Serializable {
    /** 主键 */
    private Long id;

    /** 姓名 */
    private String username;

    /** 高校 */
    private String hightSchool;

    /** 年龄 */
    private Integer age;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHightSchool() {
        return hightSchool;
    }

    public void setHightSchool(String hightSchool) {
        this.hightSchool = hightSchool;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", hightSchool=").append(hightSchool);
        sb.append(", age=").append(age);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}