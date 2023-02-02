package zohocrmapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import zohocrmapp.entities.Billing;
import zohocrmapp.repository.BillingRepository;
@Service
public class BillingServiceimpl implements BillingService {

	@Autowired
	private BillingRepository billingRepo;
	
	@Override
	public void generateBill(Billing bill) {
		billingRepo.save(bill);
	}

}
