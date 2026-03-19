package com.assetTracking.assetTracker.Repo;

import com.assetTracking.assetTracker.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {
}
