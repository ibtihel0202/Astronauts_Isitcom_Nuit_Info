package com.example.jsonwebtoken.web;

import com.example.jsonwebtoken.entities.AppUser;
import com.example.jsonwebtoken.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountRestController {
    @Autowired
    private AccountService accountService;

    @PostMapping("/register")
    public AppUser register(@RequestBody RegisterForm registerForm){
        if(!registerForm.getPassword().equals(registerForm.getRepassword()))
            throw new RuntimeException("You must confirm your password");
        AppUser user=accountService.findUserByUsername(registerForm.getUsername());
        if(user!=null) throw new RuntimeException("This user already exists");
        AppUser appUser= new AppUser();
        appUser.setUsername(registerForm.getUsername());
        appUser.setPassword(registerForm.getPassword());
        accountService.saveUser(appUser);
        accountService.addRoleToUser(registerForm.getUsername(),"USER");
        return appUser;
    }
}
