class Employee
{
 protected	int empId[], salary[];
 protected	String empName[] = {"Ram","Sarv","Dev","Radha","Vikas","Alok"};
 protected	String DOB, email;
	
	String getName()
	{
	    
		return empName;
	}
	
	int getId()
	{
		return empId;
	}
	
  void display()
  {
	  
  }
	
}


class SoftwareEngineer extends Employee
{
	int Salary ;
	String name, role, perks;
} 

class Sr_SoftwareEngineer extends Employee
{
	int Salary ;
	String name, role, perks;
}

class Module_Lead extends Employee
{
	int Salary ;
	String name, role, perks;
} 

class Technical_lead extends Employee
{
	int Salary ;
	String name, role, perks;
} 

class Project_lead extends Employee
{
	int Salary ;
	String name, role, perks;
} 

class Project_manager extends Employee
{
	int Salary ;
	String name, role, perks;
} 

class Directors extends Employee
{
	int Salary ;
	String name, role, perks;
} 

