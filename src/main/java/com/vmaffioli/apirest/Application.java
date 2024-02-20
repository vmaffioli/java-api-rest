package com.vmaffioli.apirest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jmx.JmxAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;

@SpringBootApplication(exclude = { MultipartAutoConfiguration.class, JmxAutoConfiguration.class, })
public class Application {

    private static Log LOGGER = LogFactory.getLog(Application.class);

    public static void main(String[] args) {
        LOGGER.debug("Iniciando a aplicacao ...");
        SpringApplication.run(Application.class);
    }

}