package com.li.drip.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @author LiChenYang
 * @date 2020-05-30 22:01
 * 实体类公共属性
 */
public class BaseEntity {
    /**
     * 主键
     */
    private Integer id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy.MM.dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;
    /**
     * 标题
     */
    private String title;
    /**
     * 内容
     */
    private String message;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
