package demo.service.impl;

import demo.domain.Location;
import demo.domain.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import demo.service.LocationService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by vagrant on 5/31/17.
 */
@Service
public class LocationServiceImpl implements LocationService {

    private LocationRepository locationRepository;

    @Autowired
    public LocationServiceImpl(LocationRepository locationRepository) {

        this.locationRepository = locationRepository;
    }

    @Override
    public List<Location> svaeRunningLocations(List<Location> runningLocations) {
        return locationRepository.save(runningLocations);
    }

    @Override
    public void deleteAll() {
        locationRepository.deleteAll();
    }


    @Override
    public Page<Location> findByRunnerMovementType(String movementType, Pageable page) {
        return null;
    }

    @Override
    public Page<Location> findByRunningId(String runningId) {
        return null;
    }
}

