package com.assetTracking.assetTracker.Repo;

import com.assetTracking.assetTracker.Model.TrackModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface TrackRepo extends JpaRepository<TrackModel, Long> {
}
