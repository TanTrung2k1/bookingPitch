/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;


public class ChildrenPitch {
    private String childrenPitchID;
    private String pitchID;
    private String childrenPitchName;
    private String childrenPitchType;
    private Double price;
    private boolean status;

    public ChildrenPitch() {
    }

    public ChildrenPitch(String childrenPitchID, String pitchID, String childrenPitchName, String childrenPitchType, Double price, boolean status) {
        this.childrenPitchID = childrenPitchID;
        this.pitchID = pitchID;
        this.childrenPitchName = childrenPitchName;
        this.childrenPitchType = childrenPitchType;
        this.price = price;
        this.status = status;
    }

    

    public ChildrenPitch(String pitchID, Double price) {
        this.pitchID = pitchID;
        this.price = price;
    }
    
    public String getChildrenPitchID() {
        return childrenPitchID;
    }

    public void setChildrenPitchID(String childrenPitchID) {
        this.childrenPitchID = childrenPitchID;
    }

    public String getPitchID() {
        return pitchID;
    }

    public void setPitchID(String pitchID) {
        this.pitchID = pitchID;
    }

    public String getChildrenPitchName() {
        return childrenPitchName;
    }

    public void setChildrenPitchName(String childrenPitchName) {
        this.childrenPitchName = childrenPitchName;
    }

    public String getChildrenPitchType() {
        return childrenPitchType;
    }

    public void setChildrenPitchType(String childrenPitchType) {
        this.childrenPitchType = childrenPitchType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
