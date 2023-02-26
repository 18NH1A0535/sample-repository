package mypack;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;

class Candidate
{
	private String name,gender,department;
	private int id,age,yearOfJoining;
	private double salary;
	public Candidate()
	{
		
	}
	public Candidate(int id,String name,int age,String gender,String department,int yearOfJoining, double salary)
	{
		this.name=name;
		this.age=age;
		this.id=id;
		this.gender=gender;
		this.department=department;
		this.yearOfJoining=yearOfJoining;
		this.salary=salary;
	}
	public void setName(String name)
    {
      this.name=name;
    }
    public String getName()
    {
      return this.name;
    }
    public void setId(int id)
    {
      this.id=id;
    }
    public int getId()
    {
      return this.id;
    }
    public void setAge(int age)
    {
      this.age=age;
    }
    public int getAge()
    {
      return this.age;
    }
    public void setGender(String gender)
    {
      this.gender=gender;
    }
    public String getGender()
    {
      return this.gender;
    }
     public void setDepartment(String department)
    {
      this.department=department;
    }
    public String getDepartment()
    {
      return this.department;
    }
     public void setYOJ(int yearOfJoining)
    {
      this.yearOfJoining=yearOfJoining;
    }
    public int getYOJ()
    {
      return this.yearOfJoining;
    }
     public void setSalary(double salary)
    {
      this.salary=salary;
    }
    public double getSalary()
    {
      return this.salary;
    }
   @Override
  public String toString() {
      return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
              + department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
  }
}
class Implementation{
	  //Write Your Code Here..
//	Candidate c=new Candidate();
//	  public Map<String,Long> getCount(List<Candidate> list)
//	  {
//		  
//      // Collect the list as map
//      // by groupingBy() method
//      //Map<String, Long> result= list.stream().collect(Collectors.groupingBy(Candidate::getGender));
//	  }
//	  public Map<String,Double> getAverageAge(List<Candidate> list)
//	  {
//
//	  }
//	  public Map<String,Long> countCandidatesDepartmentWise(List<Candidate> list)
//	  {
//
//	  }
//	  public Optional<Candidate> getYoungestCandidateDetails(List<Candidate> list)
//	  {
//
//	  }
//	}
//public class HiringOnstream {

	public static void main(String[] args) {
		List<Candidate> list = new ArrayList<>();
		  list.add(new Candidate(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		  list.add(new Candidate(144, "Scarlet Jhonson", 28, "Male", "Product Development", 2014, 32500.0));	

	}

}
