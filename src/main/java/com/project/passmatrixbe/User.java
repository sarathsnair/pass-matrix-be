package com.project.passmatrixbe;

import javax.persistence.*;
import java.sql.Blob;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name="username", unique=true)
    private String username;

    @Lob
    private String imagedata;
    
    private Integer cellid;

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

    public String getImagedata() {
        return imagedata;
    }

    public void setImagedata(String imagedata) {
        this.imagedata = imagedata;
    }

    public Integer getCellid() {
        return cellid;
    }

    public void setCellid(Integer cellid) {
        this.cellid = cellid;
    }
}
