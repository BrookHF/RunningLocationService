package demo.domain;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;


/**
 * Created by vagrant on 5/31/17.
 */
public interface LocationRepository extends JpaRepository<Location, Long> {

    Page<Location> findbyRunnerMovementType(@Param("movementType") Location.RunnerMovementType movementType, Pageable page);

}
