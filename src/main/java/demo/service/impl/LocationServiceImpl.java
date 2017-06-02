package demo.service.impl;

import demo.domain.Location;
import demo.domain.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import demo.service.LocationService;
import java.util.List;

/**
 * Created by vagrant on 5/31/17.
 */
public class LocationServiceImpl implements LocationService {

    private LocationRepository locationRepository;

    @Autowired
    public LocationServiceImpl(LocationRepository locationRepository) {

        this.locationRepository = locationRepository;
    }

    @Override
    public List<Location> svaeRunningLocations(List<Location> runningLocations) {
        return null;
    }

    @Override
    public void deleteAll() {
        locationRepository.deleteAll();
    }

    @Override
    public List<Location> findByRunnerMovementType(String movementType) {
        return null;
    }

    @Override
    public List<Location> findByRunningId(String runningId) {
        return null;
    }
}

