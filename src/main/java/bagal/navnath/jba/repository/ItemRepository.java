package bagal.navnath.jba.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import bagal.navnath.jba.entity.Blog;
import bagal.navnath.jba.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {
	List<Item> findByBlog(Blog blog, Pageable pageable);
}
