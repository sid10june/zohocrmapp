package zohocrmapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import zohocrmapp.entities.contacts;
//import zohocrmapp.services.*;
//import zohocrmapp.services.leadService
import zohocrmapp.entities.lead;
import zohocrmapp.services.contactServices;
import zohocrmapp.services.leadService;

@Controller
public class leadcontroller {
     @Autowired 
	private leadService LeadService; 
     @Autowired
     private contactServices contactser;
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String viewcreatelead() { 
		return "create_lead";
	}
	@RequestMapping(value="/savelead",method=RequestMethod.POST)
	public String savelead(@ModelAttribute("lead") lead Lead,Model model) {
		LeadService.saveoneLead(Lead);
		model.addAttribute("lead",Lead);
		return "lead_info"; 
	} 
	@RequestMapping("/convert")
	public String convertlead(@RequestParam("id") long id,Model model) {
		System.out.println(id);
		lead lead = LeadService.getLeadById(id);
		contacts Con=new contacts();
		Con.setFirstName(lead.getFirstName());
		Con.setLastName(lead.getLastName());
		Con.setEmail(lead.getEmail());
		Con.setMobile(lead.getMobile());
		Con.setSource(lead.getSource());
		System.out.println(Con);
		contactser.saveContact(Con);
		LeadService.deleteLeadById(id);
		
		List<contacts> contact = contactser.getcontacts();
		model.addAttribute("contacts  ",contact);
		return "list_contacts" ;
	}
	@RequestMapping("/listall")
	public String listLeads(Model model) {
		List<lead> leads = LeadService.getAllLeads();
		model.addAttribute("lead",leads);
		return "list_leads";
	}
	@RequestMapping("/leadInfo")
	public String leadInfo(@RequestParam("id") long id,Model model) {
		lead lead = LeadService.getLeadById(id);
		model.addAttribute("lead",lead);
		return "lead_info";
	}
}
