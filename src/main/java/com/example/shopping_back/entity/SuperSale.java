package com.example.shopping_back.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * super_sale
 * @author 
 */
public class SuperSale implements Serializable {
    private Integer id;

    private Integer newAppear;

    private Integer end;

    private String brandImg;

    private String name;

    private String activity;

    private Date startDate;

    private Date endDate;

    private String poster;

    private String details;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNewAppear() {
        return newAppear;
    }

    public void setNewAppear(Integer newAppear) {
        this.newAppear = newAppear;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public String getBrandImg() {
        return brandImg;
    }

    public void setBrandImg(String brandImg) {
        this.brandImg = brandImg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
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
        SuperSale other = (SuperSale) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getNewAppear() == null ? other.getNewAppear() == null : this.getNewAppear().equals(other.getNewAppear()))
            && (this.getEnd() == null ? other.getEnd() == null : this.getEnd().equals(other.getEnd()))
            && (this.getBrandImg() == null ? other.getBrandImg() == null : this.getBrandImg().equals(other.getBrandImg()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getActivity() == null ? other.getActivity() == null : this.getActivity().equals(other.getActivity()))
            && (this.getStartDate() == null ? other.getStartDate() == null : this.getStartDate().equals(other.getStartDate()))
            && (this.getEndDate() == null ? other.getEndDate() == null : this.getEndDate().equals(other.getEndDate()))
            && (this.getPoster() == null ? other.getPoster() == null : this.getPoster().equals(other.getPoster()))
            && (this.getDetails() == null ? other.getDetails() == null : this.getDetails().equals(other.getDetails()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getNewAppear() == null) ? 0 : getNewAppear().hashCode());
        result = prime * result + ((getEnd() == null) ? 0 : getEnd().hashCode());
        result = prime * result + ((getBrandImg() == null) ? 0 : getBrandImg().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getActivity() == null) ? 0 : getActivity().hashCode());
        result = prime * result + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        result = prime * result + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        result = prime * result + ((getPoster() == null) ? 0 : getPoster().hashCode());
        result = prime * result + ((getDetails() == null) ? 0 : getDetails().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", newAppear=").append(newAppear);
        sb.append(", end=").append(end);
        sb.append(", brandImg=").append(brandImg);
        sb.append(", name=").append(name);
        sb.append(", activity=").append(activity);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", poster=").append(poster);
        sb.append(", details=").append(details);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}