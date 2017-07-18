package bagal.navnath.jba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bagal.navnath.jba.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	Role findByName(String name);
}
