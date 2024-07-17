package com.obviousgawu.model;

import jakarta.persistence.*;

@Entity
@Table(name = "customer_vendor_info")
public class CloudVendor {
    @Id
    @SequenceGenerator(name = "cloudVendor_id_sequence",
    sequenceName = "cloudVendor_id_sequence",
    allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "cloudVendor_id_sequence")
    private String id;

    private String name;
    private String address;
    private String number;

    public CloudVendor() {
    }

    public CloudVendor(String id, String name, String address, String number) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
