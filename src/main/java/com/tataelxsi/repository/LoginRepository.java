package com.tataelxsi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tataelxsi.entity.Login;

public interface LoginRepository extends JpaRepository<Login,Integer> {

	  public Login findByUserNameAndPassword(String userName,String password);
	  

}
