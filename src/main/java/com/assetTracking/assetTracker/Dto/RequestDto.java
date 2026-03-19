package com.assetTracking.assetTracker.Dto;

import jakarta.persistence.Id;

public class RequestDto {
    private Long asset_id;
    private String asset_model;
    private String asset_status;
    private String asset_owner;
    private String username;
    private String password;
    private Long empid;

    public Long getEmpid() {
        return empid;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getAsset_owner() {
        return asset_owner;
    }

    public Long getAsset_id() {
        return asset_id;
    }

    public String getAsset_model() {
        return asset_model;
    }

    public String getAsset_status() {
        return asset_status;
    }

}
