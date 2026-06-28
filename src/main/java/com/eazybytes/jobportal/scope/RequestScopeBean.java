package com.eazybytes.jobportal.scope;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
@Getter @Setter
public class RequestScopeBean {

    private  String name;

    public RequestScopeBean() {
        System.out.println("Request Scope Bean is Created");
    }
}
