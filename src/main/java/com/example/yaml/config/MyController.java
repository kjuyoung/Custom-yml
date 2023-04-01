package com.example.yaml.config;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MyController {

    private static final Logger logger = LoggerFactory.getLogger(MyController.class);
    private final MyConfigProperties myConfigProperties;
    private final MyConfigYml myConfigYml;

    @GetMapping("/properties")
    public void getProperties() {
        logger.info("=============== Properties =================================================");
        logger.info("myConfig : {}", myConfigProperties);
        logger.info("myConfig name: {}, name[0]: {}, name[1]: {}", myConfigProperties.getName(), myConfigProperties.getName()[0], myConfigProperties.getName()[1]);
        logger.info("myConfig status: {}, status[0]: {}, status[1]: {}", myConfigProperties.getStatus(), myConfigProperties.getStatus()[0], myConfigProperties.getStatus()[1]);
    }

    @GetMapping("/yml")
    public void getYml() {
        logger.info("=============== Yml =================================================");
        logger.info("myConfig : {}", myConfigYml);
        logger.info("myConfig name: {}, name.get(0): {}, name.get(1): {}", myConfigYml.getName(), myConfigYml.getName().get(0), myConfigYml.getName().get(1));
        logger.info("myConfig status: {}, status.get(0): {}, status.get(1): {}", myConfigYml.getStatus(), myConfigYml.getStatus().get(0), myConfigYml.getStatus().get(1));
    }
}
