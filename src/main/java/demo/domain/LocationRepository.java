package demo.domain;

import org.h2.store.Page;
import org.jboss.logging.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by vagrant on 5/31/17.
 */
public interface LocationRepository extends JpaRepository<Location, Long> {

    Page<Location> findByRunnerMovementType(@Param("movementType") Location.RunnerMovementType movementType);
}
