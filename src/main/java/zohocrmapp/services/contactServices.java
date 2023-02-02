package zohocrmapp.services;

import java.util.List;

import zohocrmapp.entities.contacts;

public interface contactServices {
public void saveContact(contacts contact);

List<contacts> getcontacts();

public contacts getContactById(long id);
}
