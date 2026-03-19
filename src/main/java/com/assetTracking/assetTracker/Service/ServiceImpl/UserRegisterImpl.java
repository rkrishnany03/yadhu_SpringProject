package com.assetTracking.assetTracker.Service.ServiceImpl;

import com.assetTracking.assetTracker.Dto.RequestDto;
import com.assetTracking.assetTracker.Model.User;
import com.assetTracking.assetTracker.Repo.UserRepo;
import com.assetTracking.assetTracker.Service.UserRegister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserRegisterImpl implements UserRegister {

    @Autowired
    UserRepo adminRepo;
    @Override
    public String register(RequestDto reqdto) {

        String username = reqdto.getUsername();
        String pass = reqdto.getPassword();
        User admin = new User();
        Optional<User> user = adminRepo.findById(username);
            if (user.isPresent()) {
                return  "User already exist";
            }

                admin.setUsername(username);
                admin.setPassword(pass);
                adminRepo.save(admin);

        return "User Added successfully";
    }

    @Override
    public String login(RequestDto reqdto) {
        String username = reqdto.getUsername();
        String pass = reqdto.getPassword();
        User admin = new User();
        Optional<User> user = adminRepo.findById(username);
        if (user.isPresent()) {
            return  "Login successfully";
        }
        return "User does not exist";
    }
}
