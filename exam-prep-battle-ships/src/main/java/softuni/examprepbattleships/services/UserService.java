package softuni.examprepbattleships.services;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import softuni.examprepbattleships.domain.entities.User;
import softuni.examprepbattleships.domain.helpers.LoggedUser;
import softuni.examprepbattleships.domain.model.UserModel;
import softuni.examprepbattleships.repositories.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
    private final LoggedUser loggedUser;

    public UserService(UserRepository userRepository, ModelMapper modelMapper, LoggedUser loggedUser) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
        this.loggedUser = loggedUser;
    }

    public UserModel findByUsername(String username) {
        return this.modelMapper.map(this.userRepository.findByUsername(username).orElse(new User()), UserModel.class);
    }

    public UserModel findById(Long id) {
        return this.modelMapper.map(this.userRepository.findById(id).orElse(new User()), UserModel.class);
    }

    public UserModel findByIdNot(Long id) {
        return this.modelMapper.map(this.userRepository.findByIdNot(id).orElse(new User()), UserModel.class);
    }

}
