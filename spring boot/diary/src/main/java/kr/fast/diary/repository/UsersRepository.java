package kr.fast.diary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.fast.diary.entity.Users;

public interface UsersRepository extends JpaRepository <Users, Long>{
	

}
