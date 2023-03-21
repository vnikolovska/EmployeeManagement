package wp.com.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;


@Data
@Entity
public class Intern {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String name;
    private String surname;
    private String Embg;
    private String email;
    private String street;
    private String city;
    private String country;
    private String internship_section;
    private String department;


    private LocalDate internship_start;
    private String internship_duration;

    private String phone;
    private Integer projects;
    private Integer internship_salary;
    private Integer experience;
    private String imageSource;

    @ManyToOne
    private Company companyId;

    public Intern() {
    }

    public Intern(String name, String surname, String embg, String email, String street, String city, String country,
                  String internship_section, String department, LocalDate internship_start, String internship_duration, String phone, Integer projects, Integer internship_salary,
                  Integer experience, String imageSource, Company companyId) {
        this.name = name;
        this.surname = surname;
        Embg = embg;
        this.email = email;
        this.street = street;
        this.city = city;
        this.country = country;
        this.internship_section = internship_section;
        this.department = department;
        this.internship_start = internship_start;
        this.internship_duration = internship_duration;
        this.phone = phone;
        this.projects = projects;
        this.internship_salary = internship_salary;
        this.experience = experience;
        this.imageSource = imageSource;
        this.companyId = companyId;
    }
}
