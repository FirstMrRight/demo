package com.retrofit.demo.retrofit;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

/**
 * RetrofitService 工厂类
 *
 * @Component 注解的对象都是单例模式
 */
@Component
@Slf4j
public class RetrofitServiceFactory implements IRetrofitService {


  @Override
  public <T> T create(Class<T> clazz) {
    String baseUrl = "http://192.168.2.106:8080/test/";
    Retrofit retrofit = new Retrofit.Builder()
      .baseUrl(baseUrl)
      .addConverterFactory(JacksonConverterFactory.create())
      .build();
    return retrofit.create(clazz);
  }
}
