package wp.com.demo.service;

import org.springframework.web.multipart.MultipartFile;
import wp.com.demo.model.Company;
import wp.com.demo.model.Employee;

import java.util.List;
import java.util.Optional;

public interface CompanyService {


    void deleteById(Long id);

    List<Company> searchEmployees(String search);

    List<Company> listCompanies();

    Optional<Company> edit(String user, Long id, String name, String desc, String owner, String moto, MultipartFile profilePicture, String imageSource, Integer numEm, Integer numInt);

    Optional<Company> save(String user, String name, String desc, String owner, String moto, MultipartFile profilePicture, String imageSource, Integer numEm, Integer numInt);

    Optional<Company> findById(Long id);


    Optional<Company> getCompany(String username);

    List<Employee> listEmployeesInCompany(Long companyId);


}
