package com.obviousgawu.service;

import com.obviousgawu.model.CloudVendor;
import com.obviousgawu.repository.CloudVendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {


    CloudVendorRepository cloudVendorRepository;

    @Autowired
    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Successfully created CloudVendor";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Successfully updated CloudVendor";
    }

    @Override
    public String deleteCloudVendor(String id) {
        cloudVendorRepository.deleteById(id);
        return "Successfully deleted CloudVendor";
    }

    @Override
    public CloudVendor getCloudVendor(String id) {
       return cloudVendorRepository.findById(id).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }
}
