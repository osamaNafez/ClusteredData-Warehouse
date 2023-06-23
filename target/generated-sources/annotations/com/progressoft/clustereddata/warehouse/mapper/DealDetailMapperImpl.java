package com.progressoft.clustereddata.warehouse.mapper;

import com.progressoft.clustereddata.warehouse.entity.DealDetailEntity;
import com.progressoft.clustereddata.warehouse.model.DealDetail;
import com.progressoft.clustereddata.warehouse.request.DealDetailRequest;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-23T23:43:39+0300",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 11.0.19 (Amazon.com Inc.)"
)
@Component
public class DealDetailMapperImpl implements DealDetailMapper {

    @Override
    public DealDetailEntity toEntity(DealDetail dealDetail) {
        if ( dealDetail == null ) {
            return null;
        }

        DealDetailEntity dealDetailEntity = new DealDetailEntity();

        dealDetailEntity.setUuid( dealDetail.getUuid() );
        dealDetailEntity.setFromCurrencyCode( dealDetail.getFromCurrencyCode() );
        dealDetailEntity.setToCurrencyCode( dealDetail.getToCurrencyCode() );
        dealDetailEntity.setAmount( dealDetail.getAmount() );
        dealDetailEntity.setTimestamp( dealDetail.getTimestamp() );

        return dealDetailEntity;
    }

    @Override
    public DealDetail toModel(DealDetailEntity dealDetailEntity) {
        if ( dealDetailEntity == null ) {
            return null;
        }

        DealDetail dealDetail = new DealDetail();

        dealDetail.setUuid( dealDetailEntity.getUuid() );
        dealDetail.setFromCurrencyCode( dealDetailEntity.getFromCurrencyCode() );
        dealDetail.setToCurrencyCode( dealDetailEntity.getToCurrencyCode() );
        dealDetail.setAmount( dealDetailEntity.getAmount() );
        dealDetail.setTimestamp( dealDetailEntity.getTimestamp() );

        return dealDetail;
    }

    @Override
    public DealDetail toModel(DealDetailRequest dealDetailRequest) {
        if ( dealDetailRequest == null ) {
            return null;
        }

        DealDetail dealDetail = new DealDetail();

        dealDetail.setFromCurrencyCode( dealDetailRequest.getFromCurrencyCode() );
        dealDetail.setToCurrencyCode( dealDetailRequest.getToCurrencyCode() );
        dealDetail.setAmount( dealDetailRequest.getAmount() );

        return dealDetail;
    }
}
