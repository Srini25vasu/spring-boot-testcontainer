package com.jusmore.user.service.userservice.repositories;

import com.jusmore.user.service.userservice.domain.User;
import com.jusmore.user.service.userservice.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, UUID> {

//  public List<UserEntity> findAllRevisionsById(UUID id);
//  public UserEntity create(final UserEntity user);
//  public UserEntity update(final UserEntity user);

  public boolean existsByEmail(String email);

}
