package demo.rest;

import demo.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

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

}
