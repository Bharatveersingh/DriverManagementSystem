package com.Management.DriverManagementSystem.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DriverDetail {
	private  int id;
	private String firstName;
	private String lastName;
	private String birthDate;
	private String address;
}
