package com.example.persistence;
import com.example.model.User;
import java.util.List;
public interface UserMapper{
	public void insert(User obj);
	public void update(User obj);
	public void delete(Long id);
	public List<User> findAll();
	public List<User> find(User obj);
	public User findById(Long id);
}
