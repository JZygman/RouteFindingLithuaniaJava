package aima.core.environment.map;

/**
 * Represents a simplified road map of Lithuania. The initialization method is
 * declared static. So it can also be used to initialize other specialized
 * subclasses of {@link ExtendableMap} with road map data from Lithuania. 
 * Based on Part of Romania code.
 * For reference, used Lithuania larger cities on the map and direct road path distances for measurement.
 * @original Romania code author Ruediger Lunde
 * @modification author Jokūbas Zygmanta
 */
public class SimplifiedRoadMapOfPartOfLithuania extends ExtendableMap {

	public SimplifiedRoadMapOfPartOfLithuania() {
		initMap(this);
	}

	// The different locations in the simplified map of part of Lithuania
	public static final String VILNIUS = "Vilnius";
	public static final String KAUNAS = "Kaunas";
	public static final String TAURAGE = "Tauragė";
	public static final String KLAIPEDA = "Klaipėda";
	public static final String TELSIAI = "Telšiai";
	public static final String SIAULIAI = "Šiauliai";
	public static final String PANEVEZYS = "Panevėžys";
	public static final String UTENA = "Utena";
	public static final String ALYTUS = "Alytus";
	public static final String MARIJAMPOLE = "Marijampolė";

	/**
	 * Initializes a map with a simplified road map of Lithuania.
	 */
	public static void initMap(ExtendableMap map) {
		// mapOfLithuania
		map.clear();
                map.addBidirectionalLink(VILNIUS, KAUNAS, 89.5);
                map.addBidirectionalLink(VILNIUS, UTENA, 92.9);
                map.addBidirectionalLink(KAUNAS, MARIJAMPOLE, 51.7);
                map.addBidirectionalLink(KAUNAS, TAURAGE, 109.9);
                map.addBidirectionalLink(KLAIPEDA, TAURAGE, 88.2);
                map.addBidirectionalLink(MARIJAMPOLE, TAURAGE, 103.3);
                map.addBidirectionalLink(TELSIAI, TAURAGE, 82.1);
                map.addBidirectionalLink(KAUNAS, PANEVEZYS, 97.4);
                map.addBidirectionalLink(SIAULIAI, PANEVEZYS, 68.9);
                map.addBidirectionalLink(SIAULIAI, TELSIAI, 66.6);
                map.addBidirectionalLink(TELSIAI, KLAIPEDA, 75.9);
                map.addBidirectionalLink(VILNIUS, ALYTUS, 86.0);
                map.addBidirectionalLink(KAUNAS, ALYTUS, 56.7);
                map.addBidirectionalLink(KAUNAS, UTENA, 127.4);
                map.addBidirectionalLink(PANEVEZYS, UTENA, 82.9);
                map.addBidirectionalLink(MARIJAMPOLE, ALYTUS, 47.6);

		// distances and directions
		// reference location: Kaunas
                map.setDistAndDirToRefLocation(KAUNAS, 0, 360);
                map.setDistAndDirToRefLocation(VILNIUS, 100, 279);
                map.setDistAndDirToRefLocation(ALYTUS, 50, 350);
                map.setDistAndDirToRefLocation(MARIJAMPOLE, 47, 40);
                map.setDistAndDirToRefLocation(TAURAGE, 105, 116);
                map.setDistAndDirToRefLocation(KLAIPEDA, 180, 130);
                map.setDistAndDirToRefLocation(TELSIAI, 150, 157);
                map.setDistAndDirToRefLocation(SIAULIAI, 135, 170);
                map.setDistAndDirToRefLocation(PANEVEZYS, 110, 195);
                map.setDistAndDirToRefLocation(UTENA, 110, 250);
	}
}
