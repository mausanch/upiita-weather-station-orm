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

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
    private Integer dateTime;
    @Column(nullable=false, precision=10)
    private Integer usUnits;
    @Column(nullable=false, precision=10)
    private Integer Integererval;
    @Column(precision=22)
    private Double barometer;
    @Column(precision=22)
    private Double pressure;
    @Column(precision=22)
    private Double altimeter;
    @Column(precision=22)
    private Double inTemp;
    @Column(precision=22)
    private Double outTemp;
    @Column(precision=22)
    private Double inHumidity;
    @Column(precision=22)
    private Double outHumidity;
    @Column(precision=22)
    private Double windSpeed;
    @Column(precision=22)
    private Double windDir;
    @Column(precision=22)
    private Double windGust;
    @Column(precision=22)
    private Double windGustDir;
    @Column(precision=22)
    private Double rainRate;
    @Column(precision=22)
    private Double rain;
    @Column(precision=22)
    private Double dewpoInteger;
    @Column(precision=22)
    private Double windchill;
    @Column(precision=22)
    private Double heatindex;
    @Column(name="ET", precision=22)
    private Double et;
    @Column(precision=22)
    private Double radiation;
    @Column(name="UV", precision=22)
    private Double uv;
    @Column(precision=22)
    private Double extraTemp1;
    @Column(precision=22)
    private Double extraTemp2;
    @Column(precision=22)
    private Double extraTemp3;
    @Column(precision=22)
    private Double soilTemp1;
    @Column(precision=22)
    private Double soilTemp2;
    @Column(precision=22)
    private Double soilTemp3;
    @Column(precision=22)
    private Double soilTemp4;
    @Column(precision=22)
    private Double leafTemp1;
    @Column(precision=22)
    private Double leafTemp2;
    @Column(precision=22)
    private Double extraHumid1;
    @Column(precision=22)
    private Double extraHumid2;
    @Column(precision=22)
    private Double soilMoist1;
    @Column(precision=22)
    private Double soilMoist2;
    @Column(precision=22)
    private Double soilMoist3;
    @Column(precision=22)
    private Double soilMoist4;
    @Column(precision=22)
    private Double leafWet1;
    @Column(precision=22)
    private Double leafWet2;
    @Column(precision=22)
    private Double rxCheckPercent;
    @Column(precision=22)
    private Double txBatteryStatus;
    @Column(precision=22)
    private Double consBatteryVoltage;
    @Column(precision=22)
    private Double hail;
    @Column(precision=22)
    private Double hailRate;
    @Column(precision=22)
    private Double heatingTemp;
    @Column(precision=22)
    private Double heatingVoltage;
    @Column(precision=22)
    private Double supplyVoltage;
    @Column(precision=22)
    private Double referenceVoltage;
    @Column(precision=22)
    private Double windBatteryStatus;
    @Column(precision=22)
    private Double rainBatteryStatus;
    @Column(precision=22)
    private Double outTempBatteryStatus;
    @Column(precision=22)
    private Double inTempBatteryStatus;

    /** Default constructor. */
    public Upiitawe() {
        super();
    }

    /**
     * Access method for dateTime.
     *
     * @return the current value of dateTime
     */
    public Integer getDateTime() {
        return dateTime;
    }

    /**
     * Setter method for dateTime.
     *
     * @param aDateTime the new value for dateTime
     */
    public void setDateTime(Integer aDateTime) {
        dateTime = aDateTime;
    }

    /**
     * Access method for usUnits.
     *
     * @return the current value of usUnits
     */
    public Integer getUsUnits() {
        return usUnits;
    }

    /**
     * Setter method for usUnits.
     *
     * @param aUsUnits the new value for usUnits
     */
    public void setUsUnits(Integer aUsUnits) {
        usUnits = aUsUnits;
    }

    /**
     * Access method for Integererval.
     *
     * @return the current value of Integererval
     */
    public Integer getInterval() {
        return Integererval;
    }

    /**
     * Setter method for Integererval.
     *
     * @param aInterval the new value for Integererval
     */
    public void setInterval(Integer aInterval) {
        Integererval = aInterval;
    }

    /**
     * Access method for barometer.
     *
     * @return the current value of barometer
     */
    public Double getBarometer() {
        return barometer;
    }

    /**
     * Setter method for barometer.
     *
     * @param aBarometer the new value for barometer
     */
    public void setBarometer(Double aBarometer) {
        barometer = aBarometer;
    }

    /**
     * Access method for pressure.
     *
     * @return the current value of pressure
     */
    public Double getPressure() {
        return pressure;
    }

    /**
     * Setter method for pressure.
     *
     * @param aPressure the new value for pressure
     */
    public void setPressure(Double aPressure) {
        pressure = aPressure;
    }

    /**
     * Access method for altimeter.
     *
     * @return the current value of altimeter
     */
    public Double getAltimeter() {
        return altimeter;
    }

    /**
     * Setter method for altimeter.
     *
     * @param aAltimeter the new value for altimeter
     */
    public void setAltimeter(Double aAltimeter) {
        altimeter = aAltimeter;
    }

    /**
     * Access method for inTemp.
     *
     * @return the current value of inTemp
     */
    public Double getInTemp() {
        return inTemp;
    }

    /**
     * Setter method for inTemp.
     *
     * @param aInTemp the new value for inTemp
     */
    public void setInTemp(Double aInTemp) {
        inTemp = aInTemp;
    }

    /**
     * Access method for outTemp.
     *
     * @return the current value of outTemp
     */
    public Double getOutTemp() {
        return outTemp;
    }

    /**
     * Setter method for outTemp.
     *
     * @param aOutTemp the new value for outTemp
     */
    public void setOutTemp(Double aOutTemp) {
        outTemp = aOutTemp;
    }

    /**
     * Access method for inHumidity.
     *
     * @return the current value of inHumidity
     */
    public Double getInHumidity() {
        return inHumidity;
    }

    /**
     * Setter method for inHumidity.
     *
     * @param aInHumidity the new value for inHumidity
     */
    public void setInHumidity(Double aInHumidity) {
        inHumidity = aInHumidity;
    }

    /**
     * Access method for outHumidity.
     *
     * @return the current value of outHumidity
     */
    public Double getOutHumidity() {
        return outHumidity;
    }

    /**
     * Setter method for outHumidity.
     *
     * @param aOutHumidity the new value for outHumidity
     */
    public void setOutHumidity(Double aOutHumidity) {
        outHumidity = aOutHumidity;
    }

    /**
     * Access method for windSpeed.
     *
     * @return the current value of windSpeed
     */
    public Double getWindSpeed() {
        return windSpeed;
    }

    /**
     * Setter method for windSpeed.
     *
     * @param aWindSpeed the new value for windSpeed
     */
    public void setWindSpeed(Double aWindSpeed) {
        windSpeed = aWindSpeed;
    }

    /**
     * Access method for windDir.
     *
     * @return the current value of windDir
     */
    public Double getWindDir() {
        return windDir;
    }

    /**
     * Setter method for windDir.
     *
     * @param aWindDir the new value for windDir
     */
    public void setWindDir(Double aWindDir) {
        windDir = aWindDir;
    }

    /**
     * Access method for windGust.
     *
     * @return the current value of windGust
     */
    public Double getWindGust() {
        return windGust;
    }

    /**
     * Setter method for windGust.
     *
     * @param aWindGust the new value for windGust
     */
    public void setWindGust(Double aWindGust) {
        windGust = aWindGust;
    }

    /**
     * Access method for windGustDir.
     *
     * @return the current value of windGustDir
     */
    public Double getWindGustDir() {
        return windGustDir;
    }

    /**
     * Setter method for windGustDir.
     *
     * @param aWindGustDir the new value for windGustDir
     */
    public void setWindGustDir(Double aWindGustDir) {
        windGustDir = aWindGustDir;
    }

    /**
     * Access method for rainRate.
     *
     * @return the current value of rainRate
     */
    public Double getRainRate() {
        return rainRate;
    }

    /**
     * Setter method for rainRate.
     *
     * @param aRainRate the new value for rainRate
     */
    public void setRainRate(Double aRainRate) {
        rainRate = aRainRate;
    }

    /**
     * Access method for rain.
     *
     * @return the current value of rain
     */
    public Double getRain() {
        return rain;
    }

    /**
     * Setter method for rain.
     *
     * @param aRain the new value for rain
     */
    public void setRain(Double aRain) {
        rain = aRain;
    }

    /**
     * Access method for dewpoInteger.
     *
     * @return the current value of dewpoInteger
     */
    public Double getDewpoInteger() {
        return dewpoInteger;
    }

    /**
     * Setter method for dewpoInteger.
     *
     * @param aDewpoInteger the new value for dewpoInteger
     */
    public void setDewpoInteger(Double aDewpoInteger) {
        dewpoInteger = aDewpoInteger;
    }

    /**
     * Access method for windchill.
     *
     * @return the current value of windchill
     */
    public Double getWindchill() {
        return windchill;
    }

    /**
     * Setter method for windchill.
     *
     * @param aWindchill the new value for windchill
     */
    public void setWindchill(Double aWindchill) {
        windchill = aWindchill;
    }

    /**
     * Access method for heatindex.
     *
     * @return the current value of heatindex
     */
    public Double getHeatindex() {
        return heatindex;
    }

    /**
     * Setter method for heatindex.
     *
     * @param aHeatindex the new value for heatindex
     */
    public void setHeatindex(Double aHeatindex) {
        heatindex = aHeatindex;
    }

    /**
     * Access method for et.
     *
     * @return the current value of et
     */
    public Double getEt() {
        return et;
    }

    /**
     * Setter method for et.
     *
     * @param aEt the new value for et
     */
    public void setEt(Double aEt) {
        et = aEt;
    }

    /**
     * Access method for radiation.
     *
     * @return the current value of radiation
     */
    public Double getRadiation() {
        return radiation;
    }

    /**
     * Setter method for radiation.
     *
     * @param aRadiation the new value for radiation
     */
    public void setRadiation(Double aRadiation) {
        radiation = aRadiation;
    }

    /**
     * Access method for uv.
     *
     * @return the current value of uv
     */
    public Double getUv() {
        return uv;
    }

    /**
     * Setter method for uv.
     *
     * @param aUv the new value for uv
     */
    public void setUv(Double aUv) {
        uv = aUv;
    }

    /**
     * Access method for extraTemp1.
     *
     * @return the current value of extraTemp1
     */
    public Double getExtraTemp1() {
        return extraTemp1;
    }

    /**
     * Setter method for extraTemp1.
     *
     * @param aExtraTemp1 the new value for extraTemp1
     */
    public void setExtraTemp1(Double aExtraTemp1) {
        extraTemp1 = aExtraTemp1;
    }

    /**
     * Access method for extraTemp2.
     *
     * @return the current value of extraTemp2
     */
    public Double getExtraTemp2() {
        return extraTemp2;
    }

    /**
     * Setter method for extraTemp2.
     *
     * @param aExtraTemp2 the new value for extraTemp2
     */
    public void setExtraTemp2(Double aExtraTemp2) {
        extraTemp2 = aExtraTemp2;
    }

    /**
     * Access method for extraTemp3.
     *
     * @return the current value of extraTemp3
     */
    public Double getExtraTemp3() {
        return extraTemp3;
    }

    /**
     * Setter method for extraTemp3.
     *
     * @param aExtraTemp3 the new value for extraTemp3
     */
    public void setExtraTemp3(Double aExtraTemp3) {
        extraTemp3 = aExtraTemp3;
    }

    /**
     * Access method for soilTemp1.
     *
     * @return the current value of soilTemp1
     */
    public Double getSoilTemp1() {
        return soilTemp1;
    }

    /**
     * Setter method for soilTemp1.
     *
     * @param aSoilTemp1 the new value for soilTemp1
     */
    public void setSoilTemp1(Double aSoilTemp1) {
        soilTemp1 = aSoilTemp1;
    }

    /**
     * Access method for soilTemp2.
     *
     * @return the current value of soilTemp2
     */
    public Double getSoilTemp2() {
        return soilTemp2;
    }

    /**
     * Setter method for soilTemp2.
     *
     * @param aSoilTemp2 the new value for soilTemp2
     */
    public void setSoilTemp2(Double aSoilTemp2) {
        soilTemp2 = aSoilTemp2;
    }

    /**
     * Access method for soilTemp3.
     *
     * @return the current value of soilTemp3
     */
    public Double getSoilTemp3() {
        return soilTemp3;
    }

    /**
     * Setter method for soilTemp3.
     *
     * @param aSoilTemp3 the new value for soilTemp3
     */
    public void setSoilTemp3(Double aSoilTemp3) {
        soilTemp3 = aSoilTemp3;
    }

    /**
     * Access method for soilTemp4.
     *
     * @return the current value of soilTemp4
     */
    public Double getSoilTemp4() {
        return soilTemp4;
    }

    /**
     * Setter method for soilTemp4.
     *
     * @param aSoilTemp4 the new value for soilTemp4
     */
    public void setSoilTemp4(Double aSoilTemp4) {
        soilTemp4 = aSoilTemp4;
    }

    /**
     * Access method for leafTemp1.
     *
     * @return the current value of leafTemp1
     */
    public Double getLeafTemp1() {
        return leafTemp1;
    }

    /**
     * Setter method for leafTemp1.
     *
     * @param aLeafTemp1 the new value for leafTemp1
     */
    public void setLeafTemp1(Double aLeafTemp1) {
        leafTemp1 = aLeafTemp1;
    }

    /**
     * Access method for leafTemp2.
     *
     * @return the current value of leafTemp2
     */
    public Double getLeafTemp2() {
        return leafTemp2;
    }

    /**
     * Setter method for leafTemp2.
     *
     * @param aLeafTemp2 the new value for leafTemp2
     */
    public void setLeafTemp2(Double aLeafTemp2) {
        leafTemp2 = aLeafTemp2;
    }

    /**
     * Access method for extraHumid1.
     *
     * @return the current value of extraHumid1
     */
    public Double getExtraHumid1() {
        return extraHumid1;
    }

    /**
     * Setter method for extraHumid1.
     *
     * @param aExtraHumid1 the new value for extraHumid1
     */
    public void setExtraHumid1(Double aExtraHumid1) {
        extraHumid1 = aExtraHumid1;
    }

    /**
     * Access method for extraHumid2.
     *
     * @return the current value of extraHumid2
     */
    public Double getExtraHumid2() {
        return extraHumid2;
    }

    /**
     * Setter method for extraHumid2.
     *
     * @param aExtraHumid2 the new value for extraHumid2
     */
    public void setExtraHumid2(Double aExtraHumid2) {
        extraHumid2 = aExtraHumid2;
    }

    /**
     * Access method for soilMoist1.
     *
     * @return the current value of soilMoist1
     */
    public Double getSoilMoist1() {
        return soilMoist1;
    }

    /**
     * Setter method for soilMoist1.
     *
     * @param aSoilMoist1 the new value for soilMoist1
     */
    public void setSoilMoist1(Double aSoilMoist1) {
        soilMoist1 = aSoilMoist1;
    }

    /**
     * Access method for soilMoist2.
     *
     * @return the current value of soilMoist2
     */
    public Double getSoilMoist2() {
        return soilMoist2;
    }

    /**
     * Setter method for soilMoist2.
     *
     * @param aSoilMoist2 the new value for soilMoist2
     */
    public void setSoilMoist2(Double aSoilMoist2) {
        soilMoist2 = aSoilMoist2;
    }

    /**
     * Access method for soilMoist3.
     *
     * @return the current value of soilMoist3
     */
    public Double getSoilMoist3() {
        return soilMoist3;
    }

    /**
     * Setter method for soilMoist3.
     *
     * @param aSoilMoist3 the new value for soilMoist3
     */
    public void setSoilMoist3(Double aSoilMoist3) {
        soilMoist3 = aSoilMoist3;
    }

    /**
     * Access method for soilMoist4.
     *
     * @return the current value of soilMoist4
     */
    public Double getSoilMoist4() {
        return soilMoist4;
    }

    /**
     * Setter method for soilMoist4.
     *
     * @param aSoilMoist4 the new value for soilMoist4
     */
    public void setSoilMoist4(Double aSoilMoist4) {
        soilMoist4 = aSoilMoist4;
    }

    /**
     * Access method for leafWet1.
     *
     * @return the current value of leafWet1
     */
    public Double getLeafWet1() {
        return leafWet1;
    }

    /**
     * Setter method for leafWet1.
     *
     * @param aLeafWet1 the new value for leafWet1
     */
    public void setLeafWet1(Double aLeafWet1) {
        leafWet1 = aLeafWet1;
    }

    /**
     * Access method for leafWet2.
     *
     * @return the current value of leafWet2
     */
    public Double getLeafWet2() {
        return leafWet2;
    }

    /**
     * Setter method for leafWet2.
     *
     * @param aLeafWet2 the new value for leafWet2
     */
    public void setLeafWet2(Double aLeafWet2) {
        leafWet2 = aLeafWet2;
    }

    /**
     * Access method for rxCheckPercent.
     *
     * @return the current value of rxCheckPercent
     */
    public Double getRxCheckPercent() {
        return rxCheckPercent;
    }

    /**
     * Setter method for rxCheckPercent.
     *
     * @param aRxCheckPercent the new value for rxCheckPercent
     */
    public void setRxCheckPercent(Double aRxCheckPercent) {
        rxCheckPercent = aRxCheckPercent;
    }

    /**
     * Access method for txBatteryStatus.
     *
     * @return the current value of txBatteryStatus
     */
    public Double getTxBatteryStatus() {
        return txBatteryStatus;
    }

    /**
     * Setter method for txBatteryStatus.
     *
     * @param aTxBatteryStatus the new value for txBatteryStatus
     */
    public void setTxBatteryStatus(Double aTxBatteryStatus) {
        txBatteryStatus = aTxBatteryStatus;
    }

    /**
     * Access method for consBatteryVoltage.
     *
     * @return the current value of consBatteryVoltage
     */
    public Double getConsBatteryVoltage() {
        return consBatteryVoltage;
    }

    /**
     * Setter method for consBatteryVoltage.
     *
     * @param aConsBatteryVoltage the new value for consBatteryVoltage
     */
    public void setConsBatteryVoltage(Double aConsBatteryVoltage) {
        consBatteryVoltage = aConsBatteryVoltage;
    }

    /**
     * Access method for hail.
     *
     * @return the current value of hail
     */
    public Double getHail() {
        return hail;
    }

    /**
     * Setter method for hail.
     *
     * @param aHail the new value for hail
     */
    public void setHail(Double aHail) {
        hail = aHail;
    }

    /**
     * Access method for hailRate.
     *
     * @return the current value of hailRate
     */
    public Double getHailRate() {
        return hailRate;
    }

    /**
     * Setter method for hailRate.
     *
     * @param aHailRate the new value for hailRate
     */
    public void setHailRate(Double aHailRate) {
        hailRate = aHailRate;
    }

    /**
     * Access method for heatingTemp.
     *
     * @return the current value of heatingTemp
     */
    public Double getHeatingTemp() {
        return heatingTemp;
    }

    /**
     * Setter method for heatingTemp.
     *
     * @param aHeatingTemp the new value for heatingTemp
     */
    public void setHeatingTemp(Double aHeatingTemp) {
        heatingTemp = aHeatingTemp;
    }

    /**
     * Access method for heatingVoltage.
     *
     * @return the current value of heatingVoltage
     */
    public Double getHeatingVoltage() {
        return heatingVoltage;
    }

    /**
     * Setter method for heatingVoltage.
     *
     * @param aHeatingVoltage the new value for heatingVoltage
     */
    public void setHeatingVoltage(Double aHeatingVoltage) {
        heatingVoltage = aHeatingVoltage;
    }

    /**
     * Access method for supplyVoltage.
     *
     * @return the current value of supplyVoltage
     */
    public Double getSupplyVoltage() {
        return supplyVoltage;
    }

    /**
     * Setter method for supplyVoltage.
     *
     * @param aSupplyVoltage the new value for supplyVoltage
     */
    public void setSupplyVoltage(Double aSupplyVoltage) {
        supplyVoltage = aSupplyVoltage;
    }

    /**
     * Access method for referenceVoltage.
     *
     * @return the current value of referenceVoltage
     */
    public Double getReferenceVoltage() {
        return referenceVoltage;
    }

    /**
     * Setter method for referenceVoltage.
     *
     * @param aReferenceVoltage the new value for referenceVoltage
     */
    public void setReferenceVoltage(Double aReferenceVoltage) {
        referenceVoltage = aReferenceVoltage;
    }

    /**
     * Access method for windBatteryStatus.
     *
     * @return the current value of windBatteryStatus
     */
    public Double getWindBatteryStatus() {
        return windBatteryStatus;
    }

    /**
     * Setter method for windBatteryStatus.
     *
     * @param aWindBatteryStatus the new value for windBatteryStatus
     */
    public void setWindBatteryStatus(Double aWindBatteryStatus) {
        windBatteryStatus = aWindBatteryStatus;
    }

    /**
     * Access method for rainBatteryStatus.
     *
     * @return the current value of rainBatteryStatus
     */
    public Double getRainBatteryStatus() {
        return rainBatteryStatus;
    }

    /**
     * Setter method for rainBatteryStatus.
     *
     * @param aRainBatteryStatus the new value for rainBatteryStatus
     */
    public void setRainBatteryStatus(Double aRainBatteryStatus) {
        rainBatteryStatus = aRainBatteryStatus;
    }

    /**
     * Access method for outTempBatteryStatus.
     *
     * @return the current value of outTempBatteryStatus
     */
    public Double getOutTempBatteryStatus() {
        return outTempBatteryStatus;
    }

    /**
     * Setter method for outTempBatteryStatus.
     *
     * @param aOutTempBatteryStatus the new value for outTempBatteryStatus
     */
    public void setOutTempBatteryStatus(Double aOutTempBatteryStatus) {
        outTempBatteryStatus = aOutTempBatteryStatus;
    }

    /**
     * Access method for inTempBatteryStatus.
     *
     * @return the current value of inTempBatteryStatus
     */
    public Double getInTempBatteryStatus() {
        return inTempBatteryStatus;
    }

    /**
     * Setter method for inTempBatteryStatus.
     *
     * @param aInTempBatteryStatus the new value for inTempBatteryStatus
     */
    public void setInTempBatteryStatus(Double aInTempBatteryStatus) {
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
