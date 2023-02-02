package zohocrmapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zohocrmapp.entities.contacts;
import zohocrmapp.repository.contactRepository;
@Service
public class contactsimpl implements contactServices {

	@Autowired
	private contactRepository contactrepo;
	@Override
	public void saveContact(contacts contact) {
	contactrepo.save(contact); 

	}
	@Override
	public List<contacts> getcontacts() {
		List<contacts> Contacts = contactrepo.findAll();
		return Contacts ;
	}
	@Override
	public contacts getContactById(long id) {
		Optional<contacts> findById = contactrepo.findById(id);
		contacts contact=findById.get();
		return contact ;
	} 

}
