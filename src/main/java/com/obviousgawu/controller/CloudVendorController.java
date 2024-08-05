package com.obviousgawu.controller;

import com.obviousgawu.model.CloudVendor;
import com.obviousgawu.service.CloudVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/cloudvendor")
public class CloudVendorController {

  CloudVendorService cloudVendorService;


    @Autowired
    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    //Read specific cloud vendor details
    @GetMapping("{id}")
    public CloudVendor getCloudVendorDetails(@PathVariable("id") String id){
        return cloudVendorService.getCloudVendor(id);
                //cloudVendor;
        //return new CloudVendor("Q","Bhudha","12 Zengeza","223456");
    }

    //Read All cloud vendor details
    @GetMapping()
    public List<CloudVendor> getAllCloudVendorDetails() {
        return cloudVendorService.getAllCloudVendors();
    }


    @PostMapping
    public String createCloudVendor(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.createCloudVendor(cloudVendor);
        //this.cloudVendor = cloudVendor;
        return "Cloud Vendor Created Successfully";
    }

    @PutMapping
    public String updateCloudVendor(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.updateCloudVendor(cloudVendor);
        //this.cloudVendor = cloudVendor;
        return "Cloud Vendor Edited Successfully";
    }
    @DeleteMapping("{id}")
    public String deleteCloudVendor(@PathVariable("id") String id){
        cloudVendorService.deleteCloudVendor(id);
        //new NewCustomer(id);
        //this.cloudVendor = null;
        return "Cloud Vendor Deleted Successfully";
    }

}
