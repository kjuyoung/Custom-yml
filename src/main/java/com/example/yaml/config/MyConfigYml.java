package com.example.yaml.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

@Getter
@Setter
@ToString
@Configuration
@ConfigurationProperties(prefix = "test.my")
@PropertySource(value = {"custom.properties"}, factory = YamlLoadFactory.class)
public class MyConfigYml {

    private List<String> name;
    private List<String> status;
}
