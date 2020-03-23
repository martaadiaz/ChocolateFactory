package chocolateFactory.db.pojos;

import java.io.Serializable;

	public class Chocolate implements Serializable{
	private static final long serialVersionUID = -4281575077333973070L;
	
	private Integer ID_C;
	private String Name_C;
	private String Type;
	private String Flavour;
	private Integer Cocoa_Perc;
	private String Shape;
	private Integer Units;
	private Integer Client_id;
	private Integer Warehouse_id;
	
	//Constructors 
	public Chocolate() {
		super();
	}

	public Chocolate(Integer iD_C, String name_C, String type, String flavour, Integer cocoa_Perc, String shape,
			Integer units, Integer client_id, Integer warehouse_id) {
		super();
		ID_C = iD_C;
		Name_C = name_C;
		Type = type;
		Flavour = flavour;
		Cocoa_Perc = cocoa_Perc;
		Shape = shape;
		Units = units;
		Client_id = client_id;
		Warehouse_id = warehouse_id;
	}
	
	public Chocolate(String name_C, String type, String flavour, Integer cocoa_Perc, String shape) {
		super();
		Name_C = name_C;
		Type = type;
		Flavour = flavour;
		Cocoa_Perc = cocoa_Perc;
		Shape = shape;
		
		
	}

	//Getters and Setters 
	public Integer getID_C() {
		return ID_C;
	}

	public void setID_C(Integer iD_C) {
		ID_C = iD_C;
	}

	public String getName_C() {
		return Name_C;
	}

	public void setName_C(String name_C) {
		Name_C = name_C;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getFlavour() {
		return Flavour;
	}

	public void setFlavour(String flavour) {
		Flavour = flavour;
	}

	public Integer getCocoa_Perc() {
		return Cocoa_Perc;
	}

	public void setCocoa_Perc(Integer cocoa_Perc) {
		Cocoa_Perc = cocoa_Perc;
	}

	public String getShape() {
		return Shape;
	}

	public void setShape(String shape) {
		Shape = shape;
	}

	public Integer getUnits() {
		return Units;
	}

	public void setUnits(Integer units) {
		Units = units;
	}

	public Integer getClient_id() {
		return Client_id;
	}

	public void setClient_id(Integer client_id) {
		Client_id = client_id;
	}

	public Integer getWarehouse_id() {
		return Warehouse_id;
	}

	public void setWarehouse_id(Integer warehouse_id) {
		Warehouse_id = warehouse_id;
	}
	
	//To String
	@Override
	public String toString() {
		return "Chocolate [ID_C=" + ID_C + ", Name_C=" + Name_C + ", Type=" + Type + ", Flavour=" + Flavour
				+ ", Cocoa_Perc=" + Cocoa_Perc + ", Shape=" + Shape + ", Units=" + Units + ", Client_id=" + Client_id
				+ ", Warehouse_id=" + Warehouse_id + "]";
	}
	
	//Hashcode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Client_id == null) ? 0 : Client_id.hashCode());
		result = prime * result + ((Cocoa_Perc == null) ? 0 : Cocoa_Perc.hashCode());
		result = prime * result + ((Flavour == null) ? 0 : Flavour.hashCode());
		result = prime * result + ((ID_C == null) ? 0 : ID_C.hashCode());
		result = prime * result + ((Name_C == null) ? 0 : Name_C.hashCode());
		result = prime * result + ((Shape == null) ? 0 : Shape.hashCode());
		result = prime * result + ((Type == null) ? 0 : Type.hashCode());
		result = prime * result + ((Units == null) ? 0 : Units.hashCode());
		result = prime * result + ((Warehouse_id == null) ? 0 : Warehouse_id.hashCode());
		return result;
	}
	
	//Equals
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chocolate other = (Chocolate) obj;
		if (Client_id == null) {
			if (other.Client_id != null)
				return false;
		} else if (!Client_id.equals(other.Client_id))
			return false;
		if (Cocoa_Perc == null) {
			if (other.Cocoa_Perc != null)
				return false;
		} else if (!Cocoa_Perc.equals(other.Cocoa_Perc))
			return false;
		if (Flavour == null) {
			if (other.Flavour != null)
				return false;
		} else if (!Flavour.equals(other.Flavour))
			return false;
		if (ID_C == null) {
			if (other.ID_C != null)
				return false;
		} else if (!ID_C.equals(other.ID_C))
			return false;
		if (Name_C == null) {
			if (other.Name_C != null)
				return false;
		} else if (!Name_C.equals(other.Name_C))
			return false;
		if (Shape == null) {
			if (other.Shape != null)
				return false;
		} else if (!Shape.equals(other.Shape))
			return false;
		if (Type == null) {
			if (other.Type != null)
				return false;
		} else if (!Type.equals(other.Type))
			return false;
		if (Units == null) {
			if (other.Units != null)
				return false;
		} else if (!Units.equals(other.Units))
			return false;
		if (Warehouse_id == null) {
			if (other.Warehouse_id != null)
				return false;
		} else if (!Warehouse_id.equals(other.Warehouse_id))
			return false;
		return true;
	}
	
}
