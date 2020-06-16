package com.retrofit.demo.utils;

import com.retrofit.demo.DevicesStatusService;
import com.retrofit.demo.dto.DevicesStatusDto;
import com.retrofit.demo.retrofit.RetrofitServiceFactory;
import okhttp3.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;
import java.time.LocalDateTime;

@Component
public class HttpSendUtil{
    @Autowired
    private RetrofitServiceFactory retrofitServiceFactory;

    /**
     * 测试模拟上报
     */
    public void sendDevicesStatus(DevicesStatusDto dto){
        retrofit2.Call<ResponseBody> call = retrofitServiceFactory.create(DevicesStatusService.class).sendDevicesStatus(dto);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                System.out.println("设备状态信息上报成功,上报时间" + LocalDateTime.now());
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                System.out.println("设备状态信息上报失败");
            }
        });
    }
}
