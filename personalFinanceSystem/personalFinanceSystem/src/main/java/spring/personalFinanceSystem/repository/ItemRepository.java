package spring.personalFinanceSystem.repository;




import org.springframework.data.jpa.repository.JpaRepository;


import spring.personalFinanceSystem.entities.Itemm;

public interface ItemRepository extends JpaRepository<Itemm, Integer>{
	
}
