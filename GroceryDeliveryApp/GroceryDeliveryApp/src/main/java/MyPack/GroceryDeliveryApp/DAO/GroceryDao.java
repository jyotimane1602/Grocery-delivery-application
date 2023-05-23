package MyPack.GroceryDeliveryApp.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import MyPack.GroceryDeliveryApp.Entities.Grocery;
@Repository
public interface GroceryDao extends JpaRepository<Grocery, Long>
{

}
