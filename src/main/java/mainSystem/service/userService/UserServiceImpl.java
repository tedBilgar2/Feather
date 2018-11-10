package mainSystem.service.userService;

import mainSystem.dao.userRepository.UserRepository;
import mainSystem.model.userInitModels.Group;
import mainSystem.model.userInitModels.User;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    public User getUserById(int i) {
        return userRepository.getUserById(i);
    }

    public void addUser(User user) {
        userRepository.addUser(user);
    }

    public List<Group> getGroupsOfUser(int userId) {
        User user = userRepository.getUserById(userId);
        Hibernate.initialize(user.getGroups());
        return user.getGroups();
    }

    public void updateUser(User user){
        userRepository.setUser(user);
    }
}
