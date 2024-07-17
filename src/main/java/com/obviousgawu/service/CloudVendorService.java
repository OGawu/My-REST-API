package com.obviousgawu.service;

import com.obviousgawu.model.CloudVendor;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CloudVendorService {
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String id);
    public CloudVendor getCloudVendor(String id);
    public List<CloudVendor> getAllCloudVendors();

}
