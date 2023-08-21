package com.ropathidb.model.entity;


import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserEntity {

  @Id
  private String id;

  @NotNull
  private String name;

  @NotNull
  private String lastName;

  @Email
  private String email;

  private String password;

  private String numTel;

  @DBRef
  private Set<RoleEntity> roles = new HashSet<>();

  private LocalDateTime createdAt;
}
