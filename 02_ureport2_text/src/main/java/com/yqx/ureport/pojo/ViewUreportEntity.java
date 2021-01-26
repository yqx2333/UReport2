package com.yqx.ureport.pojo;

import lombok.Data;

/**
 * 报表关联表实体
 *
 */
@Data
public class ViewUreportEntity {

    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

