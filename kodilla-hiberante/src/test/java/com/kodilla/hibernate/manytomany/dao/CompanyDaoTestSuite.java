package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.task.Task;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany(){
            //Given
            Employee johnSmith = new Employee("John", "Smith");
            Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
            Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

            Company softwareMachine = new Company("Software Machine");
            Company dataMaesters = new Company("Data Maesters");
            Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
            dataMaesters.getEmployees().add(stephanieClarckson);
            dataMaesters.getEmployees().add(lindaKovalsky);
            greyMatter.getEmployees().add(johnSmith);
            greyMatter.getEmployees().add(lindaKovalsky);

            johnSmith.getCompanies().add(softwareMachine);
            johnSmith.getCompanies().add(greyMatter);
            stephanieClarckson.getCompanies().add(dataMaesters);
            lindaKovalsky.getCompanies().add(dataMaesters);
            lindaKovalsky.getCompanies().add(greyMatter);

            //When
            companyDao.save(softwareMachine);
            int softwareMachineId = softwareMachine.getId();
            companyDao.save(dataMaesters);
            int dataMaestersId = dataMaesters.getId();
            companyDao.save(greyMatter);
            int greyMatterId = greyMatter.getId();

            //Then
            Assert.assertNotEquals(0, softwareMachineId);
            Assert.assertNotEquals(0, dataMaestersId);
            Assert.assertNotEquals(0, greyMatterId);

            //CleanUp
            //try {
            //    companyDao.deleteById(softwareMachineId);
            //    companyDao.deleteById(dataMaestersId);
            //    companyDao.deleteById(greyMatterId);
            //} catch (Exception e) {
            //    //do nothing
            //}
    }

    @Test
    public void testNewMethods(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");
        List<Employee> employees = new ArrayList<>();
        employees.add(johnSmith);
        employees.add(stephanieClarckson);
        employees.add(lindaKovalsky);

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        List<Company> companies = new ArrayList<>();
        companies.add(softwareMachine);
        companies.add(dataMaesters);
        companies.add(greyMatter);

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(companies);
        employeeDao.save(employees);

        //When
        List<Employee> employeesResult = employeeDao.retrieveEmployeeBySurname("John");
        List<Company> companiesReslut = companyDao.retrieveCompanyByParam("Sof");

        //Then
        try {
            Assert.assertEquals(1, employees.size());
            Assert.assertEquals(3, companies.size());
        } finally {
            //CleanUp
            companyDao.deleteById(id);
            employeeDao.deleteById();
        }
    }

        //CleanUp
        //try {
        //    companyDao.deleteById(softwareMachineId);
        //    companyDao.deleteById(dataMaestersId);
        //    companyDao.deleteById(greyMatterId);
        //} catch (Exception e) {
        //    //do nothing
        //}
    }
}