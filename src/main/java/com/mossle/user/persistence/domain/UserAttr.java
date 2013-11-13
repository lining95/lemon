package com.mossle.user.persistence.domain;

// Generated by Hibernate Tools
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * UserAttr .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "USER_ATTR")
public class UserAttr implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** null. */
    private Long id;

    /** null. */
    private UserBase userBase;

    /** null. */
    private UserSchema userSchema;

    /** null. */
    private Integer booleanValue;

    /** null. */
    private Date dateValue;

    /** null. */
    private Long longValue;

    /** null. */
    private Double doubleValue;

    /** null. */
    private String stringValue;

    public UserAttr() {
    }

    public UserAttr(UserBase userBase, UserSchema userSchema,
            Integer booleanValue, Date dateValue, Long longValue,
            Double doubleValue, String stringValue) {
        this.userBase = userBase;
        this.userSchema = userSchema;
        this.booleanValue = booleanValue;
        this.dateValue = dateValue;
        this.longValue = longValue;
        this.doubleValue = doubleValue;
        this.stringValue = stringValue;
    }

    /** @return null. */
    @Id
    @GeneratedValue
    @Column(name = "ID", unique = true, nullable = false)
    public Long getId() {
        return this.id;
    }

    /**
     * @param id
     *            null.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /** @return null. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_BASE_ID")
    public UserBase getUserBase() {
        return this.userBase;
    }

    /**
     * @param userBase
     *            null.
     */
    public void setUserBase(UserBase userBase) {
        this.userBase = userBase;
    }

    /** @return null. */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_SCHEMA_ID")
    public UserSchema getUserSchema() {
        return this.userSchema;
    }

    /**
     * @param userSchema
     *            null.
     */
    public void setUserSchema(UserSchema userSchema) {
        this.userSchema = userSchema;
    }

    /** @return null. */
    @Column(name = "BOOLEAN_VALUE")
    public Integer getBooleanValue() {
        return this.booleanValue;
    }

    /**
     * @param booleanValue
     *            null.
     */
    public void setBooleanValue(Integer booleanValue) {
        this.booleanValue = booleanValue;
    }

    /** @return null. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_VALUE", length = 26)
    public Date getDateValue() {
        return this.dateValue;
    }

    /**
     * @param dateValue
     *            null.
     */
    public void setDateValue(Date dateValue) {
        this.dateValue = dateValue;
    }

    /** @return null. */
    @Column(name = "LONG_VALUE")
    public Long getLongValue() {
        return this.longValue;
    }

    /**
     * @param longValue
     *            null.
     */
    public void setLongValue(Long longValue) {
        this.longValue = longValue;
    }

    /** @return null. */
    @Column(name = "DOUBLE_VALUE", precision = 64, scale = 0)
    public Double getDoubleValue() {
        return this.doubleValue;
    }

    /**
     * @param doubleValue
     *            null.
     */
    public void setDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
    }

    /** @return null. */
    @Column(name = "STRING_VALUE", length = 200)
    public String getStringValue() {
        return this.stringValue;
    }

    /**
     * @param stringValue
     *            null.
     */
    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }
}
