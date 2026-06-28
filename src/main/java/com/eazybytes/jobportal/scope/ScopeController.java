package com.eazybytes.jobportal.scope;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scope")
@RequiredArgsConstructor
public class ScopeController {

    private final SessionScopedBean sessionScopedBean;
    private  final  RequestScopeBean requestScopeBean;
    private final ApplicationScopedBean applicationScopedBean;

    @GetMapping("/request")
    public ResponseEntity<String> testRequestScope() {
        requestScopeBean.setName("John Doe");
        return ResponseEntity.ok().body(requestScopeBean.getName());
    }

    @GetMapping("/session")
    public ResponseEntity<String> testSessionScope() {
        sessionScopedBean.setName("Nisant Doe");
        return ResponseEntity.ok().body(sessionScopedBean.getName());
    }

    @GetMapping("/application")
    public ResponseEntity<Integer> testApplicationScope() {
        applicationScopedBean.incrementVistorsCount();
        return ResponseEntity.ok().body(applicationScopedBean.getVistorsCount());
    }


    @GetMapping("/test")
    public ResponseEntity<Integer> testScope() {
        return ResponseEntity.ok().body(applicationScopedBean.getVistorsCount());
    }
}
