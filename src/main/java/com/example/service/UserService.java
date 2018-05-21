package com.example.service;
import com.example.model.User;
import com.example.persistence.UserMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * 
 **/
@Service
public class UserService {
	@Autowired
    private UserMapper mapper;
    
    public void insert(User obj){
    	mapper.insert(obj);
    }
    
    public void update(User obj){
    	mapper.update(obj);
    }
    
    public void delete(Long id){
    	mapper.delete(id);
    }
    
    public List<User> findAll(){
		return mapper.findAll();
	}
	
	public List<User> find(User obj){
		return mapper.find(obj);
	}
}