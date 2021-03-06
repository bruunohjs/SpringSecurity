package br.cubas.usercontrol.services;

import org.springframework.security.core.userdetails.UserDetails;

public interface SecurityService {
 
  String findLoggedInUsername();

  UserDetails findLoggedInUser();
 
  void login(String username, String password);

}