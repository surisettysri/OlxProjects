package com.zensar.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="users")
public class OlxUser {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		
		
		private int Id;
		private String username;
		private String password;
		private String roles;
		private String active;
		private String firstName;
		private String lastName;
		private String email;
		private String phone;
		public int getId() {
			return Id;
		}
		public void setId(int id) {
			Id = id;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getRoles() {
			return roles;
		}
		public void setRoles(String roles) {
			this.roles = roles;
		}
		public String getActive() {
			return active;
		}
		public void setActive(String active) {
			this.active = active;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
			
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
			
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		@Override
		public String toString() {
			return "OlxUser [Id=" + Id + ", username=" + username + ", password=" + password + ", roles=" + roles
					+ ", active=" + active + ", firstNmae=" + firstName + ", lastName=" + lastName + ", email=" + email
					+ ", phone=" + phone + "]";
		}
			
		
		
		
	}


