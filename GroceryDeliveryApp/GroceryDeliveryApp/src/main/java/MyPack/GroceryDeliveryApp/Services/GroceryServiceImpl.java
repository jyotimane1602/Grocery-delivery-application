package MyPack.GroceryDeliveryApp.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MyPack.GroceryDeliveryApp.DAO.GroceryDao;
import MyPack.GroceryDeliveryApp.Entities.Grocery;
@Service
public class GroceryServiceImpl implements GroceryService
{
	@Autowired
    private GroceryDao groceryDao;
	@Override
	public List<Grocery> getGrocery() 
	{
		// TODO Auto-generated method stub
		return groceryDao.findAll();
	}

	@Override
	public Grocery getGrocery(long groceryId)
	{
		// TODO Auto-generated method stub
		return groceryDao.getOne(groceryId);
	}

	@Override
	public Grocery addGrocery(Grocery grocery) 
	{
		// TODO Auto-generated method stub
		groceryDao.save(grocery);
		return grocery;
	}

	@Override
	public Grocery updateGrocery(Grocery grocery)
	{
		// TODO Auto-generated method stub
		groceryDao.save(grocery);
		return grocery;
	}

	@Override
	public void deleteGrocery(long parseLong) {
		// TODO Auto-generated method stub
		Grocery entity=groceryDao.getOne(parseLong);
		groceryDao.delete(entity);
	}

	

}
