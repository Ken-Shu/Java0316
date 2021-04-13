
package com.ocp.day11;

import java.util.stream.Stream;

public class EmployeeApi {
    private static Employee[] employees;
    //static 的實作區段
    static {
        Employee e1 = new Employee();
        e1.setSalary(30000);
        Employee e2 = new Employee();
        e2.setSalary(40000);
        Employee e3 = new Employee();
        e3.setSalary(50000);
        //----------------------------------
        Manager m1 = new Manager();
        m1.setSalary(70000);
        m1.setBudget(100000);
        Manager m2 = new Manager();
        m2.setSalary(80000);
        m2.setBudget(150000);
        //----------------------------------
        Director d1 = new Director();
        d1.setSalary(200000);
        d1.setBudget(500000);
        d1.setStockOption(3000000);
        //一次指派為上方的 employees 為 null值
        //二次指派 後方就需要加上(型別) new Employee[]
    employees = new Employee[]{e1,e2,e3,m1,m2,d1};
    }
    
    //取的所有員工的資料
    //API 都是 static 就不用 new 可以直接使用
    public static Employee[] getEmployees(){
        return employees;
    }
    //取的總薪資
    public static int getTotalSalary(){    
        return Stream.of(employees)
                .mapToInt(Employee::getSalary)
                .sum();
    }
    //取的平均薪資
    public static double getSalaryOfAvg(){
        return Stream.of(employees)
                .mapToDouble(Employee::getSalary)
                .average().getAsDouble();
    }
    //取的總預算
    public static int getTotalBudget (){
        return Stream.of(employees)
                .filter(e -> e instanceof Manager)
                /*此時filter 出來的物件 仍然是 employee
                 *所以要用 map 轉型成 Manager 才能取得
                 *getBudget物件
                 */    
                .map(e -> (Manager)e)
                .mapToInt(Manager::getBudget)
                .sum();   
    }
    //員工總數
    public static int getamount(){
        return employees.length;
    }
}
