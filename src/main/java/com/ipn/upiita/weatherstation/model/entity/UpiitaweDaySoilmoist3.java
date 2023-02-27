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
@Entity(name="upiitawe_day_soilmoist3")
public class UpiitaweDaySoilmoist3 implements Serializable {

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
    private int dateTime;
    @Column(precision=22)
    private double min;
    @Column(precision=10)
    private int mintime;
    @Column(precision=22)
    private double max;
    @Column(precision=10)
    private int maxtime;
    @Column(precision=22)
    private double sum;
    @Column(precision=10)
    private int count;
    @Column(precision=22)
    private double wsum;
    @Column(precision=10)
    private int sumtime;

    /** Default constructor. */
    public UpiitaweDaySoilmoist3() {
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
     * Access method for min.
     *
     * @return the current value of min
     */
    public double getMin() {
        return min;
    }

    /**
     * Setter method for min.
     *
     * @param aMin the new value for min
     */
    public void setMin(double aMin) {
        min = aMin;
    }

    /**
     * Access method for mintime.
     *
     * @return the current value of mintime
     */
    public int getMintime() {
        return mintime;
    }

    /**
     * Setter method for mintime.
     *
     * @param aMintime the new value for mintime
     */
    public void setMintime(int aMintime) {
        mintime = aMintime;
    }

    /**
     * Access method for max.
     *
     * @return the current value of max
     */
    public double getMax() {
        return max;
    }

    /**
     * Setter method for max.
     *
     * @param aMax the new value for max
     */
    public void setMax(double aMax) {
        max = aMax;
    }

    /**
     * Access method for maxtime.
     *
     * @return the current value of maxtime
     */
    public int getMaxtime() {
        return maxtime;
    }

    /**
     * Setter method for maxtime.
     *
     * @param aMaxtime the new value for maxtime
     */
    public void setMaxtime(int aMaxtime) {
        maxtime = aMaxtime;
    }

    /**
     * Access method for sum.
     *
     * @return the current value of sum
     */
    public double getSum() {
        return sum;
    }

    /**
     * Setter method for sum.
     *
     * @param aSum the new value for sum
     */
    public void setSum(double aSum) {
        sum = aSum;
    }

    /**
     * Access method for count.
     *
     * @return the current value of count
     */
    public int getCount() {
        return count;
    }

    /**
     * Setter method for count.
     *
     * @param aCount the new value for count
     */
    public void setCount(int aCount) {
        count = aCount;
    }

    /**
     * Access method for wsum.
     *
     * @return the current value of wsum
     */
    public double getWsum() {
        return wsum;
    }

    /**
     * Setter method for wsum.
     *
     * @param aWsum the new value for wsum
     */
    public void setWsum(double aWsum) {
        wsum = aWsum;
    }

    /**
     * Access method for sumtime.
     *
     * @return the current value of sumtime
     */
    public int getSumtime() {
        return sumtime;
    }

    /**
     * Setter method for sumtime.
     *
     * @param aSumtime the new value for sumtime
     */
    public void setSumtime(int aSumtime) {
        sumtime = aSumtime;
    }

    /**
     * Compares the key for this instance with another UpiitaweDaySoilmoist3.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class UpiitaweDaySoilmoist3 and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof UpiitaweDaySoilmoist3)) {
            return false;
        }
        UpiitaweDaySoilmoist3 that = (UpiitaweDaySoilmoist3) other;
        if (this.getDateTime() != that.getDateTime()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another UpiitaweDaySoilmoist3.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof UpiitaweDaySoilmoist3)) return false;
        return this.equalKeys(other) && ((UpiitaweDaySoilmoist3)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[UpiitaweDaySoilmoist3 |");
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
