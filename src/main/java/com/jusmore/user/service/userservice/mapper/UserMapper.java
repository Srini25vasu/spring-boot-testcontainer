package com.jusmore.user.service.userservice.mapper;

import com.jusmore.user.service.userservice.domain.User;
import com.jusmore.user.service.userservice.entities.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
  UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

  // Define mapping methods here
  // For example, to convert between User and UserEntity
  // You can use annotations like @Mapping to specify field mappings if needed
  // Define mapping methods here, e.g.:
  UserEntity toEntity(User user);
  User toDomain(UserEntity userEntity);
  List<User> toDomainList(List<UserEntity> userEntities);
  List<UserEntity> toEntityList(List<User> users);
}
