package com.booktracker.service;

import com.booktracker.dto.UserDTO;
import org.springframework.stereotype.Service;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class AuthService {
    private final ConcurrentHashMap<String, String> users = new ConcurrentHashMap<>();

    public void register(UserDTO userDTO) {
        users.put(userDTO.getUsername(), userDTO.getPassword());
    }

    public boolean validateUser(UserDTO userDTO) {
        String stored = users.get(userDTO.getUsername());
        return stored != null && stored.equals(userDTO.getPassword());
    }
}
