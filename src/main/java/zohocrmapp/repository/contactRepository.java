package zohocrmapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import zohocrmapp.entities.contacts;

public interface contactRepository extends JpaRepository<contacts, Long> {

}
