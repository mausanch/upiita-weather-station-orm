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
@Entity(name="upiitawe_day__metadata")
public class UpiitaweDayMetadata implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Primary key. */
    protected static final String PK = "name";

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
    @Column(unique=true, nullable=false, length=20)
    private String name;
    private String value;

    /** Default constructor. */
    public UpiitaweDayMetadata() {
        super();
    }

    /**
     * Access method for name.
     *
     * @return the current value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for name.
     *
     * @param aName the new value for name
     */
    public void setName(String aName) {
        name = aName;
    }

    /**
     * Access method for value.
     *
     * @return the current value of value
     */
    public String getValue() {
        return value;
    }

    /**
     * Setter method for value.
     *
     * @param aValue the new value for value
     */
    public void setValue(String aValue) {
        value = aValue;
    }

    /**
     * Compares the key for this instance with another UpiitaweDayMetadata.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class UpiitaweDayMetadata and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof UpiitaweDayMetadata)) {
            return false;
        }
        UpiitaweDayMetadata that = (UpiitaweDayMetadata) other;
        Object myName = this.getName();
        Object yourName = that.getName();
        if (myName==null ? yourName!=null : !myName.equals(yourName)) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another UpiitaweDayMetadata.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof UpiitaweDayMetadata)) return false;
        return this.equalKeys(other) && ((UpiitaweDayMetadata)other).equalKeys(this);
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
        if (getName() == null) {
            i = 0;
        } else {
            i = getName().hashCode();
        }
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
        StringBuffer sb = new StringBuffer("[UpiitaweDayMetadata |");
        sb.append(" name=").append(getName());
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
        ret.put("name", getName());
        return ret;
    }

}
