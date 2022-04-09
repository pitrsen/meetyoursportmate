package com.pitrsen.meetyoursportmate;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * Created by IntelliJ IDEA.
 * User: peterSenaj
 * Date: 12.3.2022
 * Time: 12:49
 * Project: meetyoursportmate
 */
public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {

    public SecurityWebApplicationInitializer() {
        super(WebSecurityConfig.class);
    }

}
