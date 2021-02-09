package main;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class Cup {
	
	private String liquidType;
	private double percentFull;
	
	public Cup(String liquidType, double percentFull) {
		super();
		this.liquidType = liquidType;
		this.percentFull = percentFull;
	}
	
	public String getLiquidType() {
		return liquidType;
	}
	public void setLiquidType(String liquidType) {
		this.liquidType = liquidType;
	}
	public double getPercentFull() {
		return percentFull;
	}
	public void setPercentFull(double percentFull) {
		this.percentFull = percentFull;
	}


	public String getFillstatus() {
		double level = this.getPercentFull();
		String Status = "Half";
		if (level >=0.0 & level <= 5.0) Status = "Empty";
		if (level > 5.0 & level <=25.0) Status = "Minimum";
		if (level > 25.0 & level <=45.0) Status = "Almost Half";
		if (level > 60.0 & level <95.0) Status = "Almost Full";
		if (level >= 95.0 & level <=100.0) Status = "Full";
		if (level <0.0 || level >100.0) Status = "LEVEL METER OUT OF RANGE";

		return Status;
	}
}
