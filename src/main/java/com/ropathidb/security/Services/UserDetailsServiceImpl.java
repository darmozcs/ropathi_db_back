package com.ropathidb.security.Services;

import com.ropathidb.model.entity.UserEntity;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

  @Override
  @Transactional
  public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
    List<GrantedAuthority> authorities = List.of(new SimpleGrantedAuthority("ADMIN"));
    UserDetailsImpl userDetails = new UserDetailsImpl();
    return userDetails.build(UserEntity.builder()
        .email("casa@home.com")
        .id("_10")
        .name("pedro")
        .lastName("Rodri")
        .password("XXX")
        .build(), authorities);
  }
}
