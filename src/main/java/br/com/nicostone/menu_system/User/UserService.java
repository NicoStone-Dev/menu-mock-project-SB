package br.com.nicostone.menu_system.User;


import br.com.nicostone.menu_system.User.DTO.UserDTO;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    final UserRepo userRepo;

    UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    //CRUD
    public UserModel addUser(UserDTO user) {
        UserModel dtoToModel = new UserModel();
        dtoToModel.setEmail(user.getEmail());
        dtoToModel.setNotifyAlmoco(user.getNotifyAlmoco());
        dtoToModel.setNotifyJanta(user.getNotifyJanta());

        return userRepo.save(dtoToModel);
    }

    public List<UserModel> userList() {
        return userRepo.findAll();
    }

    public UserModel find(Long id) {
        return userRepo.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User with id: " + id + " not found"));
    }

    public UserModel updateUser(Long id, UserDTO user) {
        UserModel userToUpdate = find(id);

        if(user.getEmail() != null) {
            userToUpdate.setEmail(user.getEmail());
        }
        if (user.getNotifyAlmoco() != null) {
            userToUpdate.setNotifyAlmoco(user.getNotifyAlmoco());
        }
        if (user.getNotifyJanta() != null) {
            userToUpdate.setNotifyJanta(user.getNotifyAlmoco());
        }

        return userRepo.save(userToUpdate);
    }

    public void deleteUser(Long id) {
        userRepo.deleteById(id);
    }
}
