package kr.fast.diary.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Users {

	@Id
	private Long id;

	@Column(name = "password")
	private String pw;

	@Column(name = "email")
	private String email;

	@Column(name = "nickname")
	private String nickname;
	
	@Column(name = "created_at")
	private LocalDateTime createdAt;

	public Users(Long id, String pw, String email, String nickname, LocalDateTime createdAt) {
	    this.id = id;
	    this.pw = pw;
	    this.email = email;
	    this.nickname = nickname; 
	    this.createdAt = createdAt;
	}
}
