package com.ocp.day11;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class ExtendsDemo {

    public static void main(String[] args) {
        //操作 Employee , Manger , Director
        //多型一定是繼承關西
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

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(d1);
        //-----------------------
        //請位總薪資是多少?
        System.out.println("請問總薪資是多少?");
        Employee[] employees = {e1, e2, e3, m1, m2, d1};
        Manager[] managers = {m1, m2, d1};
        //Java7 for-loop
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            //System.out.println(employees[i]);
            sum += employees[i].getSalary();
        }
        System.out.printf("總薪資為 %,d\n", sum);

        //Java7 for-each
        int sum2 = 0;
        for (Employee employee : employees) {
            //System.out.println(employee.getSalary());
            sum2 += employee.getSalary();
        }
        System.out.printf("總薪資為 %,d\n", sum2);
        //Java 8
        int sum3 = Stream.of(employees).mapToInt(e -> e.getSalary()).sum();
        System.out.printf("總薪資為 %,d\n", sum3);
        //Java 8 (使用方法參考)
        int sum4 = Stream.of(employees).mapToInt(Employee::getSalary).sum();
        System.out.printf("總薪資(方法參考)=%,d\n", sum4);
        //請問 Mangager 得總薪資為多少(salary)是多少?
        //Java7
        for (Employee e : employees) {
            //simplename 簡化名稱
            System.out.println(e.getClass().getSimpleName());
            //getname 連檔案位置一同列印
            System.out.println(e.getClass().getName());
        }
        int m_sum = 0;
        for (Employee e : employees) {
            if (e.getClass().getSimpleName().equals("Manager")) {
                m_sum += e.getSalary();
            }
            if (e.getClass().getSimpleName().equals("Director")) {
                m_sum += e.getSalary();
            }
        }
        System.out.printf("有預算能力人員的 總薪資: %,d\n", m_sum);
        Predicate<Employee> p_employee = p -> p.getClass().getSimpleName().equals("Director") || p.getClass().getSimpleName().equals("Manager");
        int j8_m_sum = Stream.of(employees)
                .filter(p_employee)
                .mapToInt(Employee::getSalary).sum();
        System.out.printf("manager for Java8 = %,d \n", j8_m_sum);
//        int m_sum=0;
//        for (Manager manager : managers) {
//            m_sum += manager.getSalary();
//        }
//        System.out.printf("manager 總薪資 = %,d\n",m_sum);

        //請問 Manager 的總薪資多少 PartII?
        // 利用 instanceof 運算子
        for (Employee e : employees) {
            //e 所指向的物件(instanceof)是不是 Manager 的物件
            System.out.println(e instanceof Manager);
        }
        int j8_sum = Stream.of(employees)
                .filter(e-> e instanceof Manager)
                //peek 顯示目前串流執行到甚麼程度(可重複使用 不影響串流)
                //.peek 可以看到 filter 過濾出來的東西
                .peek(System.out::println)
                .mapToInt(Employee::getSalary)
                //.peek 可以到 maptoInt 轉換後出來的東西
                .peek(System.out::println)
                .sum();
        System.out.printf("Instanceok 運算 Mananger = sum %,d \n",j8_sum);
    }
}
