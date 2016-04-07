package amlValidationSuite.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class AMLModelHierarchy {
	private NavigableMap<String, ArrayList<AMLExternalReference>> modelHierarchy = new TreeMap<String, ArrayList<AMLExternalReference>>();	
	
	public void addModel(String model)
	{
		ArrayList<AMLExternalReference> extRefList;
		
		extRefList = modelHierarchy.get(model);
		
		/* ToDo: Eventuell prüfen ob Modell eindeutig ist?
		if(extRefList != null)
			throw new IllegalStateException("Model already exists");
		*/
		if(extRefList == null)
			modelHierarchy.put(model, new ArrayList<AMLExternalReference>());
	}
		
	public void addExternalReferenceToModel(String model, AMLExternalReference externalRef)
	{
		ArrayList<AMLExternalReference> extRefList = modelHierarchy.get(model);
		
		if(extRefList == null)
		{
			extRefList = new ArrayList<AMLExternalReference>();
			
			extRefList.add(externalRef);			
			modelHierarchy.put(model, extRefList);
		}
		else
		{
			extRefList.add(externalRef);			
		}
	}
	
	public List<String> getModels()
	{
		SortedSet<String> mainModels = (SortedSet<String>) modelHierarchy.navigableKeySet();		
		
		return new ArrayList<String>(mainModels);	
		
	}
	
	
	public List<String> getReferencedModels()
	{
		Set<String> referencedModels = new HashSet<String>();				
		Collection<ArrayList<AMLExternalReference>> collExternalReferences = modelHierarchy.values();		
		Iterator<ArrayList<AMLExternalReference>> itListExtRef = collExternalReferences.iterator();
		Iterator<AMLExternalReference> it = null;
		
		while(itListExtRef.hasNext())
		{
			ArrayList<AMLExternalReference> listExternalRef = itListExtRef.next();
			
			it = listExternalRef.iterator();
			while(it.hasNext())
				referencedModels.add(it.next().getRefModel());
		}
		
		return new ArrayList<String>(referencedModels);	
	}
	
	
	public String getReferencedModelNameForModel(String model, String aliasReferencedModel)
	{
		String referencedModelName = null;
		
		ArrayList<AMLExternalReference> listExtRef = modelHierarchy.get(model);
		Iterator<AMLExternalReference> it = listExtRef.iterator();
		
		while(it.hasNext())
		{
			AMLExternalReference extRef = it.next();
			
			if(extRef.getAlias().equals(aliasReferencedModel))
				referencedModelName =  extRef.getRefModel();
		}
		
		
		return referencedModelName;		
	}

}
