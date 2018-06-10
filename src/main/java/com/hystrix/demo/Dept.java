package com.hystrix.demo;

 public class Dept {//implements Cloneable{
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    private Integer deptId;
    private  String deptName;

     public Dept(Dept dept) {
     }

     public Integer getDeptId() {
        return deptId;
    }



    public String getDeptName() {
        return deptName;
    }

//

    public Dept(Integer deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }
}
