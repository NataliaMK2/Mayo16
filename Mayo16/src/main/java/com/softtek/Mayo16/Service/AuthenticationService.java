package com.softtek.Mayo16.Service;

import com.softtek.Mayo16.dao.request.SignUpRequest;
import com.softtek.Mayo16.dao.request.SignInRequest;
import com.softtek.Mayo16.dao.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SignInRequest request);

}