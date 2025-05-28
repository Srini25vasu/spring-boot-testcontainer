package com.jusmore.user.service.userservice.config.audit;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

/**
 * Implementation of AuditorAware to provide the current auditor's information.
 * This class is used by Spring Data JPA to automatically populate auditing fields
 * such as createdBy and lastModifiedBy in your entities.
 *
 * https://medium.com/@manika09singh/enable-auditing-using-spring-data-jpa-2f62587ccb23
 */

public class AuditAwareImpl implements AuditorAware<String> {
  @Override
  public Optional<String> getCurrentAuditor() {
    return Optional.of("Jusmore");
    /*
        Examples to get the logged-in user's id.

        -- Example 1:
        return Optional.ofNullable(SecurityContextHolder.getContext())
                .map(SecurityContext::getAuthentication)
                .filter(Authentication::isAuthenticated)
                .map(Authentication::getPrincipal)
                .map(User.class::cast)
                .map(User::getUsername);

        -- Example 2:
        final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String auditor = "System";

        if (Objects.nonNull(authentication)) {
            auditor = authentication.getName();

            if (auditor.equals("anonymousUser")) {
                return Optional.of("System");
            }
        }

        return Optional.of(auditor);

         */
  }
}
