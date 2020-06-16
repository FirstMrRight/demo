package com.retrofit.demo.retrofit;

public interface IRetrofitService {

  <T> T create(Class<T> clazz);

}
