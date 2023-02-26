package mypack;

class CompanyJobRepository
{
	static String getJobPrediction(int age,String highestQualification) throws NotEligibleException
	{
		String s="";
		
		if(age<19)
		{
			throw new NotEligibleException("You are underage for any job");
			
		}
		else if(age>=21 && highestQualification=="B.E")
		{
			s="We have openings for junior developer";
		}
		else if(age>=26 && (highestQualification=="M.S"||highestQualification=="PhD"))
		{
			s="We have openings for senior developer";
		}
		else if(age>=19 && !(highestQualification=="M.S"||highestQualification=="PhD"||highestQualification=="B.E"))
		{
			s="We do not have any job that matches your qualifications";
		}
		else
		{
			s="Sorry we have no openings for now";
		}
		return s;	
	}
}
class NotEligibleException extends Exception
{
	public NotEligibleException(String s) {
		super(s);
	}
}

public class Jobagencyexception1 {

	public String searchForJob(int age,String highestQualification) throws NotEligibleException
	{
		if(age >= 200||age <= 0)
		{
			throw new NotEligibleException("The age entered is not typical for a human being");
			
		}
		return CompanyJobRepository.getJobPrediction(age, highestQualification);
	}
	public static void main(String[] args) {
		Jobagencyexception1 ob=new Jobagencyexception1();
		try
		{
		System.out.println(ob.searchForJob(27,"B.E"));
		}
		catch(NotEligibleException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
