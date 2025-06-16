package com.nikhil.study;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class Employee {
    private final String empName;
    private final int age;
    private final Address address;
    private final List<String> phoneNumbers;
    private final Map<String, String> metadata;

    public Employee(String name, int age, Address address, List<String> phoneNumbers, Map<String, String> metadata) {
        super();
        this.empName = name;
        this.age = age;
        this.address = address;
        this.phoneNumbers = phoneNumbers;
        this.metadata = metadata;
    }

    public String getEmpName() {
        return empName;
    }

    public int getAge() {
        return age;
    }
    
    // clone the address object
    public Address getAddress() throws CloneNotSupportedException {
        return (Address) address.clone();
    }

    // copy the list of phone numbers
    public List<String> getPhoneNumbers() {
        return new ArrayList<>(phoneNumbers);
    }

    // copy the map of metadata
    public Map<String, String> getMetadata() {
        return new HashMap<>(metadata);
    }
}