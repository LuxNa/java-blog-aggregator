package bagal.navnath.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bagal.navnath.jba.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
