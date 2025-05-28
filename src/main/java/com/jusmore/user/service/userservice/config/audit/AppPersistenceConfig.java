package com.jusmore.user.service.userservice.config.audit;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
//@EnableJpaAuditing(auditorAwareRef = "auditorAware") // Value must match with the bean below.
public class AppPersistenceConfig {
  public AuditorAware<String> auditAware(){
    return new AuditAwareImpl();
  }
}
