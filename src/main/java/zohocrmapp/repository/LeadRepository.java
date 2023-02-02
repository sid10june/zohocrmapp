package zohocrmapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import zohocrmapp.entities.lead;

public interface LeadRepository extends JpaRepository<lead, Long> {

}
