package com.ljj.finance.service;

import com.ljj.finance.entity.Admin;

public interface AdminService {

    Admin selectAdminByTerms(String username, String password);

    Integer updateAdmin(Admin admin);

    Admin selectAdminById(Integer id);
}
