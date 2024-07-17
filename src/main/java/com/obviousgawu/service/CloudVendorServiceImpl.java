package com.obviousgawu.service;

import com.obviousgawu.model.CloudVendor;
import com.obviousgawu.repository.CloudVendorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {

        return "";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {

        return "";
    }

    @Override
    public String deleteCloudVendor(String id) {

        return "";
    }

    @Override
    public CloudVendor getCloudVendor(String id) {

        return null;
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return List.of();
    }
}
