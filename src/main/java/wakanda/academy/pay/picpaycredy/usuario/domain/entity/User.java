package wakanda.academy.pay.picpaycredy.usuario.domain.entity;

import java.math.BigDecimal;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import wakanda.academy.pay.picpaycredy.usuario.application.api.request.UserRequest;
import wakanda.academy.pay.picpaycredy.usuario.domain.enums.UserType;

@Getter
@Entity(name = "usuario")
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class User {

	@Id
	@Column(name = "id", updatable = false, unique = true, nullable = false)
	private UUID idUser;

	private String firstName;

	private String lastName;

	@Column(unique = true)
	private String document;

	@Column(unique = true)
	private String email;

	private BigDecimal balance;

	@Enumerated(EnumType.STRING)
	private UserType userType;

	public User(UserRequest userRequest) {
		this.firstName = userRequest.firstName();
		this.lastName = userRequest.lastName();
		this.document = userRequest.document();
		this.email = userRequest.email();
		this.balance = userRequest.balance();
		this.userType = userRequest.userType();
	}

}
