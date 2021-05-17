package com.example.shopping_back.entity;

import java.io.Serializable;

/**
 * duty_free_store
 * @author 
 */
public class DutyFreeStore implements Serializable {
    private Integer id;

    private String country;

    private String chinesename;

    private String nationalflag;

    private String img;

    private String specification;

    private String introduction;

    private Double price;

    private Integer buypeoplenumber;

    private String detail;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getChinesename() {
        return chinesename;
    }

    public void setChinesename(String chinesename) {
        this.chinesename = chinesename;
    }

    public String getNationalflag() {
        return nationalflag;
    }

    public void setNationalflag(String nationalflag) {
        this.nationalflag = nationalflag;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getBuypeoplenumber() {
        return buypeoplenumber;
    }

    public void setBuypeoplenumber(Integer buypeoplenumber) {
        this.buypeoplenumber = buypeoplenumber;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        DutyFreeStore other = (DutyFreeStore) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getChinesename() == null ? other.getChinesename() == null : this.getChinesename().equals(other.getChinesename()))
            && (this.getNationalflag() == null ? other.getNationalflag() == null : this.getNationalflag().equals(other.getNationalflag()))
            && (this.getImg() == null ? other.getImg() == null : this.getImg().equals(other.getImg()))
            && (this.getSpecification() == null ? other.getSpecification() == null : this.getSpecification().equals(other.getSpecification()))
            && (this.getIntroduction() == null ? other.getIntroduction() == null : this.getIntroduction().equals(other.getIntroduction()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getBuypeoplenumber() == null ? other.getBuypeoplenumber() == null : this.getBuypeoplenumber().equals(other.getBuypeoplenumber()))
            && (this.getDetail() == null ? other.getDetail() == null : this.getDetail().equals(other.getDetail()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getChinesename() == null) ? 0 : getChinesename().hashCode());
        result = prime * result + ((getNationalflag() == null) ? 0 : getNationalflag().hashCode());
        result = prime * result + ((getImg() == null) ? 0 : getImg().hashCode());
        result = prime * result + ((getSpecification() == null) ? 0 : getSpecification().hashCode());
        result = prime * result + ((getIntroduction() == null) ? 0 : getIntroduction().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getBuypeoplenumber() == null) ? 0 : getBuypeoplenumber().hashCode());
        result = prime * result + ((getDetail() == null) ? 0 : getDetail().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", country=").append(country);
        sb.append(", chinesename=").append(chinesename);
        sb.append(", nationalflag=").append(nationalflag);
        sb.append(", img=").append(img);
        sb.append(", specification=").append(specification);
        sb.append(", introduction=").append(introduction);
        sb.append(", price=").append(price);
        sb.append(", buypeoplenumber=").append(buypeoplenumber);
        sb.append(", detail=").append(detail);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}