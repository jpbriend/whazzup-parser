package fr.jpbriend.whazzup.model;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IvaoATC)) return false;
        if (!super.equals(o)) return false;
        IvaoATC ivaoATC = (IvaoATC) o;
        return super.equals(o) && getATCRating() == ivaoATC.getATCRating();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getATCRating());
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
