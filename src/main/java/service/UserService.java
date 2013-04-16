/**
 * 
 */
package service;

import java.util.List;

import model.Client;
import model.User;
import model.UserGroup;

/**
 * @author Thiago Cabral (tkbral@gmail.com)
 *
 */
public interface UserService {
	
	List<User> listAll();
	
	User getById(User user);
	
	List<User> getByGroup(UserGroup userGroup);
	
	List<User> getByClient(Client client);
}
