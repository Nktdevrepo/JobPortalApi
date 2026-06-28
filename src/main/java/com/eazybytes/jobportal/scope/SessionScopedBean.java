package com.eazybytes.jobportal.scope;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
@Getter @Setter
public class SessionScopedBean {

    private  String  name;

    public  SessionScopedBean() {
        System.out.println("Session scope bean is created");
    }

}
