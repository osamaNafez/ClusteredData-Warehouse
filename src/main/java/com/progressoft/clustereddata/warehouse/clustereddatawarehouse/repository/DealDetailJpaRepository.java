package com.progressoft.clustereddata.warehouse.clustereddatawarehouse.repository;
import com.progressoft.clustereddata.warehouse.clustereddatawarehouse.entity.DealDetailEntity;
import com.progressoft.clustereddata.warehouse.clustereddatawarehouse.model.DealDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface DealDetailJpaRepository extends JpaRepository<DealDetailEntity,Long> {

    Optional<DealDetailEntity> findByUuid(String uuid);
}
