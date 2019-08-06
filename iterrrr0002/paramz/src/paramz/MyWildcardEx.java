package paramz;
/* http://www.java2novice.com/java-fundamentals/
 * 
 * Below example exmplains what is wildcard arguments and how it helps us to solve problem. 
 * In the example, we have two classes called CompAEmp and CompBEmp extending Emp class. 
 * We have a generic class called MyEmployeeUtil, where we have utilities 
 * to perform employee functions irrespective of which comapany emp belogns too.
 *  This class accepts subclasses of Emp. Incase if we want to compare salaries of two employees, 
 *  how can we do using MyEmployeeUtil class? U can think that below sample code might work, but it wont work.

//this logic wont work
public boolean isSalaryEqual(MyEmployeeUtil<T> otherEmp){
     
    if(emp.getSalary() == otherEmp.getSalary()){
        return true;
    }
    return false;
}       
  Because once you create an object of MyEmployeeUtil class, the type argument will be specific to an instance type.
 So you can compare between only same object types, ie, you can comapare either objects of CompAEmp or CompBEmp, 
 but not between CompAEmp and CompBEmp. To solve this problem, wildcard argument will helps you. 
 Look at below sample code, which can solve your problem.

public boolean isSalaryEqual(MyEmployeeUtil<?> otherEmp){
     
    if(emp.getSalary() == otherEmp.getSalary()){
        return true;
    }
    return false;
}
 * */
public class MyWildcardEx {
	 
    public static void main(String a[]){
         
        MyEmployeeUtil<CompAEmp> empA
                    = new MyEmployeeUtil<CompAEmp>(new CompAEmp("Ram", 20000));
        MyEmployeeUtil<CompBEmp> empB
                    = new MyEmployeeUtil<CompBEmp>(new CompBEmp("Krish", 30000));
        MyEmployeeUtil<CompAEmp> empC
                    = new MyEmployeeUtil<CompAEmp>(new CompAEmp("Nagesh", 20000));
        System.out.println("Is salary same? "+empA.isSalaryEqual(empB));
        System.out.println("Is salary same? "+empA.isSalaryEqual(empC));
    }
}
 
class MyEmployeeUtil<T extends Emp>{
     
    private T emp;
     
    public MyEmployeeUtil(T obj){
        emp = obj;
    }
     
    public int getSalary(){
        return emp.getSalary();
    }
     
    public boolean isSalaryEqual(MyEmployeeUtil<?> otherEmp){
         
        if(emp.getSalary() == otherEmp.getSalary()){
            return true;
        }
        return false;
    }
     
    //// create some utility methods to do employee functionalities
    //
    //
    //
}
 
class Emp{
     
    private String name;
    private int salary;
     
    public Emp(String name, int sal){
        this.name = name;
        this.salary = sal;
    }
     
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
 
class CompAEmp extends Emp{
     
    public CompAEmp(String nm, int sal){
        super(nm, sal);
    }
}
 
class CompBEmp extends Emp{
     
    public CompBEmp(String nm, int sal){
        super(nm, sal);
    }
}