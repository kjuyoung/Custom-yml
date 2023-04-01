package com.example.yaml.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Getter
@Setter
@ToString
@Configuration
@ConfigurationProperties(prefix = "test.my")
@PropertySource(value = {"custom.properties"})
public class MyConfigProperties {
    private String[] name;
    private String[] status;
}
