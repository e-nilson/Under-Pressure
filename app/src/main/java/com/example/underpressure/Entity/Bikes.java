package com.example.underpressure.Entity;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "bikes_table")
public class Bikes {
    @PrimaryKey(autoGenerate = true)
    private int bikeID;
    private String bikeName;
    private String forkModel;
    private int forkSpringRate;
    private int forkVolumeSpacers;
    private int forkLSC;
    private int forkHSC;
    private int forkLSR;
    private int forkHSR;
    private String shockModel;
    private int shockSpringRate;
    private int shockVolumeSpacers;
    private int shockLSC;
    private int shockHSC;
    private int shockLSR;
    private int shockHSR;
    private int frontTirePressure;
    private int rearTirePressure;

    // Constructors for bikes
    public Bikes(int bikeID, String bikeName, String forkModel, int forkSpringRate, int forkVolumeSpacers, int forkLSC, int forkHSC, int forkLSR, int forkHSR,
                 String shockModel, int shockSpringRate, int shockVolumeSpacers, int shockLSC, int shockHSC, int shockLSR, int shockHSR,
                 int frontTirePressure, int rearTirePressure) {
        this.bikeID = bikeID;
        this.bikeName = bikeName;
        this.forkModel = forkModel;
        this.forkSpringRate = forkSpringRate;
        this.forkVolumeSpacers = forkVolumeSpacers;
        this.forkLSC = forkLSC;
        this.forkHSC = forkHSC;
        this.forkLSR = forkLSR;
        this.forkHSR = forkHSR;
        this.shockModel = shockModel;
        this.shockSpringRate = shockSpringRate;
        this.shockVolumeSpacers = shockVolumeSpacers;
        this.shockLSC = shockLSC;
        this.shockHSC = shockHSC;
        this.shockLSR = shockLSR;
        this.shockHSR = shockHSR;
        this.frontTirePressure = frontTirePressure;
        this.rearTirePressure = rearTirePressure;
    }

    // Getter and setters for detailed bike information
    public int getBikeID() {
        return bikeID;
    }

    public void setBikeID(int bikeID) {
        this.bikeID = bikeID;
    }

    public String getBikeName() {
        return bikeName;
    }

    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }

    public String getForkModel() {
        return forkModel;
    }

    public void setForkModel(String forkModel) {
        this.forkModel = forkModel;
    }

    public int getForkSpringRate() {
        return forkSpringRate;
    }

    public void setForkSpringRate(int forkSpringRate) {
        this.forkSpringRate = forkSpringRate;
    }

    public int getForkVolumeSpacers() {
        return forkVolumeSpacers;
    }

    public void setForkVolumeSpacers(int forkVolumeSpacers) {
        this.forkVolumeSpacers = forkVolumeSpacers;
    }

    public int getForkLSC() {
        return forkLSC;
    }

    public void setForkLSC(int forkLSC) {
        this.forkLSC = forkLSC;
    }

    public int getForkHSC() {
        return forkHSC;
    }

    public void setForkHSC(int forkHSC) {
        this.forkHSC = forkHSC;
    }

    public int getForkLSR() {
        return forkLSR;
    }

    public void setForkLSR(int forkLSR) {
        this.forkLSR = forkLSR;
    }

    public int getForkHSR() {
        return forkHSR;
    }

    public void setForkHSR(int forkHSR) {
        this.forkHSR = forkHSR;
    }

    public String getShockModel() {
        return shockModel;
    }

    public void setShockModel(String shockModel) {
        this.shockModel = shockModel;
    }

    public int getShockSpringRate() {
        return shockSpringRate;
    }

    public void setShockSpringRate(int shockSpringRate) {
        this.shockSpringRate = shockSpringRate;
    }

    public int getShockVolumeSpacers() {
        return shockVolumeSpacers;
    }

    public void setShockVolumeSpacers(int shockVolumeSpacers) {
        this.shockVolumeSpacers = shockVolumeSpacers;
    }

    public int getShockLSC() {
        return shockLSC;
    }

    public void setShockLSC(int shockLSC) {
        this.shockLSC = shockLSC;
    }

    public int getShockHSC() {
        return shockHSC;
    }

    public void setShockHSC(int shockHSC) {
        this.shockHSC = shockHSC;
    }

    public int getShockLSR() {
        return shockLSR;
    }

    public void setShockLSR(int shockLSR) {
        this.shockLSR = shockLSR;
    }

    public int getShockHSR() {
        return shockHSR;
    }

    public void setShockHSR(int shockHSR) {
        this.shockHSR = shockHSR;
    }

    public int getFrontTirePressure() {
        return frontTirePressure;
    }

    public void setFrontTirePressure(int frontTirePressure) {
        this.frontTirePressure = frontTirePressure;
    }

    public int getRearTirePressure() {
        return rearTirePressure;
    }

    public void setRearTirePressure(int rearTirePressure) {
        this.rearTirePressure = rearTirePressure;
    }

    @Override
    public String toString() {
        return "Bikes{" +
                "bikeID=" + bikeID +
                ", bikeName='" + bikeName + '\'' +
                ", forkModel=" + forkModel + '\'' +
                ", forkSpringRate=" + forkSpringRate +
                ", forkVolumeSpacers='" + forkVolumeSpacers +
                ", forkLSC='" + forkLSC +
                ", forkHSC='" + forkHSC +
                ", forkLSR='" + forkLSR +
                ", forkHSR='" + forkHSR +
                ", shockModel=" + shockModel + '\'' +
                ", shockSpringRate=" + shockSpringRate +
                ", shockVolumeSpacers=" + shockVolumeSpacers +
                ", shockLSC=" + shockLSC +
                ", shockHSC=" + shockHSC +
                ", shockLSR=" + shockLSR +
                ", shockHSR=" + shockHSR +
                ", frontTirePressure=" + frontTirePressure +
                ", rearTirePressure=" + rearTirePressure +
                '}';
    }

}
