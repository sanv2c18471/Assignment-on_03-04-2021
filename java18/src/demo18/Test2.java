package demo18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
	int id;
	String name;
	int age;
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
}
public class Test2 {
public static void main(String[] args) {
	ArrayList <Employee> al = new ArrayList <Employee>();
	al.add(new Employee(123,"Sankari",21));
	al.add(new Employee(127,"Logehwari",23));
	al.add(new Employee(121,"Kavya",20));
	al.add(new Employee(125,"Yogeshwari",12));
	al.add(new Employee(129,"Anupama",29));
System.out.println("Sort by age");
	Comparator<Employee> c1 = (E1,E2)->{
		return (E1.age==E2.age)?0:(E1.age>E2.age)?1:-1;
	};
	Collections.sort(al,c1);
	for(Employee e : al) {
		System.out.println("id: "+e.id+" "+"name: "+e.name+" "+"age: "+e.age);
	}
System.out.println("Sort by name");
	Comparator<Employee> c2 = (E1,E2)->{
		return E1.name.compareTo(E2.name);
	};
	Collections.sort(al,c2);
	for(Employee e : al) {
		System.out.println("id: "+e.id+" "+"name: "+e.name+" "+"age: "+e.age);
	}
System.out.println("Sort by id");
	Comparator<Employee> c3 = (E1,E2)->{
		return (E1.id==E2.id)?0:(E1.id>E2.id)?1:-1;
	};
	Collections.sort(al,c3);
	for(Employee e : al) {
		System.out.println("id: "+e.id+" "+"name: "+e.name+" "+"age: "+e.age);
	}
}
}
