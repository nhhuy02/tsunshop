package com.nhhgrp.backend.service;

import com.nhhgrp.backend.dto.AddressRequest;
import com.nhhgrp.backend.entity.Address;

import java.security.Principal;
import java.util.UUID;

public interface AddressService {
    public Address createAddress(AddressRequest addressRequest, Principal principal);
    public void deleteAddress(UUID id);
}
