package com.obviousgawu.controller;

import com.obviousgawu.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
    CloudVendor cloudVendor;



    @GetMapping("{id}")
    public CloudVendor getCloudVendorDetails( String id){
        return cloudVendor;
        //return new CloudVendor("Q","Bhudha","12 Zengeza","223456");
    }

    @PostMapping
    public String createCloudVendor(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Created Successfully";
    }
    @PutMapping
    public String updateCloudVendor(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "Cloud Vendor Edited Successfully";
    }

    @DeleteMapping
    public String deleteCloudVendor(String id){
        this.cloudVendor = null;
        return "Cloud Vendor Deleted Successfully";
    }

}
