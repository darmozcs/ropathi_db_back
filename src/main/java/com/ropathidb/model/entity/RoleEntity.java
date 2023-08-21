package com.ropathidb.model.entity;


import com.ropathidb.model.ERole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "roles")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RoleEntity {

  private String id;
  private ERole name;

}
