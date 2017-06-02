package demo.service;

import demo.domain.Location;
import org.h2.store.Page;

import java.util.List;

/**
 * Created by vagrant on 5/31/17.
 */
public interface LocationService {

    List<Location> svaeRunningLocations(List<Location> runningLocations);

    void deleteAll();

    List<Location> findByRunnerMovementType(String movementType);

    List<Location> findByRunningId(String runningId);

}
