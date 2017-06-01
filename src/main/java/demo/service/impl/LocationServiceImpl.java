package demo.service.impl;

import demo.domain.Location;
import demo.domain.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by vagrant on 5/31/17.
 */
public class LocationServiceImplImpl implements demo.service.LocationServiceImpl {

    private LocationRepository locationRepository;

    @Autowired
    public LocationServiceImplImpl(LocationRepository locationRepository) {

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


}

