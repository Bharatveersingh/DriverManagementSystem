package com.Management.DriverManagementSystem.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class DriverDetail {
	private  int id;
	private String firstName;
	private String lastName;
	private String birthDate;
	private String address;
	private String companyName;
}
