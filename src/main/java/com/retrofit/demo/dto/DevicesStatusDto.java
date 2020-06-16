package com.retrofit.demo.dto;

import com.alibaba.fastjson.JSONArray;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DevicesStatusDto {

  public DevicesStatusDto() {
  }

  /**
   * 设备标识
   */
  private String deviceid;
  /**
   * 设备IP
   */
  private String deviceip;
  /**
   * 设备状态 0在线 1不在线
   */
  private int status;
  /**
   * 门仓信息
   */
  private JSONArray doors;
  /**
   * 温度
   */
  private String temperature;
  /**
   * 湿度
   */
  private String humidity;
}
