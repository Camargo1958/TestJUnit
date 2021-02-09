package main;

public class Car extends Vehicle{

    private Double motorPower;
    private String model;
    private Double kmPerLitre;
    private Double tankCapacity;
    private Double traveledDistance;
    private Double consumedCombustor;


    public Car(double weight, String poweredBy, int numberOfPassangers, Double motorPower, String model, Double kmPerLitre, Double tankCapacity) {
        super(weight, poweredBy, numberOfPassangers);
        this.motorPower = motorPower == null ? 10.0 : motorPower;
        this.model = model == null ? "Not defined" : model;
        this.kmPerLitre = kmPerLitre == null ? 1.0 : kmPerLitre;
        this.tankCapacity = tankCapacity == null ? 15.0 : tankCapacity;
    }

    public double getWeight() {
        return super.getWeight();
    }

    public String getPoweredBy() {
        return super.getPoweredBy();
    }

    public int getNumberOfPassangers() {
        return super.getNumberOfPassangers();
    }

    public Double getMotorPower() {
        return motorPower;
    }

    public String getModel() {
        return model;
    }

    public Double getKmPerLitre() {
        return kmPerLitre;
    }

    public Double getTankCapacity() {
        return tankCapacity;
    }

    public void setTraveledDistance(Double traveledDistance){
        this.traveledDistance = traveledDistance;
    }

    public Double getTraveledDistance() {
        return traveledDistance;
    }

    public Double consumedCombustorCalc() {
        if(getTraveledDistance()>0.0)
        {
            return getTraveledDistance()/getKmPerLitre();
        } else {
            return 0.0;
        }
    }
}
