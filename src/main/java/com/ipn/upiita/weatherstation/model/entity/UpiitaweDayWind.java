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
@Entity(name="upiitawe_day_wind")
public class UpiitaweDayWind implements Serializable {

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
    @Column(precision=22)
    private Double min;
    @Column(precision=10)
    private Integer mIntegerime;
    @Column(precision=22)
    private Double max;
    @Column(precision=10)
    private Integer maxtime;
    @Column(precision=22)
    private Double sum;
    @Column(precision=10)
    private Integer count;
    @Column(precision=22)
    private Double wsum;
    @Column(precision=10)
    private Integer sumtime;
    @Column(name="max_dir", precision=22)
    private Double maxDir;
    @Column(precision=22)
    private Double xsum;
    @Column(precision=22)
    private Double ysum;
    @Column(precision=10)
    private Integer dirsumtime;
    @Column(precision=22)
    private Double squaresum;
    @Column(precision=22)
    private Double wsquaresum;

    /** Default constructor. */
    public UpiitaweDayWind() {
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
     * Access method for min.
     *
     * @return the current value of min
     */
    public Double getMin() {
        return min;
    }

    /**
     * Setter method for min.
     *
     * @param aMin the new value for min
     */
    public void setMin(Double aMin) {
        min = aMin;
    }

    /**
     * Access method for mIntegerime.
     *
     * @return the current value of mIntegerime
     */
    public Integer getMIntegerime() {
        return mIntegerime;
    }

    /**
     * Setter method for mIntegerime.
     *
     * @param aMIntegerime the new value for mIntegerime
     */
    public void setMIntegerime(Integer aMIntegerime) {
        mIntegerime = aMIntegerime;
    }

    /**
     * Access method for max.
     *
     * @return the current value of max
     */
    public Double getMax() {
        return max;
    }

    /**
     * Setter method for max.
     *
     * @param aMax the new value for max
     */
    public void setMax(Double aMax) {
        max = aMax;
    }

    /**
     * Access method for maxtime.
     *
     * @return the current value of maxtime
     */
    public Integer getMaxtime() {
        return maxtime;
    }

    /**
     * Setter method for maxtime.
     *
     * @param aMaxtime the new value for maxtime
     */
    public void setMaxtime(Integer aMaxtime) {
        maxtime = aMaxtime;
    }

    /**
     * Access method for sum.
     *
     * @return the current value of sum
     */
    public Double getSum() {
        return sum;
    }

    /**
     * Setter method for sum.
     *
     * @param aSum the new value for sum
     */
    public void setSum(Double aSum) {
        sum = aSum;
    }

    /**
     * Access method for count.
     *
     * @return the current value of count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * Setter method for count.
     *
     * @param aCount the new value for count
     */
    public void setCount(Integer aCount) {
        count = aCount;
    }

    /**
     * Access method for wsum.
     *
     * @return the current value of wsum
     */
    public Double getWsum() {
        return wsum;
    }

    /**
     * Setter method for wsum.
     *
     * @param aWsum the new value for wsum
     */
    public void setWsum(Double aWsum) {
        wsum = aWsum;
    }

    /**
     * Access method for sumtime.
     *
     * @return the current value of sumtime
     */
    public Integer getSumtime() {
        return sumtime;
    }

    /**
     * Setter method for sumtime.
     *
     * @param aSumtime the new value for sumtime
     */
    public void setSumtime(Integer aSumtime) {
        sumtime = aSumtime;
    }

    /**
     * Access method for maxDir.
     *
     * @return the current value of maxDir
     */
    public Double getMaxDir() {
        return maxDir;
    }

    /**
     * Setter method for maxDir.
     *
     * @param aMaxDir the new value for maxDir
     */
    public void setMaxDir(Double aMaxDir) {
        maxDir = aMaxDir;
    }

    /**
     * Access method for xsum.
     *
     * @return the current value of xsum
     */
    public Double getXsum() {
        return xsum;
    }

    /**
     * Setter method for xsum.
     *
     * @param aXsum the new value for xsum
     */
    public void setXsum(Double aXsum) {
        xsum = aXsum;
    }

    /**
     * Access method for ysum.
     *
     * @return the current value of ysum
     */
    public Double getYsum() {
        return ysum;
    }

    /**
     * Setter method for ysum.
     *
     * @param aYsum the new value for ysum
     */
    public void setYsum(Double aYsum) {
        ysum = aYsum;
    }

    /**
     * Access method for dirsumtime.
     *
     * @return the current value of dirsumtime
     */
    public Integer getDirsumtime() {
        return dirsumtime;
    }

    /**
     * Setter method for dirsumtime.
     *
     * @param aDirsumtime the new value for dirsumtime
     */
    public void setDirsumtime(Integer aDirsumtime) {
        dirsumtime = aDirsumtime;
    }

    /**
     * Access method for squaresum.
     *
     * @return the current value of squaresum
     */
    public Double getSquaresum() {
        return squaresum;
    }

    /**
     * Setter method for squaresum.
     *
     * @param aSquaresum the new value for squaresum
     */
    public void setSquaresum(Double aSquaresum) {
        squaresum = aSquaresum;
    }

    /**
     * Access method for wsquaresum.
     *
     * @return the current value of wsquaresum
     */
    public Double getWsquaresum() {
        return wsquaresum;
    }

    /**
     * Setter method for wsquaresum.
     *
     * @param aWsquaresum the new value for wsquaresum
     */
    public void setWsquaresum(Double aWsquaresum) {
        wsquaresum = aWsquaresum;
    }

    /**
     * Compares the key for this instance with another UpiitaweDayWind.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class UpiitaweDayWind and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof UpiitaweDayWind)) {
            return false;
        }
        UpiitaweDayWind that = (UpiitaweDayWind) other;
        if (this.getDateTime() != that.getDateTime()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another UpiitaweDayWind.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof UpiitaweDayWind)) return false;
        return this.equalKeys(other) && ((UpiitaweDayWind)other).equalKeys(this);
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[UpiitaweDayWind |");
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
