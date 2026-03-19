package com.assetTracking.assetTracker.Service.ServiceImpl;

import com.assetTracking.assetTracker.Dto.RequestDto;
import com.assetTracking.assetTracker.Model.TrackModel;
import com.assetTracking.assetTracker.Service.TrackServ;
import com.assetTracking.assetTracker.Repo.TrackRepo;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.sound.midi.Track;
import javax.swing.text.html.Option;
import java.util.*;

@Service
public class TrackServImpl implements TrackServ {

    @Autowired
    TrackRepo TrackRepo;

    @Override
    public ResponseEntity<?> updateById(RequestDto reqdto, Long id) {

       Optional<TrackModel> model = TrackRepo.findById(id);
           Optional<TrackModel> updated = model.map(TrackModel ->{
           TrackModel.setAsset_model(reqdto.getAsset_model());
           TrackModel.setAsset_status(reqdto.getAsset_status());
           TrackModel.setAsset_owner(reqdto.getAsset_owner());
           return TrackRepo.save(TrackModel);
       });

        return ResponseEntity.ok(updated);
    }

    public ResponseEntity<?> addAsset(RequestDto body) {


        Long id = body.getAsset_id();
        String model = body.getAsset_model();
        String status = body.getAsset_status();
        String owner = body.getAsset_owner();
        try {
            if (id != null) {
                Optional<TrackModel> rid = TrackRepo.findById(id);
                if(rid.isPresent()) {
                    return ResponseEntity.ok(Map.of("status", "Failed",
                            "code", "404",
                            "msg", "Id Already exist"));
                }else{
                    TrackModel assetmodel = new TrackModel();
                    assetmodel.setAsset_id(id);
                    assetmodel.setAsset_model(model);
                    assetmodel.setAsset_status(status);
                    assetmodel.setAsset_owner(owner);
                    TrackRepo.save(assetmodel);

                    System.out.println("Data added");
                    return ResponseEntity.ok(Map.of("status", "Successful",
                            "code", "200",
                            "Data", assetmodel));

                }
                   }
        } catch (Exception e) {
            System.out.println(e);
        }
            return ResponseEntity.ok(Map.of("status", "Failed",
                "code", "404",
                "msg", "Id cannot be null"));
    }

    @Override
    public ResponseEntity<?> getAllAsset() {
        List<TrackModel> AllAsset = TrackRepo.findAll();
        return ResponseEntity.ok(AllAsset);
    }

    @Override
    public Object getById(Long id) {
        Optional<TrackModel> AssetId = TrackRepo.findById(id);
        return ResponseEntity.ok(AssetId);
    }

    @Override
    public String DeleteById(Long id) {

        TrackRepo.deleteById(id);
        return "Deleted Successfully";
    }
}
