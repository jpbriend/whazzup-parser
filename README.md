# Whazzup Parser

This Java library helps you parse whaazup.txt files provided by the IVAO network.

The format is described here: [Whazzup Format documentation](https://doc.ivao.aero/apidocumentation:whazzup:fileformat).

The main class to use is _WhazzupParser_.
Its contructor needs a valid path to the Whazzup file.

The method *parse()* parses the file and extracts ATCs and Pilots.
This method returns a *Whazzup* object which is composed of:
* pilots: List of *IvaoPilot*
* atcs: List of *IvaoATC*

