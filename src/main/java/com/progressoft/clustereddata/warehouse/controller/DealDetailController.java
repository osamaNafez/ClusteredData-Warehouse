package com.progressoft.clustereddata.warehouse.controller;

import com.progressoft.clustereddata.warehouse.mapper.DealDetailMapper;
import com.progressoft.clustereddata.warehouse.model.DealDetail;
import com.progressoft.clustereddata.warehouse.repository.DealDetailRepository;
import com.progressoft.clustereddata.warehouse.request.DealDetailRequest;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

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

    public DealDetailController(DealDetailRepository dealDetailRepository, DealDetailMapper mapper) {
        this.dealDetailRepository = dealDetailRepository;
        this.mapper = mapper;
    }
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public DealDetail addDealDetail(@Valid @RequestBody DealDetailRequest request){
        DealDetail dealDetail = mapper.toModel(request);
        dealDetail.setUuid(UUID.randomUUID().toString());
        dealDetail.setTimestamp(Timestamp.valueOf(LocalDateTime.now()));
        return dealDetailRepository.save(dealDetail);
    }

    @GetMapping(value = "/{uuid}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public DealDetail getByUuid(@PathVariable String uuid){
        return dealDetailRepository.findByUuid(uuid);
    }

    @GetMapping(value = "/all" , produces = MediaType.APPLICATION_JSON_VALUE)
    public List<DealDetail> getAll(){
        return dealDetailRepository.findAll();
    }
}
