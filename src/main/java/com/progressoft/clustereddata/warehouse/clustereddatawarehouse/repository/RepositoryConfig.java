package com.progressoft.clustereddata.warehouse.clustereddatawarehouse.repository;

import com.progressoft.clustereddata.warehouse.clustereddatawarehouse.mapper.DealDetailMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryConfig {

    @Bean
    public DealDetailRepository dealDetailRepository(DealDetailJpaRepository jpaRepository, DealDetailMapper mapper){
        return new DealDetailRepositoryImpl(jpaRepository , mapper);
    }
}
