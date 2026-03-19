package com.assetTracking.assetTracker.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="Asset_Tracker")
public class TrackModel {

    @Id
    private Long asset_id;

    private String asset_model;
    private String asset_status;
    private String asset_owner;

    public String getAsset_owner() {
        return asset_owner;
    }

    public void setAsset_owner(String asset_owner) {
        this.asset_owner = asset_owner;
    }

    public Long getAsset_id() {
        return asset_id;
    }

    public void setAsset_id(Long asset_id) {
        this.asset_id = asset_id;
    }

    public String getAsset_model() {
        return asset_model;
    }

    public void setAsset_model(String asset_model) {
        this.asset_model = asset_model;
    }

    public String getAsset_status() {
        return asset_status;
    }

    public void setAsset_status(String asset_status) {
        this.asset_status = asset_status;
    }
}
