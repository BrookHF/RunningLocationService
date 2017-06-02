package demo.rest;

import demo.domain.Location;
import demo.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by vagrant on 5/31/17.
 */
@RestController
public class RunningUploadRestController {

    private LocationService locationService;

    @Autowired
    public RunningUploadRestController(LocationService locationService) {
        this.locationService = locationService;
    }

    @RequestMapping(value = "/running", method = RequestMethod.POST)
    public void upload(@RequestBody List<Location> locations) {
        this.locationService.svaeRunningLocations(locations);
    }

    @RequestMapping(value = "/running/{movementType}", method = RequestMethod.GET)
    public Page<Location> findByMovementType(@PathVariable String movementType,
                                             @RequestParam(name = "page") int page,
                                             @RequestParam(name = "size") int size
    ){
        return locationService.findByRunnerMovementType(movementType, new PageRequest(page, size));
    }

}
