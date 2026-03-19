package com.assetTracking.assetTracker.Controller;

import com.assetTracking.assetTracker.Dto.RequestDto;
import com.assetTracking.assetTracker.Service.UserRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TrackerLogin {

    @Autowired
    UserRegister UserRepo;

    @PostMapping("/register")
    public String register(@RequestBody RequestDto reqdto){
        return UserRepo.register(reqdto);
    }
    @PostMapping("/login")
    public String login(@RequestBody RequestDto reqdto){
        return UserRepo.login(reqdto);
    }
}
