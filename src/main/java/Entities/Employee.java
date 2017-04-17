package Entities;

import javax.persistence.*;
import java.util.List;

/**
 * Created by linhtran on 12/04/2017.
 */
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Basic
    @Column(name = "f_name", nullable = false, length = 50)
    private String fName;

    @Basic
    @Column(name = "l_name", nullable = false, length = 50)
    private String lName;

    @Basic
    @Column(name = "salary", nullable = false, precision = 0)
    private double salary;

    @ElementCollection
    @CollectionTable(name="phone", joinColumns=@JoinColumn(name="owner_id"))
    @OrderColumn(name = "phone_order")
  //@Transient
    private List<Phone> phones;

    public Employee() {
    }

    public Employee(String fName, String lName, double salary) {
        this.fName = fName;
        this.lName = lName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }


    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (id != employee.id) return false;
        if (Double.compare(employee.salary, salary) != 0) return false;
        if (fName != null ? !fName.equals(employee.fName) : employee.fName != null) return false;
        if (lName != null ? !lName.equals(employee.lName) : employee.lName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        result = 31 * result + (fName != null ? fName.hashCode() : 0);
        result = 31 * result + (lName != null ? lName.hashCode() : 0);
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
