package cn.edu.ncut.ssh.dao;

import java.util.List;

import cn.edu.ncut.ssh.user.User;
import org.springframework.stereotype.Repository;



@Repository
public interface UserDao {
	//public void addUser(User user);

	public List<User> getUserList();

}
