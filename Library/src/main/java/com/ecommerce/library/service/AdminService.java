package com.ecommerce.library.service;

import com.ecommerce.library.model.Admin;
import com.ecommerce.library.dto.AdminDTO;

public interface AdminService {
    Admin findByUsername(String username);

    Admin save(AdminDTO adminDTO);
}
