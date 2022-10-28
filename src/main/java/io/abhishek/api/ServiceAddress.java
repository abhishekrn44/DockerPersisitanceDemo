package io.abhishek.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class ServiceAddress {

	@Getter
	@Setter
	private String serviceAddress;

	@Getter
	@Setter
	private String serviceName;

	@Getter
	@Setter
	private int employeeId;

	@Getter
	@Setter
	private String name;

}
