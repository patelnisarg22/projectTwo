package project;

import java.util.*;
class Employee{
	int age;
	String department,name;
	public Employee(int age,String name,String department)
	{
		this.age=age;
		this.department=department;
		this.name=name;
		
	}
	public String toString()
    {
        return this.age + " " + this.name + " "
            + this.department;
    }
}
class SortbyAge implements Comparator<Employee>
{
	public int compare(Employee a, Employee b)
    {
        return a.age - b.age;
    }
}

class SortbyName implements Comparator<Employee>
{
	public int compare(Employee a, Employee b)
    {
       return a.name.compareTo(b.name);
    }
}
class SortbyDepartment implements Comparator<Employee>
{
	public int compare(Employee a, Employee b)
    {
       return a.department.compareTo(b.department);
    }
}
public class Q7 {
	public void SortEmployee()
	{
		ArrayList<Employee> ar = new ArrayList<Employee>();
        ar.add(new Employee(23, "XYZ", "Accounting"));
        ar.add(new Employee(31, "ABC", "Admin"));
        
        Collections.sort(ar, new SortbyAge());
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
        Collections.sort(ar, new SortbyName());
        System.out.println("\nSorted by name");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
        Collections.sort(ar, new SortbyDepartment());
        System.out.println("\nSorted by Department");
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
	}
}
