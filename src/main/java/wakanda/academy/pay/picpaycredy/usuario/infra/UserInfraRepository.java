package wakanda.academy.pay.picpaycredy.usuario.infra;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import wakanda.academy.pay.picpaycredy.usuario.application.repository.UserRepository;
import wakanda.academy.pay.picpaycredy.usuario.domain.entity.User;

@Log4j2
@Repository
@RequiredArgsConstructor
public class UserInfraRepository implements UserRepository {

	private final UserSpringDataJpaRepository userSpringDataJpaRepository;

	@Override
	public User saveUser(User user) {
		log.info("[start] UserInfraRepository - saveUser");
		try {
			userSpringDataJpaRepository.save(user);
		} catch (DataIntegrityViolationException e) {
			log.error("Já Existe um cliente Cadastrado com esse Documento ou Email", e);
			throw new RuntimeException("Já Existe um cliente Cadastrado com esse Documento ou Email");
		}
		log.info("[finish] UserInfraRepository - saveUser");
		return user;
	}

}
