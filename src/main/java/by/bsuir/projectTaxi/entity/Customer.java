package by.bsuir.projectTaxi.entity;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "role")
    @NotBlank(message = "role is required field!")
    private String role;

    @Column(name = "telephone_number")
    @NotBlank(message = "telephone number is required field!")
    @Pattern(regexp = "\\d{2}-\\d{3}-\\d{2}-\\d{2}", message = "please use pattern XX-XXX-XX-XX")
    private String telephoneNumber;

    @Column(name = "email")
    @NotBlank(message = "email is required field!")
    private String email;

    @Column(name = "login")
    @NotBlank(message = "login is required field!")
    private String login;

    @Column(name = "password")
    @NotBlank(message = "password is required field!")
    private String password;

    public Customer() {}

    public Customer(String role, String telephoneNumber, String email, String login, String password) {
        this.role = role;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
        this.login = login;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", role='" + role + '\'' +
                ", telephoneNumber='" + telephoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
