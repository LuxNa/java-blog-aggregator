package bagal.navnath.jba.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import bagal.navnath.jba.entity.Blog;
import bagal.navnath.jba.entity.User;

public interface BlogRepository extends JpaRepository<Blog, Integer> {
	List<Blog> findByUser(User user);
	Blog findByName(String name);
}
