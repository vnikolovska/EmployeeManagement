package wp.com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wp.com.demo.model.Company;
import wp.com.demo.model.Employee;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {


    void deleteById(Long id);

    Employee findByCompanyId(Company companyId);

    void deleteByCompanyId(Company company);

    List<Employee> findAllByCompanyId(Company company);


}
