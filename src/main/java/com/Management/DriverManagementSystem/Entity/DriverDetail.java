package com.Management.DriverManagementSystem.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DriverDetail {
	private String FirstName;
	private String LastName;
	private String BirthDate;
	private String Address;
}
