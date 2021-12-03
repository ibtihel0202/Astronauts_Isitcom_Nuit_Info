package com.example.jsonwebtoken.service;

import com.example.jsonwebtoken.entities.AppRole;
import com.example.jsonwebtoken.entities.AppUser;
import com.jayway.jsonpath.internal.function.json.Append;

public interface AccountService {
    public AppUser saveUser(AppUser user);
    public AppRole saveRole(AppRole role);
    public void addRoleToUser(String username, String roleName);
    public AppUser findUserByUsername(String username);
}
