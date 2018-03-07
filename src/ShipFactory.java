
public class ShipFactory {
	// TODO:
	// Create a ship based on the ShipType
	// read about the factory pattern
	//
	// PATROL, DESTROYER, SUBMARINE, BATTLESHIP, CARRIER
	public static Ship create(ShipType type) throws Exception {
		Ship ship = null;
		switch(type) {
		case BATTLESHIP:
			ship = new Ship(4);
			break;
		default:
			throw new Exception("Undefined ShipType: " + type);
		}
		return ship;
	}
}
