package wp.com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import wp.com.demo.model.Company;

import java.util.Optional;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

    void deleteByName(String name);

    Optional<Company> findByCompanyUsername(String user);

    boolean existsById(Long id);


}
