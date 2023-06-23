package com.progressoft.clustereddata.warehouse.clustereddatawarehouse.mapper;

import com.progressoft.clustereddata.warehouse.clustereddatawarehouse.entity.DealDetailEntity;
import com.progressoft.clustereddata.warehouse.clustereddatawarehouse.model.DealDetail;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DealDetailMapper {

    DealDetailEntity toEntity(DealDetail dealDetail);
    DealDetail toModel(DealDetailEntity dealDetailEntity);
}
