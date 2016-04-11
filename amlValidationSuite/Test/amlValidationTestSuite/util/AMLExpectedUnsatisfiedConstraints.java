package amlValidationTestSuite.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.epsilon.evl.execute.UnsatisfiedConstraint;

public class AMLExpectedUnsatisfiedConstraints {
	public Collection<AMLExpectedUnsatisfiedConstraint> constraints = new ArrayList<AMLExpectedUnsatisfiedConstraint>();
	
	public AMLExpectedUnsatisfiedConstraints(Collection<UnsatisfiedConstraint> unsatisfied)
	{
		Iterator<UnsatisfiedConstraint> it = unsatisfied.iterator();
		UnsatisfiedConstraint act = null;
		String constraint;
		String message;
		
		while(it.hasNext())
		{
			act = it.next();
			
			constraint = act.getConstraint().getName();
			message = act.getMessage();
			
			constraints.add(new AMLExpectedUnsatisfiedConstraint(constraint, message)); 
		}
	}
	
	
	public AMLExpectedUnsatisfiedConstraints() {
		
	}





	public void addExpectedConstraint(String constraint, String message)
	{
		constraints.add(new AMLExpectedUnsatisfiedConstraint(constraint, message));		
	}


	public Object[] toArray()
	{
		return constraints.toArray();
		
	}
	
	
	public boolean containsAll(AMLExpectedUnsatisfiedConstraints rhs)
	{
		Iterator<AMLExpectedUnsatisfiedConstraint> it = rhs.constraints.iterator();
		AMLExpectedUnsatisfiedConstraint akt = null;
		boolean contains = true;
		
		while(it.hasNext())
		{
			akt = it.next();
			contains = contains && constraints.contains(akt);
		}		
		
		return contains;		
	}	
	
	@Override
	public String toString()
	{
		Iterator<AMLExpectedUnsatisfiedConstraint> it = constraints.iterator();
		StringBuffer buf = new StringBuffer();
		
		while(it.hasNext())
		{
			buf.append(it.next().toString()).append("\n");
		}
		
		return buf.toString();
	}

}
