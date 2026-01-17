package com.infracore.alerthub.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1")
public class EventController {

    @PostMapping("/events")
    public ResponseEntity<?> receiveEvent(@RequestBody Map<String, Object> body) {
        String requestId = UUID.randomUUID().toString();

        System.out.println("requestId=" + requestId + " event received: " + body);

        return ResponseEntity.accepted().body(Map.of(
                "message", "Event accepted",
                "requestId", requestId
        ));
    }
}
