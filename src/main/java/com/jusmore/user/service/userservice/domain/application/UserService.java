package com.jusmore.user.service.userservice.domain.application;

import com.jusmore.user.service.userservice.domain.User;

import java.util.List;
import java.util.UUID;

public interface UserService {
  public List<User> findAllUsers();
  public List<User> findAllRevisionsById(UUID id);
  public User create(final User user);
  public User update(final User user);
  public User findById(final UUID id);
  public void deleteById(final UUID id);
}
