package zohocrmapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import zohocrmapp.entities.Billing;

public interface BillingRepository extends JpaRepository<Billing,Long> {

}
