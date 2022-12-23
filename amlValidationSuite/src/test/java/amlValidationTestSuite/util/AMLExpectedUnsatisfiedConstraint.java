package amlValidationTestSuite.util;

import java.util.Iterator;

public class AMLExpectedUnsatisfiedConstraint {
	private String name;
	private String message;
	
	public AMLExpectedUnsatisfiedConstraint(String name, String message)
	{
		this.name = name;
		this.message = message;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	@Override
	public boolean equals(Object obj) {		
		 if (!(obj instanceof AMLExpectedUnsatisfiedConstraint))
			 return false;
		 if (obj == this)
	         return true;
		 
		 AMLExpectedUnsatisfiedConstraint rhs = (AMLExpectedUnsatisfiedConstraint) obj;
		 
		 return this.message.equals(rhs.message) &&
		    this.name.equals(rhs.name);
	}
	
	public boolean contains(AMLExpectedUnsatisfiedConstraint rhs)
	{
		return this.message.equals(rhs.message) &&
			    this.name.equals(rhs.name);		
	}
	
	@Override
	public String toString()
	{
		return "Constraint: " + getName() + " Message: " + getMessage();				
	}
	
	
}
