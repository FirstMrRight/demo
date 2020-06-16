package com.retrofit.demo;

import com.retrofit.demo.dto.DevicesStatusDto;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * 设备状态信息上报
 */
public interface DevicesStatusService {

  @Headers({"Content-Type:application/json", "Accept:application/json", "charset:utf-8"})
  @POST("devicesStatus")
  Call<ResponseBody> sendDevicesStatus(@Body DevicesStatusDto dto);
}
