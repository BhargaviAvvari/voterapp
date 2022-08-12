package com.voterapp.service;

import com.voterapp.exception.InValidVoterException;
import com.voterapp.exception.LocalityNotFoundException;
import com.voterapp.exception.NoVoterIDException;
import com.voterapp.exception.UnderAgeException;

public class ElectionBoothImpl implements IElectionBooth {
	String[] localities= {"bagulur", "hebbal","electronic city","rajijinagar"};

	@Override
	public boolean checkEligibility(int age, String Locality, int voterId) throws InValidVoterException{
		
		try {
			checkAge(age);
			checkLocality(Locality);
			checkvoterId(voterId);
		}catch(InValidVoterException e) {
			throw e;
		}
		return true;
	}
	private boolean checkAge(int age)throws UnderAgeException
	{
		if(age<18)
		{
			throw new UnderAgeException("age is less than 18 exception");
	}
	return true;
}
private boolean checkLocality(String locality)throws LocalityNotFoundException
{
	for (String localplace:localities)
	{
		if (locality.equalsIgnoreCase(localplace))
		{
			return true;
		}
	}
	throw new LocalityNotFoundException("locality not found exception");
}
private boolean checkvoterId (int voterId) throws NoVoterIDException
{
	if(voterId<1000 || voterId>9999)
	{
		throw new NoVoterIDException("voter id invalid");
	}
return true;
}
}



