package fr.jpbriend.whazzup.model;

public class IvaoATC extends IvaoClient {
    private String frequency;
    private FacilityType facilityType;
    private Integer visualRange;
    private String ATIS;
    private long ATISTime;
    private ATCRating ATCRating;

    public IvaoATC() {
        super();
    }

    @Override
    public String toString() {
        return "IvaoATC{" +
                "frequency='" + frequency + '\'' +
                ", facilityType=" + facilityType +
                ", visualRange=" + visualRange +
                ", ATIS='" + ATIS + '\'' +
                ", ATISTime=" + ATISTime +
                ", ATCRating=" + ATCRating +
                '}';
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public FacilityType getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(FacilityType facilityType) {
        this.facilityType = facilityType;
    }

    public Integer getVisualRange() {
        return visualRange;
    }

    public void setVisualRange(Integer visualRange) {
        this.visualRange = visualRange;
    }

    public String getATIS() {
        return ATIS;
    }

    public void setATIS(String ATIS) {
        this.ATIS = ATIS;
    }

    public long getATISTime() {
        return ATISTime;
    }

    public void setATISTime(long ATISTime) {
        this.ATISTime = ATISTime;
    }

    public fr.jpbriend.whazzup.model.ATCRating getATCRating() {
        return ATCRating;
    }

    public void setATCRating(fr.jpbriend.whazzup.model.ATCRating ATCRating) {
        this.ATCRating = ATCRating;
    }
}
