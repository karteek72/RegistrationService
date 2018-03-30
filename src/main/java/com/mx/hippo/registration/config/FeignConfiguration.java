package com.mx.hippo.registration.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.mx.hippo.registration")
public class FeignConfiguration {

}
