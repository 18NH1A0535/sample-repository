
public class CountByZeroException extends Exception{
private String message;


public CountByZeroException(String message) {
	super();
	this.message = message;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}


}

