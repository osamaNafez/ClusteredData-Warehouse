package com.progressoft.clustereddata.warehouse.repository;
import com.progressoft.clustereddata.warehouse.entity.DealDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface DealDetailJpaRepository extends JpaRepository<DealDetailEntity,Long> {

    Optional<DealDetailEntity> findByUuid(String uuid);
}
