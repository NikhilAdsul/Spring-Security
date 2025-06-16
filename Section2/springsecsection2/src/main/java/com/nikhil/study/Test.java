package com.nikhil.study;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
//        public static void main(String[] args) {
//            String abc = "aaAbcCABBc";
//            String result = findFirstPair(abc);
//            System.out.println("Output - " + result); // Output - ab
//        }
//
//    public static String findFirstPair(String str) {
//        if (str == null || str.length() < 2) {
//            return "";
//        }
//
//        for (int i = 0; i < str.length() - 1; i++) {
//            char char1 = Character.toLowerCase(str.charAt(i));
//            char char2 = Character.toLowerCase(str.charAt(i + 1));
//
//            if (char1 < char2) {
//                return "" + char1 + char2;
//            }
//        }
//        return "";
//    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("street 1", "city X");
        List<String> phoneNumbers = new ArrayList<>();
        phoneNumbers.add("123456");
        phoneNumbers.add("456789");
        Map<String, String> metadata = new HashMap<>();
        metadata.put("hobby", "Watching Movies");

// Declare the employee
        Employee e = new Employee("John", 23, address, phoneNumbers, metadata);

// Update details
        e.getPhoneNumbers().add("345123");
        e.getMetadata().put("skill", "Java");
        e.getMetadata().put("designation", "HR");

// change address details
        e.getAddress().setCity("c3");
        e.getAddress().setStreet("s3");

        System.out.println(e.getPhoneNumbers());
        System.out.println(e.getMetadata());
        System.out.println(e.getAddress());
    }
}



