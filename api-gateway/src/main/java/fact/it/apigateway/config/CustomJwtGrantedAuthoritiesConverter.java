package com.example.gateway;

import org.springframework.core.convert.converter.Converter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.jwt.Jwt;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class CustomJwtGrantedAuthoritiesConverter implements Converter<Jwt, Collection<GrantedAuthority>> {

    private static final List<String> SPECIFIC_USERS = List.of("enis.haliti20@hotmail.com");
    @Override
    public Collection<GrantedAuthority> convert(Jwt jwt) {
        String email = jwt.getClaimAsString("email"); // Extract the email from the JWT

        if (SPECIFIC_USERS.contains(email)) {
            return List.of(new SimpleGrantedAuthority("ROLE_SPECIFIC_USER"));
        }
        return List.of(); // Default to no roles if not specific user
    }
}
