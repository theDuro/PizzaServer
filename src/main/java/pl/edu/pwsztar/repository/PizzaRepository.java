package pl.edu.pwsztar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pl.edu.pwsztar.domain.entity.Pizza;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Long>, CrudRepository<Pizza, Long> {
    /**
     *
     * @param pizzaId
     */
    @Modifying
    @Query("select p.title,p.cost FROM Pizza p WHERE p.pizzaId= :pizzaId")
    void getTableById(@Param("pizzaId") Long pizzaId);

    /**
     *
     * @param pizzaId
     * @return product id from repository
     */
    Pizza findOneByPizzaId(Long pizzaId);
}
