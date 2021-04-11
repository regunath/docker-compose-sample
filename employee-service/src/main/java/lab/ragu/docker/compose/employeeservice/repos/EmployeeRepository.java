package lab.ragu.docker.compose.employeeservice.repos;

import lab.ragu.docker.compose.employeeservice.entity.Employee;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Repository for Employee Entity
 */
@RepositoryRestResource(collectionResourceRel = "employee", path = "employee")
public interface EmployeeRepository
    extends PagingAndSortingRepository<Employee, Integer> {



}
