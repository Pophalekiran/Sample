package com.hystrix.demo;

public class Employee  extends Dept implements Cloneable{
    private Integer empId;
    private String empName;

    @Override
    protected Object clone() throws CloneNotSupportedException {

        return super.clone();
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                "dept "+getDeptName()+
                '}';
    }



    public Employee(Integer empId, String empName) {
        super(12,"IT");
        this.empId = empId;
        this.empName = empName;

    }
}
