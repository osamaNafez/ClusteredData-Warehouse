package com.progressoft.clustereddata.warehouse.repository;

import com.progressoft.clustereddata.warehouse.exception.DealDetailNotFoundException;
import com.progressoft.clustereddata.warehouse.mapper.DealDetailMapper;
import com.progressoft.clustereddata.warehouse.model.DealDetail;


import java.util.List;
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
    public DealDetail findByUuid(String uuid) {
        return jpaRepository.findByUuid(uuid)
                .map(mapper::toModel)
                .orElseThrow(()-> new DealDetailNotFoundException("Deal detail with this UUID not found"));
    }

    @Override
    public List<DealDetail> findAll() {
        return jpaRepository.findAll()
                .stream()
                .map(mapper::toModel)
                .collect(Collectors.toList());
    }
}
