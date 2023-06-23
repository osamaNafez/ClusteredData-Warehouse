package com.progressoft.clustereddata.warehouse.controller;

import com.progressoft.clustereddata.warehouse.ClusteredDataWarehouseApplication;
import com.progressoft.clustereddata.warehouse.mapper.DealDetailMapper;
import com.progressoft.clustereddata.warehouse.model.DealDetail;
import com.progressoft.clustereddata.warehouse.repository.DealDetailRepository;
import com.progressoft.clustereddata.warehouse.request.DealDetailRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.validation.Valid;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/api/v1/deal")
public class DealDetailController {


    private final DealDetailRepository dealDetailRepository;
    private final DealDetailMapper mapper;
    private static final Logger logger = LoggerFactory.getLogger(ClusteredDataWarehouseApplication.class);

    public DealDetailController(DealDetailRepository dealDetailRepository, DealDetailMapper mapper) {
        this.dealDetailRepository = dealDetailRepository;
        this.mapper = mapper;
    }
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public DealDetail addDealDetail(@Valid @RequestBody DealDetailRequest request) {
        try {
            DealDetail dealDetail = mapper.toModel(request);
            dealDetail.setUuid(UUID.randomUUID().toString());
            dealDetail.setTimestamp(Timestamp.valueOf(LocalDateTime.now()));
            DealDetail savedDealDetail = dealDetailRepository.save(dealDetail);

            logger.info("DealDetail saved successfully: {}", savedDealDetail);

            return savedDealDetail;
        } catch (Exception e) {
            logger.error("Error occurred while adding DealDetail", e);
            throw e;
        }
    }

    @GetMapping(value = "/{uuid}", produces = MediaType.APPLICATION_JSON_VALUE)
    public DealDetail getByUuid(@PathVariable String uuid) {
        try {
            DealDetail dealDetail = dealDetailRepository.findByUuid(uuid);

            if (dealDetail != null) {
                logger.info("Retrieved DealDetail by UUID: {}", dealDetail);
            } else {
                logger.info("No DealDetail found for UUID: {}", uuid);
            }

            return dealDetail;
        } catch (Exception e) {
            logger.error("Error occurred while retrieving DealDetail by UUID: {}", uuid, e);
            throw e;
        }
    }

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<DealDetail> getAll() {
        try {
            List<DealDetail> dealDetails = dealDetailRepository.findAll();

            if (!dealDetails.isEmpty()) {
                logger.info("Retrieved all DealDetails. Count: {}", dealDetails.size());
            } else {
                logger.info("No DealDetails found.");
            }

            return dealDetails;
        } catch (Exception e) {
            logger.error("Error occurred while retrieving all DealDetails", e);
            throw e;
        }
    }
}
