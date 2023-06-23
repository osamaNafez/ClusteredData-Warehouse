package com.progressoft.clustereddata.warehouse.repository;

import com.progressoft.clustereddata.warehouse.model.DealDetail;

import java.util.List;

public interface DealDetailRepository {

    DealDetail save(DealDetail dealDetail);
    DealDetail findByUuid(String uuid);
    List<DealDetail> findAll();

}
