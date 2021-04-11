package lab.ragu.docker.compose.salaryservice.repo;

import lab.ragu.docker.compose.salaryservice.entity.Salary;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "salary", path = "salary")
public interface SalaryRepository extends
    PagingAndSortingRepository<Salary, Integer> {
}
