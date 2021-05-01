/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2019-2020. All rights reserved.
 * Generated by the CloudDB ObjectType compiler.  DO NOT EDIT!
 */
package com.reapex.sv.model;

import com.huawei.agconnect.cloud.database.CloudDBZoneObject;
import com.huawei.agconnect.cloud.database.annotations.DefaultValue;
import com.huawei.agconnect.cloud.database.annotations.Indexes;
import com.huawei.agconnect.cloud.database.annotations.PrimaryKeys;

import java.util.Date;

/**
 * Definition of ObjectType BookInfo.
 *
 * @since 2020-11-27
 */
@PrimaryKeys({"id"})
@Indexes({"bookName:bookName"})
public final class BookInfo extends CloudDBZoneObject {
    private Integer id;

    private String bookName;

    private String author;

    private Double price;

    private String publisher;

    private Date publishTime;

    @DefaultValue(booleanValue = true)
    private Boolean shadowFlag;

    public BookInfo() {
        super(BookInfo.class);
        this.shadowFlag = true;

    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setShadowFlag(Boolean shadowFlag) {
        this.shadowFlag = shadowFlag;
    }

    public Boolean getShadowFlag() {
        return shadowFlag;
    }

}