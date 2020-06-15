package fr.jpbriend.whazzup.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;
import java.util.regex.Pattern;

public class IvaoClientBuilder {
    private final static Logger logger = LoggerFactory.getLogger(IvaoClientBuilder.class);
    private final static Pattern pattern = Pattern.compile(":");
    private final static Boolean logReadingErrors = System.getProperty("LOG_READING_ERRORS") != null;

    public static IvaoClient newinstance(String line) {
        String[] values = pattern.split(line, -1);

        if (values[3].equals("ATC")) {
            try {
                IvaoATC atc = new IvaoATC();
                atc.setCallsign(values[0]);
                atc.setVID(values[1]);
                atc.setName(values[2]);
                atc.setClientType(values[3]);
                atc.setFrequency(values[4]);
                atc.setLatitude(new BigDecimal(values[5]));
                atc.setLongitude(new BigDecimal(values[6]));
                atc.setAltitude(new Integer(values[7]));
                atc.setServer(values[14]);
                atc.setProtocol(values[15]);
                atc.setCombinedRating(values[16]);
                atc.setFacilityType(FacilityType.getFacilityType(Integer.parseInt(values[18])));
                atc.setVisualRange(new Integer(values[19]));
                atc.setATIS(values[35]);
                atc.setATISTime(zeroLongIfEmpty(values[36]));
                atc.setConnectionTime(zeroLongIfEmpty(values[37]));
                atc.setSoftwareName(values[38]);
                atc.setSoftwareVersion(values[39]);
                atc.setAdministrativeRating(AdministrativeRating.getAdministrativeRating(Integer.parseInt(values[40])));
                atc.setATCRating(ATCRating.getATCRating(Integer.parseInt(values[41])));
                return atc;
            } catch (Exception e) {
                if (logReadingErrors) {
                    logger.warn("Error while reading line " + line, e);
                }
                return null;
            }
        } else if (values[3].equals("PILOT")) {
            IvaoPilot pilot = new IvaoPilot();
            pilot.setCallsign(values[0]);
            pilot.setVID(values[1]);
            pilot.setName(values[2]);
            pilot.setClientType(values[3]);
            pilot.setLatitude(zeroIfEmpty(values[5]));
            pilot.setLongitude(zeroIfEmpty(values[6]));
            pilot.setAltitude(zeroIfEmpty(values[7]).intValue());
            pilot.setGroundSpeed(zeroIfEmpty(values[8]).intValue());
            pilot.setFlightplanAircraft(values[9]);
            pilot.setFlightplanCruisingSpeed(values[10]);
            pilot.setFlightplanDepartureAerodrome(values[11]);
            pilot.setFlightplanCruisingLevel(values[12]);
            pilot.setFlightplanDestinationAerodrome(values[13]);
            pilot.setServer(values[14]);
            pilot.setProtocol(values[15]);
            pilot.setCombinedRating(values[16]);
            pilot.setTransponderCode(values[17]);
            pilot.setFlightplanRevision(values[20]);
            pilot.setFlightplanFlightRules(values[21]);
            pilot.setFlightplanDepartureTime(values[22]);
            pilot.setFlightplanActualDepartureTime(values[23]);
            pilot.setFlightplanEETHours(values[24]);
            pilot.setFlightplanEETMinutes(values[25]);
            pilot.setFlightplanEnduranceHours(values[26]);
            pilot.setFlightplanEnduranceMinutes(values[27]);
            pilot.setFlightplanAlternateAerodrome(values[28]);
            pilot.setFlightplanOtherInfo(values[29]);
            pilot.setFlightplanRoute(values[30]);
            pilot.setConnectionTime(zeroLongIfEmpty(values[37]));
            pilot.setSoftwareName(values[38]);
            pilot.setSoftwareVersion(values[39]);
            pilot.setAdministrativeRating(AdministrativeRating.getAdministrativeRating(Integer.parseInt(values[40])));
            pilot.setPilotRating(PilotRating.getPilotRating(Integer.parseInt(values[41])));
            pilot.setFlightplanSecondAlternateAerodrome(values[42]);
            pilot.setFlightplanTypeOfFlight(values[43]);
            pilot.setFlightplanPersonsOnBoard(values[44]);
            pilot.setHeading(new Integer(values[45]));
            pilot.setOnGround("1".equals(values[46]));
            pilot.setSimulator(Simulator.getSimulator(Integer.parseInt(values[47])));
            return pilot;
        } else {
            return null;
        }
    }

    private static BigDecimal zeroIfEmpty(String value) {
        if ("".equals(value)) {
            return BigDecimal.ZERO;
        } else {
            return new BigDecimal(value);
        }
    }

    private static Long zeroLongIfEmpty(String value) {
        if ("".equals(value)) {
            return Long.parseLong("0");
        } else {
            return Long.parseLong(value);
        }
    }
}
