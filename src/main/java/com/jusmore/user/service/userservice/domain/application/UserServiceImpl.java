package com.jusmore.user.service.userservice.domain.application;

import com.jusmore.user.service.userservice.domain.User;
import com.jusmore.user.service.userservice.entities.UserEntity;
import com.jusmore.user.service.userservice.mapper.UserMapper;
import com.jusmore.user.service.userservice.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

  private final UserRepository userRepository;

  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public List<User> findAllUsers() {
    return null;
  }

  @Override
  public List<User> findAllRevisionsById(UUID id) {
    return null;
  }

  @Override
  public User create(User user) {
    String email = user.email();
    boolean exists = userRepository.existsByEmail(email);
    if (exists) {
      throw new IllegalArgumentException("The provided email address already exists.");
    }
    final UserEntity userEntity = UserMapper.INSTANCE.toEntity(user);
    userRepository.save(userEntity);
    return UserMapper.INSTANCE.toDomain(userEntity);
  }

  @Override
  public User update(User user) {
    return null;
  }

  @Override
  public User findById(UUID id) {
    return null;
  }

  @Override
  public void deleteById(UUID id) {

  }
}
