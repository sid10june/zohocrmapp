package zohocrmapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import zohocrmapp.entities.Billing;
import zohocrmapp.entities.contacts;
import zohocrmapp.services.BillingService;
import zohocrmapp.services.contactServices;

@Controller
public class contactcontroller {
@Autowired
private contactServices service; 
@Autowired
private BillingService billingservice;

@RequestMapping("/listcontacts")
public String listcontact(Model model) {
	List<contacts> getcontacts = service.getcontacts();
	model.addAttribute("contacts",getcontacts);
	return"list_contacts";
}
@RequestMapping("/createBill")
public String createBill(@RequestParam("id") long id,Model model) {
	System.out.println(id);
	contacts contact=service.getContactById(id);
	model.addAttribute("contact",contact);
	return"generate_bill";
	
}
@RequestMapping("/saveBill")
public String generateBill(Billing bill) {

	billingservice.generateBill(bill);
	return"list_bills";
}
}
