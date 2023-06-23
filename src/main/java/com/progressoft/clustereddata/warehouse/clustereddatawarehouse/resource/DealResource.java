package com.progressoft.clustereddata.warehouse.clustereddatawarehouse.resource;

import com.progressoft.clustereddata.warehouse.clustereddatawarehouse.entity.DealDetailEntity;
import com.progressoft.clustereddata.warehouse.clustereddatawarehouse.model.DealDetail;
import com.progressoft.clustereddata.warehouse.clustereddatawarehouse.repository.DealDetailRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping(value = "/rest/deals")
public class DealResource {


    private final DealDetailRepository dealDetailRepository;

    public DealResource(DealDetailRepository dealDetailRepository) {
        this.dealDetailRepository = dealDetailRepository;
    }

    @GetMapping(value = "/all")
    public List<DealDetail> getAll(){
        return dealDetailRepository.findall();
    }

    @PostMapping(value = "/load")
    public List<DealDetail> perlist(@RequestBody final DealDetail deals){
        deals.setUuid(UUID.randomUUID().toString());
        dealDetailRepository.save(deals);
        return dealDetailRepository.findall();
    }
}
