package spring;

import java.time.LocalDateTime;


public class Member {

	private Long id;
	private String email;
	private String password;
	private String name;
	private LocalDateTime registerDateTime;
	
	public Member(String emai,String password,String name,LocalDateTime registerDateTime) {
		this.email=email;
		this.password= password;
		this.name=name;
		this.registerDateTime = registerDateTime;
	}
	void setId(long id) {
		this.id=id;
	}
	public Long getId() {
		return id;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}
	public LocalDateTime getRegisterDateTime() {
		return registerDateTime;
	}
	public void ChangePassword(String oldPassword,String newPassword) {
		if(!password.equals(oldPassword))
			throw new WrongIdPasswordException();
		this.password=newPassword;
	}
}
