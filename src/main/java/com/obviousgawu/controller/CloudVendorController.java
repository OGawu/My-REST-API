package com.obviousgawu.controller;

import com.obviousgawu.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

    CloudVendor cloudVendor;

    /*record NewCustomer(String id){

    }*/





    /*@GetMapping
    public Class extends CloudVendor> getVendors(){
        return cloudVendor.getClass();
    }*/


    @GetMapping("{StringId}")
    public CloudVendor getCloudVendorDetails(String id){
        //return cloudVendor;
        //new NewCustomer(id);
        return new CloudVendor("Q","Bhudha","12 Zengeza","223456");
    }

    public void getCloudVendor(){
        this.cloudVendor = new CloudVendor();
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
        //new NewCustomer(id);
        this.cloudVendor = null;
        return "Cloud Vendor Deleted Successfully";
    }

}
