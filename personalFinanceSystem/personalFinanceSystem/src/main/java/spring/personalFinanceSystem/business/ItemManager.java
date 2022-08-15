package spring.personalFinanceSystem.business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.personalFinanceSystem.entities.Itemm;
import spring.personalFinanceSystem.repository.ItemRepository;

@Service
public class ItemManager implements ItemService {

		private ItemRepository itemRepository;
	
	@Autowired
	public ItemManager(ItemRepository itemRepository) {
			super();
			this.itemRepository = itemRepository;
		}
	@Override
	public List<Itemm> getAll() {
		// TODO Auto-generated method stub
		return  this.itemRepository.findAll();
	}
	@Override
	public <S extends Itemm> S save(S entity) {
		// TODO Auto-generated method stub
		return this.itemRepository.save(entity);
	}
	@Override
	public Optional<Itemm> findOne(Integer primaryKey) {
		// TODO Auto-generated method stub
		return this.itemRepository.findById(primaryKey);
	}
	
	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return this.itemRepository.count();
	}
	@Override
	public void delete(Integer id) {
		this.itemRepository.deleteById(id);
		
	}
	@Override
	public boolean exists(Integer primaryKey) {
		// TODO Auto-generated method stub
		return this.itemRepository.existsById(primaryKey);
	}
	@Override
	public void update(Integer id, String miktar) {
		// TODO Auto-generated method stub
		Itemm myItem = itemRepository.getById(id);
		myItem.setMiktar(miktar);
		this.itemRepository.save(myItem);
	}
	@Override
	public <S extends Itemm> S update(S entity) {
		entity.setId(entity.getId());
		entity.setMiktar(entity.getMiktar());
		entity.setAciklama(entity.getAciklama());	
		entity.setIslem(entity.getIslem());	
		return this.itemRepository.save(entity);
	}
	
}
