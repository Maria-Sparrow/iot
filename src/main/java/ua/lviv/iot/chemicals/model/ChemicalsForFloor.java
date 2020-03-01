package ua.lviv.iot.chemicals.model;

public class ChemicalsForFloor extends AbstractHouseholdChemicals {


private String floorType ;

public ChemicalsForFloor(String producer, String floorType) {
	super(producer);
	this.floorType = floorType;
	
}

public String getFloorType() {
	return floorType;
}


}
