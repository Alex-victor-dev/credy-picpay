package wakanda.academy.pay.picpaycredy.usuario.application.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import wakanda.academy.pay.picpaycredy.usuario.application.api.request.UserRequest;
import wakanda.academy.pay.picpaycredy.usuario.application.api.response.UserResponse;
import wakanda.academy.pay.picpaycredy.usuario.application.repository.UserRepository;
import wakanda.academy.pay.picpaycredy.usuario.domain.entity.User;

@Log4j2
@Service
@RequiredArgsConstructor
public class UserApplicationService implements UserService {

	private final UserRepository userRepository;

	@Override
	public UserResponse createUser(UserRequest userRequest) {
		log.info("[start] UserApplicationService - createUser");
		User user = userRepository.saveUser(new User(userRequest);
		log.info("[finish] UserApplicationService - createUser");
		return null;
	}

}
