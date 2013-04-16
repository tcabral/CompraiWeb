/**
 * 
 */
package dao;

import java.util.List;

import model.Client;
import model.User;
import model.UserGroup;

/**
 * @author Thiago Cabral (tkbral@gmail.com)
 *
 */
public interface UserDao {
	
	List<User> findAll();
	
	User findById(User user);
	
	List<User> findByGroup(UserGroup userGroup);

	List<User> findByClient(Client client);
}
