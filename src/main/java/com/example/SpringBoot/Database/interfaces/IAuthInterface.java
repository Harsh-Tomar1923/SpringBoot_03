package com.example.SpringBoot.Database.interfaces;

import com.example.SpringBoot.Database.dto.AuthUserDTO;
import com.example.SpringBoot.Database.dto.LoginDTO;
import com.example.SpringBoot.Database.dto.PassDTO;
import org.springframework.stereotype.Service;

@Service
public interface IAuthInterface {

    public String register(AuthUserDTO user);

    public String login(LoginDTO user);

    public AuthUserDTO forgotPassword(PassDTO pass, String email);

}