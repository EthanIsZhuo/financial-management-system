package com.ljj.finance.service;

import com.ljj.finance.entity.Permissions;

import java.util.List;

public interface PermissionsService {

    List<Permissions> selectPermissionsByPermission(String permission);
}
