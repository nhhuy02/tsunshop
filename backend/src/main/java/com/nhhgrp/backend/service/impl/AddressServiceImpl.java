package com.nhhgrp.backend.service.impl;

import com.nhhgrp.backend.auth.entity.User;
import com.nhhgrp.backend.dto.AddressRequest;
import com.nhhgrp.backend.entity.Address;
import com.nhhgrp.backend.repository.AddressRepository;
import com.nhhgrp.backend.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.UUID;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public Address createAddress(AddressRequest addressRequest, Principal principal) {
        User user = (User) userDetailsService.loadUserByUsername(principal.getName());
        Address address = Address.builder()
                .name(addressRequest.getName())
                .street(addressRequest.getStreet())
                .city(addressRequest.getCity())
                .state(addressRequest.getState())
                .zipCode(addressRequest.getZipCode())
                .phoneNumber(addressRequest.getPhoneNumber())
                .user(user)
                .build();
        return addressRepository.save(address);
    }

    @Override
    public void deleteAddress(UUID id) {
        addressRepository.deleteById(id);
    }
}
