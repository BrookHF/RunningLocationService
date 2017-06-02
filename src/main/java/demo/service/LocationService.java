package demo.service;

import demo.domain.Location;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;

/**
 * Created by vagrant on 5/31/17.
 */
public interface LocationService {

    List<Location> svaeRunningLocations(List<Location> runningLocations);

    void deleteAll();

    Page<Location> findByRunnerMovementType(String movementType, Pageable page);

    Page<Location> findByRunningId(String runningId);

}
