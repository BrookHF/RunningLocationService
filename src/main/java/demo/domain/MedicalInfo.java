package demo.domain;

import javax.persistence.Embeddable;

/**
 * Created by vagrant on 5/29/17.
 */

@Embeddable
public class MedicalInfo {

    private Long bfr;

    private Long fmi;

    public MedicalInfo() {

    }

    public MedicalInfo(Long bfr, Long fmi) {
        this.bfr = bfr;
        this.fmi = fmi;
    }
}
