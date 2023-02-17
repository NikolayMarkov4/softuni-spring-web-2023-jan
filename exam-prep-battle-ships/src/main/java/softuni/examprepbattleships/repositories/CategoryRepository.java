package softuni.examprepbattleships.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import softuni.examprepbattleships.domain.entities.Category;
import softuni.examprepbattleships.domain.enums.CategoryType;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    Optional<Category> findByName(CategoryType name);
}
