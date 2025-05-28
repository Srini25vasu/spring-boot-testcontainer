package com.jusmore.user.service.userservice.domain;

import java.util.UUID;

public record User(
      UUID id,
      String firstName,
      String lastName,
      String email,
      String address
      ) {
}
