/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.monitorhub.model;

/**
 *
 * @author Prajol
 */
public class MonitorDetails {
    private String brandName;
    private String modelName;
    private String monitorType;
    private int stock;
    private String resolution;
    private int price;
    


    // Constructor
    public MonitorDetails(String brandName, String modelName, String modelType, int stock, String resolution, int price) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.monitorType = modelType;
        this.stock = stock;
        this.price = price;
        this.resolution = resolution;
    }

    // Getters and Setters
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getMonitorType() {
        return monitorType;
    }

    public void setModelType(String monitorType) {
        this.monitorType = monitorType;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

