package zohocrmapp.services;

import java.util.List;

import zohocrmapp.entities.lead;

public interface leadService {

	public void saveoneLead(lead Lead);
	public lead getLeadById(long id);
	public void deleteLeadById(long id);
	public List<lead> getAllLeads();


}
