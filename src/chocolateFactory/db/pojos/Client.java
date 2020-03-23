package chocolateFactory.db.pojos;

import java.io.Serializable;
import java.sql.Date;

public class Client implements Serializable {
	
	private static final long serialVersionUID = -1156840724257282729L;
	
	private Integer ID_CL;
	private String Name_CL;
	private Date DOB_CL;
	private Integer Cellphone_CL;
	private String Email_CL;
	private String Adress_CL;
	
	//Constructors
	public Client() {
		super();
	}

	public Client(Integer iD_CL, String name_CL, Date dOB_CL, Integer cellphone_CL, String email_CL, String adress_CL) {
		super();
		ID_CL = iD_CL;
		Name_CL = name_CL;
		DOB_CL = dOB_CL;
		Cellphone_CL = cellphone_CL;
		Email_CL = email_CL;
		Adress_CL = adress_CL;
	}

	public Client(String name_CL, Date dOB_CL, Integer cellphone_CL, String email_CL, String adress_CL) {
		super();
		Name_CL = name_CL;
		DOB_CL = dOB_CL;
		Cellphone_CL = cellphone_CL;
		Email_CL = email_CL;
		Adress_CL = adress_CL;
	}

	//Getters and Setters
	public Integer getID_CL() {
		return ID_CL;
	}

	public void setID_CL(Integer iD_CL) {
		ID_CL = iD_CL;
	}

	public String getName_CL() {
		return Name_CL;
	}

	public void setName_CL(String name_CL) {
		Name_CL = name_CL;
	}

	public Date getDOB_CL() {
		return DOB_CL;
	}

	public void setDOB_CL(Date dOB_CL) {
		DOB_CL = dOB_CL;
	}

	public Integer getCellphone_CL() {
		return Cellphone_CL;
	}

	public void setCellphone_CL(Integer cellphone_CL) {
		Cellphone_CL = cellphone_CL;
	}

	public String getEmail_CL() {
		return Email_CL;
	}

	public void setEmail_CL(String email_CL) {
		Email_CL = email_CL;
	}

	public String getAdress_CL() {
		return Adress_CL;
	}

	public void setAdress_CL(String adress_CL) {
		Adress_CL = adress_CL;
	}

	//To String
	@Override
	public String toString() {
		return "Client [ID_CL=" + ID_CL + ", Name_CL=" + Name_CL + ", DOB_CL=" + DOB_CL + ", Cellphone_CL="
				+ Cellphone_CL + ", Email_CL=" + Email_CL + ", Adress_CL=" + Adress_CL + "]";
	}

	//Hashcode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Adress_CL == null) ? 0 : Adress_CL.hashCode());
		result = prime * result + ((Cellphone_CL == null) ? 0 : Cellphone_CL.hashCode());
		result = prime * result + ((DOB_CL == null) ? 0 : DOB_CL.hashCode());
		result = prime * result + ((Email_CL == null) ? 0 : Email_CL.hashCode());
		result = prime * result + ((ID_CL == null) ? 0 : ID_CL.hashCode());
		result = prime * result + ((Name_CL == null) ? 0 : Name_CL.hashCode());
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
		Client other = (Client) obj;
		if (Adress_CL == null) {
			if (other.Adress_CL != null)
				return false;
		} else if (!Adress_CL.equals(other.Adress_CL))
			return false;
		if (Cellphone_CL == null) {
			if (other.Cellphone_CL != null)
				return false;
		} else if (!Cellphone_CL.equals(other.Cellphone_CL))
			return false;
		if (DOB_CL == null) {
			if (other.DOB_CL != null)
				return false;
		} else if (!DOB_CL.equals(other.DOB_CL))
			return false;
		if (Email_CL == null) {
			if (other.Email_CL != null)
				return false;
		} else if (!Email_CL.equals(other.Email_CL))
			return false;
		if (ID_CL == null) {
			if (other.ID_CL != null)
				return false;
		} else if (!ID_CL.equals(other.ID_CL))
			return false;
		if (Name_CL == null) {
			if (other.Name_CL != null)
				return false;
		} else if (!Name_CL.equals(other.Name_CL))
			return false;
		return true;
	}
	
	
	
	
	
	
}
