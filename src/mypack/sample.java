package mypack;

class Email
{
	String receiver,sender,message,subject;
	public Email(String receiver,String sender,String message,String subject)
	{
		this.message=message;
		this.receiver=receiver;
		this.sender=sender;
		this.subject=subject;
	}
}
class ComposeEmail
{
	Email email;
	String sessionTime;
	public ComposeEmail(Email email,String sessionTime)	
	{
		this.email=email;
		this.sessionTime=sessionTime;
	}
	
	public String clickCompose(String currentTime)
	{
		String s="";
		if((Integer.parseInt(currentTime)<Integer.parseInt(sessionTime))&&(validateEmailAddress(email.receiver))&&(validateEmailAddress(email.sender)))
		{
			if(email.message.length()>0 && email.subject.length()>0)
			{
				email.message.replaceAll("\\s"," ");
				s="Mail send";
			}
			else if(email.message.length()==0 && email.subject.length()==0)
			{
				s="Enter a valid subject/message";
			}
			else if(email.message.length()==0 || email.subject.length()==0)
			{
				s="Login Again";
			}
		}
		return s;
			
	}
	public boolean validateEmailAddress(String address)
	{
		if(address.contains("@")&&address.contains("."))
		return true;
		else
			return false;
	}
}
public class sample
{
	public static void main(String args[])
	{
		Email email=new Email("e1@g.c","e2@gh.com","hi/   myfan","tyu");
		ComposeEmail compose=new ComposeEmail(email, "1234");
		System.out.println(compose.clickCompose("66"));
	}
}