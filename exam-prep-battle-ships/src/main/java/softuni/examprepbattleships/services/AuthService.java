package softuni.examprepbattleships.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import softuni.examprepbattleships.domain.entities.User;
import softuni.examprepbattleships.domain.helpers.LoggedUser;
import softuni.examprepbattleships.domain.model.binding.UserLoginModel;
import softuni.examprepbattleships.domain.model.binding.UserRegisterModel;
import softuni.examprepbattleships.repositories.UserRepository;

@Service
public class AuthService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final LoggedUser loggedUser;


    @Autowired
    public AuthService(UserRepository userRepository, ModelMapper modelMapper, LoggedUser loggedUser) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
        this.loggedUser = loggedUser;
    }

    public void registerUser(UserRegisterModel userRegisterModel) {
        this.userRepository.saveAndFlush(this.modelMapper.map(userRegisterModel, User.class));
    }

    public void loginUser(UserLoginModel userLoginModel) {
        User byUsername = this.userRepository.findByUsername(userLoginModel.getUsername()).get();

        this.loggedUser.setId(byUsername.getId());
    }

    public void logoutUser() {
        loggedUser.clearUser();
    }
}
