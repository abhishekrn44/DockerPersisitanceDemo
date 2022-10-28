//package io.abhishek.service;
//
//import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;
//import org.mapstruct.Mappings;
//
//import io.abhishek.api.ServiceAddress;
//import io.abhishek.model.Employee;
//
//@Mapper(componentModel = "spring")
//public interface EmployeeMapper {
//
//	@Mappings({ @Mapping(target = "serviceAddress", ignore = true), @Mapping(target = "serviceName", ignore = true) })
//	ServiceAddress entityToApi(Employee employee);
//
//	@Mappings({ @Mapping(target = "id", ignore = true), @Mapping(target = "version", ignore = true) })
//	Employee apiToEntity(ServiceAddress api);
//	
//	
//}
