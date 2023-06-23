package com.progressoft.clustereddata.warehouse.mapper;

import com.progressoft.clustereddata.warehouse.entity.DealDetailEntity;
import com.progressoft.clustereddata.warehouse.model.DealDetail;
import com.progressoft.clustereddata.warehouse.request.DealDetailRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DealDetailMapper {

    DealDetailEntity toEntity(DealDetail dealDetail);
    DealDetail toModel(DealDetailEntity dealDetailEntity);
    DealDetail toModel(DealDetailRequest dealDetailRequest);


}
