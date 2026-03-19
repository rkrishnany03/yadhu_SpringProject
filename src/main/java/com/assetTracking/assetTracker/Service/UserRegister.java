package com.assetTracking.assetTracker.Service;

import com.assetTracking.assetTracker.Dto.RequestDto;

public interface UserRegister {
    String register(RequestDto reqdto);

    String login(RequestDto reqdto);
}
