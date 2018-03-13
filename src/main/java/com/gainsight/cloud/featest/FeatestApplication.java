package com.gainsight.cloud.featest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication
@EnableElasticsearchRepositories
public class FeatestApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeatestApplication.class, args);
    }
}
