package pe.com.coches.service;

import pe.com.coches.dto.LoginDto;

public interface AuthService {
    String login(LoginDto loginDto);
}
