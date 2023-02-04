// Generated with g9.

package com.ipn.upiita.weatherstation.model.entity;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

import lombok.Data;

@Data
@Entity(name="upiitawe")
public class Upiitawe implements Serializable {

    /** Primary key. */
    protected static final String PK = "dateTime";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @Column(unique=true, nullable=false, precision=10)
    private int dateTime;
    @Column(nullable=false, precision=10)
    private int usUnits;
    @Column(nullable=false, precision=10)
    private int interval;
    @Column(precision=22)
    private double barometer;
    @Column(precision=22)
    private double pressure;
    @Column(precision=22)
    private double altimeter;
    @Column(precision=22)
    private double inTemp;
    @Column(precision=22)
    private double outTemp;
    @Column(precision=22)
    private double inHumidity;
    @Column(precision=22)
    private double outHumidity;
    @Column(precision=22)
    private double windSpeed;
    @Column(precision=22)
    private double windDir;
    @Column(precision=22)
    private double windGust;
    @Column(precision=22)
    private double windGustDir;
    @Column(precision=22)
    private double rainRate;
    @Column(precision=22)
    private double rain;
    @Column(precision=22)
    private double dewpoint;
    @Column(precision=22)
    private double windchill;
    @Column(precision=22)
    private double heatindex;
    @Column(name="ET", precision=22)
    private double et;
    @Column(precision=22)
    private double radiation;
    @Column(name="UV", precision=22)
    private double uv;
    @Column(precision=22)
    private double extraTemp1;
    @Column(precision=22)
    private double extraTemp2;
    @Column(precision=22)
    private double extraTemp3;
    @Column(precision=22)
    private double soilTemp1;
    @Column(precision=22)
    private double soilTemp2;
    @Column(precision=22)
    private double soilTemp3;
    @Column(precision=22)
    private double soilTemp4;
    @Column(precision=22)
    private double leafTemp1;
    @Column(precision=22)
    private double leafTemp2;
    @Column(precision=22)
    private double extraHumid1;
    @Column(precision=22)
    private double extraHumid2;
    @Column(precision=22)
    private double soilMoist1;
    @Column(precision=22)
    private double soilMoist2;
    @Column(precision=22)
    private double soilMoist3;
    @Column(precision=22)
    private double soilMoist4;
    @Column(precision=22)
    private double leafWet1;
    @Column(precision=22)
    private double leafWet2;
    @Column(precision=22)
    private double rxCheckPercent;
    @Column(precision=22)
    private double txBatteryStatus;
    @Column(precision=22)
    private double consBatteryVoltage;
    @Column(precision=22)
    private double hail;
    @Column(precision=22)
    private double hailRate;
    @Column(precision=22)
    private double heatingTemp;
    @Column(precision=22)
    private double heatingVoltage;
    @Column(precision=22)
    private double supplyVoltage;
    @Column(precision=22)
    private double referenceVoltage;
    @Column(precision=22)
    private double windBatteryStatus;
    @Column(precision=22)
    private double rainBatteryStatus;
    @Column(precision=22)
    private double outTempBatteryStatus;
    @Column(precision=22)
    private double inTempBatteryStatus;

    /** Default constructor. */
    public Upiitawe() {
        super();
    }

    /**
     * Access method for dateTime.
     *
     * @return the current value of dateTime
     */
    public int getDateTime() {
        return dateTime;
    }

    /**
     * Setter method for dateTime.
     *
     * @param aDateTime the new value for dateTime
     */
    public void setDateTime(int aDateTime) {
        dateTime = aDateTime;
    }

    /**
     * Access method for usUnits.
     *
     * @return the current value of usUnits
     */
    public int getUsUnits() {
        return usUnits;
    }

    /**
     * Setter method for usUnits.
     *
     * @param aUsUnits the new value for usUnits
     */
    public void setUsUnits(int aUsUnits) {
        usUnits = aUsUnits;
    }

    /**
     * Access method for interval.
     *
     * @return the current value of interval
     */
    public int getInterval() {
        return interval;
    }

    /**
     * Setter method for interval.
     *
     * @param aInterval the new value for interval
     */
    public void setInterval(int aInterval) {
        interval = aInterval;
    }

    /**
     * Access method for barometer.
     *
     * @return the current value of barometer
     */
    public double getBarometer() {
        return barometer;
    }

    /**
     * Setter method for barometer.
     *
     * @param aBarometer the new value for barometer
     */
    public void setBarometer(double aBarometer) {
        barometer = aBarometer;
    }

    /**
     * Access method for pressure.
     *
     * @return the current value of pressure
     */
    public double getPressure() {
        return pressure;
    }

    /**
     * Setter method for pressure.
     *
     * @param aPressure the new value for pressure
     */
    public void setPressure(double aPressure) {
        pressure = aPressure;
    }

    /**
     * Access method for altimeter.
     *
     * @return the current value of altimeter
     */
    public double getAltimeter() {
        return altimeter;
    }

    /**
     * Setter method for altimeter.
     *
     * @param aAltimeter the new value for altimeter
     */
    public void setAltimeter(double aAltimeter) {
        altimeter = aAltimeter;
    }

    /**
     * Access method for inTemp.
     *
     * @return the current value of inTemp
     */
    public double getInTemp() {
        return inTemp;
    }

    /**
     * Setter method for inTemp.
     *
     * @param aInTemp the new value for inTemp
     */
    public void setInTemp(double aInTemp) {
        inTemp = aInTemp;
    }

    /**
     * Access method for outTemp.
     *
     * @return the current value of outTemp
     */
    public double getOutTemp() {
        return outTemp;
    }

    /**
     * Setter method for outTemp.
     *
     * @param aOutTemp the new value for outTemp
     */
    public void setOutTemp(double aOutTemp) {
        outTemp = aOutTemp;
    }

    /**
     * Access method for inHumidity.
     *
     * @return the current value of inHumidity
     */
    public double getInHumidity() {
        return inHumidity;
    }

    /**
     * Setter method for inHumidity.
     *
     * @param aInHumidity the new value for inHumidity
     */
    public void setInHumidity(double aInHumidity) {
        inHumidity = aInHumidity;
    }

    /**
     * Access method for outHumidity.
     *
     * @return the current value of outHumidity
     */
    public double getOutHumidity() {
        return outHumidity;
    }

    /**
     * Setter method for outHumidity.
     *
     * @param aOutHumidity the new value for outHumidity
     */
    public void setOutHumidity(double aOutHumidity) {
        outHumidity = aOutHumidity;
    }

    /**
     * Access method for windSpeed.
     *
     * @return the current value of windSpeed
     */
    public double getWindSpeed() {
        return windSpeed;
    }

    /**
     * Setter method for windSpeed.
     *
     * @param aWindSpeed the new value for windSpeed
     */
    public void setWindSpeed(double aWindSpeed) {
        windSpeed = aWindSpeed;
    }

    /**
     * Access method for windDir.
     *
     * @return the current value of windDir
     */
    public double getWindDir() {
        return windDir;
    }

    /**
     * Setter method for windDir.
     *
     * @param aWindDir the new value for windDir
     */
    public void setWindDir(double aWindDir) {
        windDir = aWindDir;
    }

    /**
     * Access method for windGust.
     *
     * @return the current value of windGust
     */
    public double getWindGust() {
        return windGust;
    }

    /**
     * Setter method for windGust.
     *
     * @param aWindGust the new value for windGust
     */
    public void setWindGust(double aWindGust) {
        windGust = aWindGust;
    }

    /**
     * Access method for windGustDir.
     *
     * @return the current value of windGustDir
     */
    public double getWindGustDir() {
        return windGustDir;
    }

    /**
     * Setter method for windGustDir.
     *
     * @param aWindGustDir the new value for windGustDir
     */
    public void setWindGustDir(double aWindGustDir) {
        windGustDir = aWindGustDir;
    }

    /**
     * Access method for rainRate.
     *
     * @return the current value of rainRate
     */
    public double getRainRate() {
        return rainRate;
    }

    /**
     * Setter method for rainRate.
     *
     * @param aRainRate the new value for rainRate
     */
    public void setRainRate(double aRainRate) {
        rainRate = aRainRate;
    }

    /**
     * Access method for rain.
     *
     * @return the current value of rain
     */
    public double getRain() {
        return rain;
    }

    /**
     * Setter method for rain.
     *
     * @param aRain the new value for rain
     */
    public void setRain(double aRain) {
        rain = aRain;
    }

    /**
     * Access method for dewpoint.
     *
     * @return the current value of dewpoint
     */
    public double getDewpoint() {
        return dewpoint;
    }

    /**
     * Setter method for dewpoint.
     *
     * @param aDewpoint the new value for dewpoint
     */
    public void setDewpoint(double aDewpoint) {
        dewpoint = aDewpoint;
    }

    /**
     * Access method for windchill.
     *
     * @return the current value of windchill
     */
    public double getWindchill() {
        return windchill;
    }

    /**
     * Setter method for windchill.
     *
     * @param aWindchill the new value for windchill
     */
    public void setWindchill(double aWindchill) {
        windchill = aWindchill;
    }

    /**
     * Access method for heatindex.
     *
     * @return the current value of heatindex
     */
    public double getHeatindex() {
        return heatindex;
    }

    /**
     * Setter method for heatindex.
     *
     * @param aHeatindex the new value for heatindex
     */
    public void setHeatindex(double aHeatindex) {
        heatindex = aHeatindex;
    }

    /**
     * Access method for et.
     *
     * @return the current value of et
     */
    public double getEt() {
        return et;
    }

    /**
     * Setter method for et.
     *
     * @param aEt the new value for et
     */
    public void setEt(double aEt) {
        et = aEt;
    }

    /**
     * Access method for radiation.
     *
     * @return the current value of radiation
     */
    public double getRadiation() {
        return radiation;
    }

    /**
     * Setter method for radiation.
     *
     * @param aRadiation the new value for radiation
     */
    public void setRadiation(double aRadiation) {
        radiation = aRadiation;
    }

    /**
     * Access method for uv.
     *
     * @return the current value of uv
     */
    public double getUv() {
        return uv;
    }

    /**
     * Setter method for uv.
     *
     * @param aUv the new value for uv
     */
    public void setUv(double aUv) {
        uv = aUv;
    }

    /**
     * Access method for extraTemp1.
     *
     * @return the current value of extraTemp1
     */
    public double getExtraTemp1() {
        return extraTemp1;
    }

    /**
     * Setter method for extraTemp1.
     *
     * @param aExtraTemp1 the new value for extraTemp1
     */
    public void setExtraTemp1(double aExtraTemp1) {
        extraTemp1 = aExtraTemp1;
    }

    /**
     * Access method for extraTemp2.
     *
     * @return the current value of extraTemp2
     */
    public double getExtraTemp2() {
        return extraTemp2;
    }

    /**
     * Setter method for extraTemp2.
     *
     * @param aExtraTemp2 the new value for extraTemp2
     */
    public void setExtraTemp2(double aExtraTemp2) {
        extraTemp2 = aExtraTemp2;
    }

    /**
     * Access method for extraTemp3.
     *
     * @return the current value of extraTemp3
     */
    public double getExtraTemp3() {
        return extraTemp3;
    }

    /**
     * Setter method for extraTemp3.
     *
     * @param aExtraTemp3 the new value for extraTemp3
     */
    public void setExtraTemp3(double aExtraTemp3) {
        extraTemp3 = aExtraTemp3;
    }

    /**
     * Access method for soilTemp1.
     *
     * @return the current value of soilTemp1
     */
    public double getSoilTemp1() {
        return soilTemp1;
    }

    /**
     * Setter method for soilTemp1.
     *
     * @param aSoilTemp1 the new value for soilTemp1
     */
    public void setSoilTemp1(double aSoilTemp1) {
        soilTemp1 = aSoilTemp1;
    }

    /**
     * Access method for soilTemp2.
     *
     * @return the current value of soilTemp2
     */
    public double getSoilTemp2() {
        return soilTemp2;
    }

    /**
     * Setter method for soilTemp2.
     *
     * @param aSoilTemp2 the new value for soilTemp2
     */
    public void setSoilTemp2(double aSoilTemp2) {
        soilTemp2 = aSoilTemp2;
    }

    /**
     * Access method for soilTemp3.
     *
     * @return the current value of soilTemp3
     */
    public double getSoilTemp3() {
        return soilTemp3;
    }

    /**
     * Setter method for soilTemp3.
     *
     * @param aSoilTemp3 the new value for soilTemp3
     */
    public void setSoilTemp3(double aSoilTemp3) {
        soilTemp3 = aSoilTemp3;
    }

    /**
     * Access method for soilTemp4.
     *
     * @return the current value of soilTemp4
     */
    public double getSoilTemp4() {
        return soilTemp4;
    }

    /**
     * Setter method for soilTemp4.
     *
     * @param aSoilTemp4 the new value for soilTemp4
     */
    public void setSoilTemp4(double aSoilTemp4) {
        soilTemp4 = aSoilTemp4;
    }

    /**
     * Access method for leafTemp1.
     *
     * @return the current value of leafTemp1
     */
    public double getLeafTemp1() {
        return leafTemp1;
    }

    /**
     * Setter method for leafTemp1.
     *
     * @param aLeafTemp1 the new value for leafTemp1
     */
    public void setLeafTemp1(double aLeafTemp1) {
        leafTemp1 = aLeafTemp1;
    }

    /**
     * Access method for leafTemp2.
     *
     * @return the current value of leafTemp2
     */
    public double getLeafTemp2() {
        return leafTemp2;
    }

    /**
     * Setter method for leafTemp2.
     *
     * @param aLeafTemp2 the new value for leafTemp2
     */
    public void setLeafTemp2(double aLeafTemp2) {
        leafTemp2 = aLeafTemp2;
    }

    /**
     * Access method for extraHumid1.
     *
     * @return the current value of extraHumid1
     */
    public double getExtraHumid1() {
        return extraHumid1;
    }

    /**
     * Setter method for extraHumid1.
     *
     * @param aExtraHumid1 the new value for extraHumid1
     */
    public void setExtraHumid1(double aExtraHumid1) {
        extraHumid1 = aExtraHumid1;
    }

    /**
     * Access method for extraHumid2.
     *
     * @return the current value of extraHumid2
     */
    public double getExtraHumid2() {
        return extraHumid2;
    }

    /**
     * Setter method for extraHumid2.
     *
     * @param aExtraHumid2 the new value for extraHumid2
     */
    public void setExtraHumid2(double aExtraHumid2) {
        extraHumid2 = aExtraHumid2;
    }

    /**
     * Access method for soilMoist1.
     *
     * @return the current value of soilMoist1
     */
    public double getSoilMoist1() {
        return soilMoist1;
    }

    /**
     * Setter method for soilMoist1.
     *
     * @param aSoilMoist1 the new value for soilMoist1
     */
    public void setSoilMoist1(double aSoilMoist1) {
        soilMoist1 = aSoilMoist1;
    }

    /**
     * Access method for soilMoist2.
     *
     * @return the current value of soilMoist2
     */
    public double getSoilMoist2() {
        return soilMoist2;
    }

    /**
     * Setter method for soilMoist2.
     *
     * @param aSoilMoist2 the new value for soilMoist2
     */
    public void setSoilMoist2(double aSoilMoist2) {
        soilMoist2 = aSoilMoist2;
    }

    /**
     * Access method for soilMoist3.
     *
     * @return the current value of soilMoist3
     */
    public double getSoilMoist3() {
        return soilMoist3;
    }

    /**
     * Setter method for soilMoist3.
     *
     * @param aSoilMoist3 the new value for soilMoist3
     */
    public void setSoilMoist3(double aSoilMoist3) {
        soilMoist3 = aSoilMoist3;
    }

    /**
     * Access method for soilMoist4.
     *
     * @return the current value of soilMoist4
     */
    public double getSoilMoist4() {
        return soilMoist4;
    }

    /**
     * Setter method for soilMoist4.
     *
     * @param aSoilMoist4 the new value for soilMoist4
     */
    public void setSoilMoist4(double aSoilMoist4) {
        soilMoist4 = aSoilMoist4;
    }

    /**
     * Access method for leafWet1.
     *
     * @return the current value of leafWet1
     */
    public double getLeafWet1() {
        return leafWet1;
    }

    /**
     * Setter method for leafWet1.
     *
     * @param aLeafWet1 the new value for leafWet1
     */
    public void setLeafWet1(double aLeafWet1) {
        leafWet1 = aLeafWet1;
    }

    /**
     * Access method for leafWet2.
     *
     * @return the current value of leafWet2
     */
    public double getLeafWet2() {
        return leafWet2;
    }

    /**
     * Setter method for leafWet2.
     *
     * @param aLeafWet2 the new value for leafWet2
     */
    public void setLeafWet2(double aLeafWet2) {
        leafWet2 = aLeafWet2;
    }

    /**
     * Access method for rxCheckPercent.
     *
     * @return the current value of rxCheckPercent
     */
    public double getRxCheckPercent() {
        return rxCheckPercent;
    }

    /**
     * Setter method for rxCheckPercent.
     *
     * @param aRxCheckPercent the new value for rxCheckPercent
     */
    public void setRxCheckPercent(double aRxCheckPercent) {
        rxCheckPercent = aRxCheckPercent;
    }

    /**
     * Access method for txBatteryStatus.
     *
     * @return the current value of txBatteryStatus
     */
    public double getTxBatteryStatus() {
        return txBatteryStatus;
    }

    /**
     * Setter method for txBatteryStatus.
     *
     * @param aTxBatteryStatus the new value for txBatteryStatus
     */
    public void setTxBatteryStatus(double aTxBatteryStatus) {
        txBatteryStatus = aTxBatteryStatus;
    }

    /**
     * Access method for consBatteryVoltage.
     *
     * @return the current value of consBatteryVoltage
     */
    public double getConsBatteryVoltage() {
        return consBatteryVoltage;
    }

    /**
     * Setter method for consBatteryVoltage.
     *
     * @param aConsBatteryVoltage the new value for consBatteryVoltage
     */
    public void setConsBatteryVoltage(double aConsBatteryVoltage) {
        consBatteryVoltage = aConsBatteryVoltage;
    }

    /**
     * Access method for hail.
     *
     * @return the current value of hail
     */
    public double getHail() {
        return hail;
    }

    /**
     * Setter method for hail.
     *
     * @param aHail the new value for hail
     */
    public void setHail(double aHail) {
        hail = aHail;
    }

    /**
     * Access method for hailRate.
     *
     * @return the current value of hailRate
     */
    public double getHailRate() {
        return hailRate;
    }

    /**
     * Setter method for hailRate.
     *
     * @param aHailRate the new value for hailRate
     */
    public void setHailRate(double aHailRate) {
        hailRate = aHailRate;
    }

    /**
     * Access method for heatingTemp.
     *
     * @return the current value of heatingTemp
     */
    public double getHeatingTemp() {
        return heatingTemp;
    }

    /**
     * Setter method for heatingTemp.
     *
     * @param aHeatingTemp the new value for heatingTemp
     */
    public void setHeatingTemp(double aHeatingTemp) {
        heatingTemp = aHeatingTemp;
    }

    /**
     * Access method for heatingVoltage.
     *
     * @return the current value of heatingVoltage
     */
    public double getHeatingVoltage() {
        return heatingVoltage;
    }

    /**
     * Setter method for heatingVoltage.
     *
     * @param aHeatingVoltage the new value for heatingVoltage
     */
    public void setHeatingVoltage(double aHeatingVoltage) {
        heatingVoltage = aHeatingVoltage;
    }

    /**
     * Access method for supplyVoltage.
     *
     * @return the current value of supplyVoltage
     */
    public double getSupplyVoltage() {
        return supplyVoltage;
    }

    /**
     * Setter method for supplyVoltage.
     *
     * @param aSupplyVoltage the new value for supplyVoltage
     */
    public void setSupplyVoltage(double aSupplyVoltage) {
        supplyVoltage = aSupplyVoltage;
    }

    /**
     * Access method for referenceVoltage.
     *
     * @return the current value of referenceVoltage
     */
    public double getReferenceVoltage() {
        return referenceVoltage;
    }

    /**
     * Setter method for referenceVoltage.
     *
     * @param aReferenceVoltage the new value for referenceVoltage
     */
    public void setReferenceVoltage(double aReferenceVoltage) {
        referenceVoltage = aReferenceVoltage;
    }

    /**
     * Access method for windBatteryStatus.
     *
     * @return the current value of windBatteryStatus
     */
    public double getWindBatteryStatus() {
        return windBatteryStatus;
    }

    /**
     * Setter method for windBatteryStatus.
     *
     * @param aWindBatteryStatus the new value for windBatteryStatus
     */
    public void setWindBatteryStatus(double aWindBatteryStatus) {
        windBatteryStatus = aWindBatteryStatus;
    }

    /**
     * Access method for rainBatteryStatus.
     *
     * @return the current value of rainBatteryStatus
     */
    public double getRainBatteryStatus() {
        return rainBatteryStatus;
    }

    /**
     * Setter method for rainBatteryStatus.
     *
     * @param aRainBatteryStatus the new value for rainBatteryStatus
     */
    public void setRainBatteryStatus(double aRainBatteryStatus) {
        rainBatteryStatus = aRainBatteryStatus;
    }

    /**
     * Access method for outTempBatteryStatus.
     *
     * @return the current value of outTempBatteryStatus
     */
    public double getOutTempBatteryStatus() {
        return outTempBatteryStatus;
    }

    /**
     * Setter method for outTempBatteryStatus.
     *
     * @param aOutTempBatteryStatus the new value for outTempBatteryStatus
     */
    public void setOutTempBatteryStatus(double aOutTempBatteryStatus) {
        outTempBatteryStatus = aOutTempBatteryStatus;
    }

    /**
     * Access method for inTempBatteryStatus.
     *
     * @return the current value of inTempBatteryStatus
     */
    public double getInTempBatteryStatus() {
        return inTempBatteryStatus;
    }

    /**
     * Setter method for inTempBatteryStatus.
     *
     * @param aInTempBatteryStatus the new value for inTempBatteryStatus
     */
    public void setInTempBatteryStatus(double aInTempBatteryStatus) {
        inTempBatteryStatus = aInTempBatteryStatus;
    }

    /**
     * Compares the key for this instance with another Upiitawe.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Upiitawe and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Upiitawe)) {
            return false;
        }
        Upiitawe that = (Upiitawe) other;
        if (this.getDateTime() != that.getDateTime()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Upiitawe.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Upiitawe)) return false;
        return this.equalKeys(other) && ((Upiitawe)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getDateTime();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Upiitawe |");
        sb.append(" dateTime=").append(getDateTime());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("dateTime", Integer.valueOf(getDateTime()));
        return ret;
    }

}
