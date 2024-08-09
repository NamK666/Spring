package Coupling;

public class UserService {
	private UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public void createUser(User user) {
		userRepository.save(user);
	}
}
