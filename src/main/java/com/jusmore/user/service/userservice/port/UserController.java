package com.jusmore.user.service.userservice.port;

import com.jusmore.user.service.userservice.domain.User;
import com.jusmore.user.service.userservice.domain.application.UserService;
import com.jusmore.user.service.userservice.mapper.UserMapper;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @PostMapping("/users")
  public String create(@RequestBody @Validated User user) {
    userService.create(user);
    return "User created";
  }
}
