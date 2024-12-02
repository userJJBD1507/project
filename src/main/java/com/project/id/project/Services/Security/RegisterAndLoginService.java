package com.project.id.project.Services.Security;
import com.project.id.project.Entities.YandexIdCloneEntity;
import com.project.id.project.Repositories.YandexIdCloneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Collections;
@org.springframework.stereotype.Service
public class RegisterAndLoginService {
    @Autowired
    private YandexIdCloneRepository repository;
    @Autowired
    private JwtService jwtService;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private PasswordEncoder passwordEncoder;
    public AuthenticationResponse createAnAccount(YandexIdCloneEntity entity) {
        entity.setPassword(passwordEncoder.encode(entity.getPassword()));
        User user = new User(
                entity.getUsername(),
                entity.getPassword(),
                Collections.emptyList()
        );
        repository.save(entity);
        String token = jwtService.generateToken(user);
        AuthenticationResponse authenticationResponse = new AuthenticationResponse();
        authenticationResponse.setToken(token);
        return authenticationResponse;
    }
    public AuthenticationResponse login(YandexIdCloneEntity entity) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        entity.getUsername(),
                        entity.getPassword()
                )
        );
        Entity entity1 = repository.get(entity.getUsername());
        String token = jwtService.generateToken(entity1);
        AuthenticationResponse authenticationResponse = new AuthenticationResponse();
        authenticationResponse.setToken(token);
        return authenticationResponse;
    }
}