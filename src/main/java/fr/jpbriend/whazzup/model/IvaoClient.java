package fr.jpbriend.whazzup.model;

import java.math.BigDecimal;
import java.util.Objects;

public class IvaoClient {
    private String callsign;
    private String VID;
    private String name;
    private String clientType;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private Integer altitude;
    private String server;
    private String protocol;
    private String combinedRating;
    private long connectionTime;
    private String softwareName;
    private String softwareVersion;
    private AdministrativeRating administrativeRating;

    public IvaoClient() { }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IvaoClient)) return false;
        IvaoClient that = (IvaoClient) o;
        return getVID().equals(that.getVID());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVID());
    }

    public String getCallsign() {
        return callsign;
    }

    public void setCallsign(String callsign) {
        this.callsign = callsign;
    }

    public String getVID() {
        return VID;
    }

    public void setVID(String VID) {
        this.VID = VID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public Integer getAltitude() {
        return altitude;
    }

    public void setAltitude(Integer altitude) {
        this.altitude = altitude;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getCombinedRating() {
        return combinedRating;
    }

    public void setCombinedRating(String combinedRating) {
        this.combinedRating = combinedRating;
    }

    public long getConnectionTime() {
        return connectionTime;
    }

    public void setConnectionTime(long connectionTime) {
        this.connectionTime = connectionTime;
    }

    public String getSoftwareName() {
        return softwareName;
    }

    public void setSoftwareName(String softwareName) {
        this.softwareName = softwareName;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public AdministrativeRating getAdministrativeRating() {
        return administrativeRating;
    }

    public void setAdministrativeRating(AdministrativeRating administrativeRating) {
        this.administrativeRating = administrativeRating;
    }
}
