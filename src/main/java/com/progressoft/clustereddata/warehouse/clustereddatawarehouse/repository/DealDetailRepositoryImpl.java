package com.progressoft.clustereddata.warehouse.clustereddatawarehouse.repository;

import com.progressoft.clustereddata.warehouse.clustereddatawarehouse.mapper.DealDetailMapper;
import com.progressoft.clustereddata.warehouse.clustereddatawarehouse.model.DealDetail;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class DealDetailRepositoryImpl implements DealDetailRepository{

    private final DealDetailJpaRepository jpaRepository;
    private final DealDetailMapper mapper;

    public DealDetailRepositoryImpl(DealDetailJpaRepository jpaRepository, DealDetailMapper mapper) {
        this.jpaRepository = jpaRepository;
        this.mapper = mapper;
    }

    @Override
    public DealDetail save(DealDetail dealDetail) {
        return mapper.toModel(jpaRepository.save(mapper.toEntity(dealDetail)));
    }

    @Override
    public Optional<DealDetail> findByUuid(String uuid) {
        return jpaRepository.findByUuid(uuid)
                .map(mapper::toModel);
    }

    @Override
    public List<DealDetail> findall() {
        return jpaRepository.findAll()
                .stream()
                .map(mapper::toModel)
                .collect(Collectors.toList());
    }
}
