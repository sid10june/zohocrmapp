package zohocrmapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zohocrmapp.entities.lead;
import zohocrmapp.repository.LeadRepository;
@Service
public class LeadServiceimpl implements leadService {

	@Autowired
	private LeadRepository leadrepo;
	@Override
	public void saveoneLead(lead Lead) {
		leadrepo.save(Lead);

	}
	@Override
	public lead getLeadById(long id) {
		Optional<lead> findById = leadrepo.findById(id);
		lead lead = findById.get();
		return lead;
	}
	@Override
	public void deleteLeadById(long id) {
		leadrepo.deleteById(id);
		
	}
	@Override
	public List<lead> getAllLeads() {

		List<lead> leads = leadrepo.findAll();
		return leads;
	}
	

}
