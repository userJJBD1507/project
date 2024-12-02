package com.project.id.project.Services.Security;

import com.project.id.project.Entities.YandexIdCloneEntity;
import com.project.id.project.Repositories.YandexIdCloneRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
public class OAuth2LoginSuccessHandler implements AuthenticationSuccessHandler {

    private final RegisterAndLoginService service;
    private final YandexIdCloneRepository repository;

    public OAuth2LoginSuccessHandler(RegisterAndLoginService service, YandexIdCloneRepository repository) {
        this.service = service;
        this.repository = repository;
    }

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                        Authentication authentication) throws IOException, ServletException {
        OAuth2AuthenticationToken oauthToken = (OAuth2AuthenticationToken) authentication;
        OAuth2User oAuth2User = oauthToken.getPrincipal();
        String email = oAuth2User.getAttribute("email");
        String name = oAuth2User.getAttribute("name");
//        YandexIdCloneEntity entity = new YandexIdCloneEntity(email, name);
        if (repository.get(entity.getUsername()) == null) {
            System.out.println("User creating in through Google: " + name);
            String token = service.createAnAccount(entity).getToken();
            System.out.println(token);
            response.sendRedirect("/interface");
        } else {
            System.out.println("User login in through Google: " + name);
            String token = service.login(entity).getToken();
            System.out.println(token);
            response.sendRedirect("/interface");
        }
    }
}