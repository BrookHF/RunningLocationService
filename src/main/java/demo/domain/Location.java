package demo.domain;

import javax.persistence.*;
import java.util.Date;
/**
 * Created by vagrant on 5/29/17.
 */
@Entity
@Table(name = "LOCATIONS")
public class Location {

    enum GpsStatus {
        EXCELLENT, OK, UNRELIABLE, BAD, NOFIX, UNKNOWN
    }

    public enum RunnerMovementType{
        STOPPED, IN_MOTION;

        public boolean isMoving() {
            return this != STOPPED;
        }
    }

    @Id
    @GeneratedValue
    private Long id;

    private double latitude;
    private double longitude;
    private String heading;
    private double pgsSpeed;
    private GpsStatus gpsStatus;
    private double odometer;
    private double totalRuningTime;
    private double totalIdleTime;
    private double totalCalorieBurnt;
    private String address;
    private Date timestamp = new Date();
    private String gearProvider;
    private RunnerMovementType runnerMovementType = RunnerMovementType.STOPPED;
    private String serviceType;

    @Embedded
    @AttributeOverride(name = "bandMake", column = @Column(name = "unit_band_make"))
    private UnitInfo unitInfo;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="fml", column = @Column(name = "medical_fmi")),
            @AttributeOverride(name="bft", column = @Column(name = "medical_bfr"))
    })
    private MedicalInfo medicalInfo;

    public Location() {}

    public Location(UnitInfo unitInfo) {
        this.unitInfo = unitInfo;
    }

    public Location(String runningId) {
        this.unitInfo = new UnitInfo(runningId);
    }

    public String getRunningId() {
        return this.unitInfo == null ? null : this.unitInfo.getRunningId();
    }
}
