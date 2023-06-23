package com.progressoft.clustereddata.warehouse.clustereddatawarehouse.repository;

import com.progressoft.clustereddata.warehouse.clustereddatawarehouse.model.DealDetail;

import java.util.List;
import java.util.Optional;

public interface DealDetailRepository {

    DealDetail save(DealDetail dealDetail);
    Optional<DealDetail> findByUuid(String uuid);
    List<DealDetail> findall();

}
