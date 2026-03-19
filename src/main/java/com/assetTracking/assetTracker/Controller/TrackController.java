package com.assetTracking.assetTracker.Controller;

import com.assetTracking.assetTracker.Dto.RequestDto;
import com.assetTracking.assetTracker.Service.TrackServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TrackController {

    @Autowired
    TrackServ trackServ;

    @PostMapping("/assets")
    public ResponseEntity<?> addAsset(@RequestBody RequestDto reqdto){
        System.out.println("Data adding");
        return trackServ.addAsset(reqdto);
    }

    @GetMapping("/geteallasset")
    public ResponseEntity<?> getAllAsset(){
        return trackServ.getAllAsset();
    }

    @GetMapping("/asset/{id}")
        public Object getById(@PathVariable Long id){
            return trackServ.getById(id);
        }
    @PatchMapping("/asset/{id}")
    public ResponseEntity<?> updateById(@RequestBody RequestDto reqdto, @PathVariable Long id){
        return trackServ.updateById(reqdto,id);
    }

    @DeleteMapping("/asset/{id}")
    public String DeleteById(@PathVariable Long id){
        return trackServ.DeleteById(id);
    }
}
