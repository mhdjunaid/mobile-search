package com.axiom.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;


@Entity
@Table(name = "mobiles")
@TypeDef(name = "jsonb", typeClass = JsonBinaryType.class)

public class Mobile {

    private long id;
    private String brand;
    private String phone;
    private String picture;
    private String sim;
    private String resolution;
    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    private Hardware hardware;
    @Type(type = "jsonb")
    @Column(columnDefinition = "jsonb")
    private Release release;
 
    public Mobile() {
  
    }
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
 
    @Column(name = "brand", nullable = false)
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
 
    @Column(name = "phone", nullable = false)
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
 
    @Column(name = "picture", nullable = false)
    public String getPicture() {
        return picture;
    }
    public void setPicture(String picture) {
        this.picture = picture;
    }
    @Type(type = "jsonb")
    @Column(name = "release",columnDefinition = "jsonb", nullable = false)
    public Release getRelease() {
        return release;
    }
    public void setRelease(Release release) {
        this.release = release;
    }
    @Type(type = "jsonb")
    @Column(name = "hardware",columnDefinition = "jsonb", nullable = false)
    public Hardware getHardware() {
        return hardware;
    }
    public void setHardware(Hardware hardware) {
        this.hardware = hardware;
    }


    @Override
    public String toString() {
        return "Mobile [id=" + id + ", brand=" + brand + ", phone=" + phone + ",picture=" 
        + picture + ", hardware=" + hardware + ",release=" + release + ", sim=" + sim + ", resolution=" + resolution
       + "]";
    }
    @Column(name = "sim", nullable = false)
    public String getSim() {
        return sim;
    }

    public void setSim(String sim) {
        this.sim = sim;
    }
    @Column(name = "resolution", nullable = false)
    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
 
}