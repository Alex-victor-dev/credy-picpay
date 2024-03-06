package wakanda.academy.pay.picpaycredy.usuario.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import wakanda.academy.pay.picpaycredy.usuario.domain.entity.User;

public interface UserSpringDataJpaRepository extends JpaRepository<User, UUID> {

}
