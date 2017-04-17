package View;

import Entities.Employee;
import Entities.Phone;
import Model.EmployeeDAO;
import Model.EmployeeIML;
import Model.PersistenceUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by linhtran on 12/04/2017.
 */
public class Main {
    public static void main(String[] args) {
        Employee employee=new Employee("Tran"," Van Linh",50000000);
        List<Phone> phones=new ArrayList<Phone>();
        phones.add(new Phone("VN","0164","49526480",3));
        phones.add(new Phone("EM","098","49526485",2));
        phones.add(new Phone("E","048","49526487",1));
        employee.setPhones(phones);

        EmployeeDAO employeeDAO=new EmployeeIML();
        employeeDAO.insert(employee);

        //System.out.println(PersistenceUtil.getEntityManager());

        //employeeDAO.delete(5);
    }
}
