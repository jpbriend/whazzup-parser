package fr.jpbriend.whazzup;

import fr.jpbriend.whazzup.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class WhazzupParser {
    private final static Logger logger = LoggerFactory.getLogger(WhazzupParser.class);

    private final String filePath;

    private final static String GENERAL_DELIMITER = "!GENERAL";
    private final static String CLIENTS_DELIMITER = "!CLIENTS";
    private final static String AIRPORTS_DELIMITER = "!AIRPORTS";
    private final static String SERVERS_DELIMITER = "!SERVERS";

    private static String section;
    private static int count = 0;

    private static Whazzup result;

    public WhazzupParser(String filePath) {
        if (filePath == null) {
            throw new NullPointerException("File path provided is null. Provide a valid file path");
        }
        this.filePath = filePath;
        result = new Whazzup();
        logger.info("Parsing file " + filePath);
    }

    public Whazzup parse() throws IOException {
        List<String> lines = this.readAsStrings();
        lines.stream()
                .forEach(WhazzupParser::generateModels);
        return result;
    }

    private static void generateModels(String line) {
        switch(line) {
            case GENERAL_DELIMITER:
                section = GENERAL_DELIMITER;
                break;
            case CLIENTS_DELIMITER:
                section = CLIENTS_DELIMITER;
                break;
            case SERVERS_DELIMITER:
                section = SERVERS_DELIMITER;
                break;
            case AIRPORTS_DELIMITER:
                section = AIRPORTS_DELIMITER;
                break;
            default:
                extractDataFromLine(line);
        }
    }

    private static void extractDataFromLine(String line) {
        if (CLIENTS_DELIMITER.equals(section)) {
            IvaoClient client = IvaoClientBuilder.newinstance(line);
            if (client != null) {
                logger.debug(client.toString());
                if (client instanceof IvaoATC) {
                    result.getAtcs().add((IvaoATC)client);
                }else if (client instanceof IvaoPilot) {
                    result.getPilots().add((IvaoPilot)client);
                }
            }
        }
    }

    private List<String> readAsStrings() throws IOException {
        return Files.readAllLines(Paths.get(this.filePath), StandardCharsets.ISO_8859_1);
    }


}
