package spring.personalFinanceSystem.business;

import java.util.List;
import java.util.Optional;

import spring.personalFinanceSystem.entities.Itemm;

public interface ItemService {
	
	public List<Itemm> getAll();
	
	<S extends Itemm> S save(S entity);
   
	Optional<Itemm> findOne(Integer primaryKey);
    
	Long count();
    
	void delete(Integer id);
    
	boolean exists(Integer primaryKey);
	void update(Integer id,String miktar);
	<S extends Itemm> S update(S entity);
}
