package com.example.shopping_back.entity;

import java.io.Serializable;

/**
 * commoditys
 * @author 
 */
public class Commoditys implements Serializable {
    private Integer id;

    private String name;

    private String img;

    private Double price;

    private String brand;

    private String exchangePolicy;

    private String category;

    private String freight;

    private String server;

    private String specifications;

    private String introduction;

    private String returnsPolicy;

    private String detail;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getExchangePolicy() {
        return exchangePolicy;
    }

    public void setExchangePolicy(String exchangePolicy) {
        this.exchangePolicy = exchangePolicy;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getFreight() {
        return freight;
    }

    public void setFreight(String freight) {
        this.freight = freight;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getReturnsPolicy() {
        return returnsPolicy;
    }

    public void setReturnsPolicy(String returnsPolicy) {
        this.returnsPolicy = returnsPolicy;
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
        Commoditys other = (Commoditys) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getImg() == null ? other.getImg() == null : this.getImg().equals(other.getImg()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getBrand() == null ? other.getBrand() == null : this.getBrand().equals(other.getBrand()))
            && (this.getExchangePolicy() == null ? other.getExchangePolicy() == null : this.getExchangePolicy().equals(other.getExchangePolicy()))
            && (this.getCategory() == null ? other.getCategory() == null : this.getCategory().equals(other.getCategory()))
            && (this.getFreight() == null ? other.getFreight() == null : this.getFreight().equals(other.getFreight()))
            && (this.getServer() == null ? other.getServer() == null : this.getServer().equals(other.getServer()))
            && (this.getSpecifications() == null ? other.getSpecifications() == null : this.getSpecifications().equals(other.getSpecifications()))
            && (this.getIntroduction() == null ? other.getIntroduction() == null : this.getIntroduction().equals(other.getIntroduction()))
            && (this.getReturnsPolicy() == null ? other.getReturnsPolicy() == null : this.getReturnsPolicy().equals(other.getReturnsPolicy()))
            && (this.getDetail() == null ? other.getDetail() == null : this.getDetail().equals(other.getDetail()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getImg() == null) ? 0 : getImg().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getBrand() == null) ? 0 : getBrand().hashCode());
        result = prime * result + ((getExchangePolicy() == null) ? 0 : getExchangePolicy().hashCode());
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getFreight() == null) ? 0 : getFreight().hashCode());
        result = prime * result + ((getServer() == null) ? 0 : getServer().hashCode());
        result = prime * result + ((getSpecifications() == null) ? 0 : getSpecifications().hashCode());
        result = prime * result + ((getIntroduction() == null) ? 0 : getIntroduction().hashCode());
        result = prime * result + ((getReturnsPolicy() == null) ? 0 : getReturnsPolicy().hashCode());
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
        sb.append(", name=").append(name);
        sb.append(", img=").append(img);
        sb.append(", price=").append(price);
        sb.append(", brand=").append(brand);
        sb.append(", exchangePolicy=").append(exchangePolicy);
        sb.append(", category=").append(category);
        sb.append(", freight=").append(freight);
        sb.append(", server=").append(server);
        sb.append(", specifications=").append(specifications);
        sb.append(", introduction=").append(introduction);
        sb.append(", returnsPolicy=").append(returnsPolicy);
        sb.append(", detail=").append(detail);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}