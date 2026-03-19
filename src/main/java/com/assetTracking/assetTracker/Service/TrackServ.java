package com.assetTracking.assetTracker.Service;

import com.assetTracking.assetTracker.Dto.RequestDto;
import org.springframework.http.ResponseEntity;

import java.util.Map;


public interface TrackServ {
    ResponseEntity<?> updateById(RequestDto reqdto,Long id);
    ResponseEntity<?> addAsset(RequestDto reqdto);
    ResponseEntity<?> getAllAsset();
    Object getById(Long id);
    String DeleteById(Long id);
}
