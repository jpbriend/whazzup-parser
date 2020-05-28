package fr.jpbriend.whazzup.model;

import java.util.Objects;

public class IvaoPilot extends IvaoClient {
    private Integer groundSpeed;
    private String flightplanAircraft;
    private String flightplanCruisingSpeed;
    private String flightplanDepartureAerodrome;
    private String flightplanCruisingLevel;
    private String flightplanDestinationAerodrome;
    private String transponderCode;
    private String flightplanRevision;
    private String flightplanFlightRules;
    private String flightplanDepartureTime;
    private String flightplanActualDepartureTime;
    private String flightplanEETHours;
    private String flightplanEETMinutes;
    private String flightplanEnduranceHours;
    private String flightplanEnduranceMinutes;
    private String flightplanAlternateAerodrome;
    private String flightplanOtherInfo;
    private String flightplanRoute;
    private PilotRating pilotRating;
    private String flightplanSecondAlternateAerodrome;
    private String flightplanTypeOfFlight;
    private String flightplanPersonsOnBoard;
    private Integer heading;
    private Boolean onGround;
    private Simulator simulator;

    public IvaoPilot() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IvaoPilot)) return false;
        if (!super.equals(o)) return false;
        IvaoPilot ivaoPilot = (IvaoPilot) o;
        return  super.equals(o) && getPilotRating() == ivaoPilot.getPilotRating();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPilotRating());
    }

    @Override
    public String toString() {
        return "IvaoPilot{" +
                "groundSpeed=" + groundSpeed +
                ", flightplanAircraft='" + flightplanAircraft + '\'' +
                ", flightplanCruisingSpeed='" + flightplanCruisingSpeed + '\'' +
                ", flightplanDepartureAerodrome='" + flightplanDepartureAerodrome + '\'' +
                ", flightplanCruisingLevel='" + flightplanCruisingLevel + '\'' +
                ", flightplanDestinationAerodrome='" + flightplanDestinationAerodrome + '\'' +
                ", transponderCode='" + transponderCode + '\'' +
                ", flightplanRevision='" + flightplanRevision + '\'' +
                ", flightplanFlightRules='" + flightplanFlightRules + '\'' +
                ", flightplanDepartureTime='" + flightplanDepartureTime + '\'' +
                ", flightplanActualDepartureTime='" + flightplanActualDepartureTime + '\'' +
                ", flightplanEETHours='" + flightplanEETHours + '\'' +
                ", flightplanEETMinutes='" + flightplanEETMinutes + '\'' +
                ", flightplanEnduranceHours='" + flightplanEnduranceHours + '\'' +
                ", flightplanEnduranceMinutes='" + flightplanEnduranceMinutes + '\'' +
                ", flightplanAlternateAerodrome='" + flightplanAlternateAerodrome + '\'' +
                ", flightplanOtherInfo='" + flightplanOtherInfo + '\'' +
                ", flightplanRoute='" + flightplanRoute + '\'' +
                ", flightplanSecondAlternateAerodrome='" + flightplanSecondAlternateAerodrome + '\'' +
                ", flightplanTypeOfFlight='" + flightplanTypeOfFlight + '\'' +
                ", flightplanPersonsOnBoard='" + flightplanPersonsOnBoard + '\'' +
                ", heading=" + heading +
                ", onGround=" + onGround +
                ", simulator=" + simulator +
                '}';
    }

    public Integer getGroundSpeed() {
        return groundSpeed;
    }

    public void setGroundSpeed(Integer groundSpeed) {
        this.groundSpeed = groundSpeed;
    }

    public String getFlightplanAircraft() {
        return flightplanAircraft;
    }

    public void setFlightplanAircraft(String flightplanAircraft) {
        this.flightplanAircraft = flightplanAircraft;
    }

    public String getFlightplanCruisingSpeed() {
        return flightplanCruisingSpeed;
    }

    public void setFlightplanCruisingSpeed(String flightplanCruisingSpeed) {
        this.flightplanCruisingSpeed = flightplanCruisingSpeed;
    }

    public String getFlightplanDepartureAerodrome() {
        return flightplanDepartureAerodrome;
    }

    public void setFlightplanDepartureAerodrome(String flightplanDepartureAerodrome) {
        this.flightplanDepartureAerodrome = flightplanDepartureAerodrome;
    }

    public String getFlightplanCruisingLevel() {
        return flightplanCruisingLevel;
    }

    public void setFlightplanCruisingLevel(String flightplanCruisingLevel) {
        this.flightplanCruisingLevel = flightplanCruisingLevel;
    }

    public String getFlightplanDestinationAerodrome() {
        return flightplanDestinationAerodrome;
    }

    public void setFlightplanDestinationAerodrome(String flightplanDestinationAerodrome) {
        this.flightplanDestinationAerodrome = flightplanDestinationAerodrome;
    }

    public String getTransponderCode() {
        return transponderCode;
    }

    public void setTransponderCode(String transponderCode) {
        this.transponderCode = transponderCode;
    }

    public String getFlightplanRevision() {
        return flightplanRevision;
    }

    public void setFlightplanRevision(String flightplanRevision) {
        this.flightplanRevision = flightplanRevision;
    }

    public String getFlightplanFlightRules() {
        return flightplanFlightRules;
    }

    public void setFlightplanFlightRules(String flightplanFlightRules) {
        this.flightplanFlightRules = flightplanFlightRules;
    }

    public String getFlightplanDepartureTime() {
        return flightplanDepartureTime;
    }

    public void setFlightplanDepartureTime(String flightplanDepartureTime) {
        this.flightplanDepartureTime = flightplanDepartureTime;
    }

    public String getFlightplanActualDepartureTime() {
        return flightplanActualDepartureTime;
    }

    public void setFlightplanActualDepartureTime(String flightplanActualDepartureTime) {
        this.flightplanActualDepartureTime = flightplanActualDepartureTime;
    }

    public String getFlightplanEETHours() {
        return flightplanEETHours;
    }

    public void setFlightplanEETHours(String flightplanEETHours) {
        this.flightplanEETHours = flightplanEETHours;
    }

    public String getFlightplanEETMinutes() {
        return flightplanEETMinutes;
    }

    public void setFlightplanEETMinutes(String flightplanEETMinutes) {
        this.flightplanEETMinutes = flightplanEETMinutes;
    }

    public String getFlightplanEnduranceHours() {
        return flightplanEnduranceHours;
    }

    public void setFlightplanEnduranceHours(String flightplanEnduranceHours) {
        this.flightplanEnduranceHours = flightplanEnduranceHours;
    }

    public String getFlightplanEnduranceMinutes() {
        return flightplanEnduranceMinutes;
    }

    public void setFlightplanEnduranceMinutes(String flightplanEnduranceMinutes) {
        this.flightplanEnduranceMinutes = flightplanEnduranceMinutes;
    }

    public String getFlightplanAlternateAerodrome() {
        return flightplanAlternateAerodrome;
    }

    public void setFlightplanAlternateAerodrome(String flightplanAlternateAerodrome) {
        this.flightplanAlternateAerodrome = flightplanAlternateAerodrome;
    }

    public String getFlightplanOtherInfo() {
        return flightplanOtherInfo;
    }

    public void setFlightplanOtherInfo(String flightplanOtherInfo) {
        this.flightplanOtherInfo = flightplanOtherInfo;
    }

    public String getFlightplanRoute() {
        return flightplanRoute;
    }

    public void setFlightplanRoute(String flightplanRoute) {
        this.flightplanRoute = flightplanRoute;
    }

    public String getFlightplanSecondAlternateAerodrome() {
        return flightplanSecondAlternateAerodrome;
    }

    public void setFlightplanSecondAlternateAerodrome(String flightplanSecondAlternateAerodrome) {
        this.flightplanSecondAlternateAerodrome = flightplanSecondAlternateAerodrome;
    }

    public String getFlightplanTypeOfFlight() {
        return flightplanTypeOfFlight;
    }

    public void setFlightplanTypeOfFlight(String flightplanTypeOfFlight) {
        this.flightplanTypeOfFlight = flightplanTypeOfFlight;
    }

    public String getFlightplanPersonsOnBoard() {
        return flightplanPersonsOnBoard;
    }

    public void setFlightplanPersonsOnBoard(String flightplanPersonsOnBoard) {
        this.flightplanPersonsOnBoard = flightplanPersonsOnBoard;
    }

    public Integer getHeading() {
        return heading;
    }

    public void setHeading(Integer heading) {
        this.heading = heading;
    }

    public Boolean getOnGround() {
        return onGround;
    }

    public void setOnGround(Boolean onGround) {
        this.onGround = onGround;
    }

    public Simulator getSimulator() {
        return simulator;
    }

    public void setSimulator(Simulator simulator) {
        this.simulator = simulator;
    }

    public PilotRating getPilotRating() {
        return pilotRating;
    }

    public void setPilotRating(PilotRating pilotRating) {
        this.pilotRating = pilotRating;
    }
}
