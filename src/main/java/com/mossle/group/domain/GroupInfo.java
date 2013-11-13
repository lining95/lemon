package com.mossle.group.domain;

// Generated by Hibernate Tools
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * GroupInfo .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "GROUP_INFO")
public class GroupInfo implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** null. */
    private Long id;

    /** null. */
    private GroupBase groupBase;

    /** null. */
    private String name;

    /** null. */
    private String value;

    /** null. */
    private Long globalId;

    /** null. */
    private Long localId;

    public GroupInfo() {
    }

    public GroupInfo(GroupBase groupBase, String name, String value,
            Long globalId, Long localId) {
        this.groupBase = groupBase;
        this.name = name;
        this.value = value;
        this.globalId = globalId;
        this.localId = localId;
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
    @JoinColumn(name = "GROUP_BASE_ID")
    public GroupBase getGroupBase() {
        return this.groupBase;
    }

    /**
     * @param groupBase
     *            null.
     */
    public void setGroupBase(GroupBase groupBase) {
        this.groupBase = groupBase;
    }

    /** @return null. */
    @Column(name = "NAME", length = 200)
    public String getName() {
        return this.name;
    }

    /**
     * @param name
     *            null.
     */
    public void setName(String name) {
        this.name = name;
    }

    /** @return null. */
    @Column(name = "VALUE", length = 200)
    public String getValue() {
        return this.value;
    }

    /**
     * @param value
     *            null.
     */
    public void setValue(String value) {
        this.value = value;
    }

    /** @return null. */
    @Column(name = "GLOBAL_ID")
    public Long getGlobalId() {
        return this.globalId;
    }

    /**
     * @param globalId
     *            null.
     */
    public void setGlobalId(Long globalId) {
        this.globalId = globalId;
    }

    /** @return null. */
    @Column(name = "LOCAL_ID")
    public Long getLocalId() {
        return this.localId;
    }

    /**
     * @param localId
     *            null.
     */
    public void setLocalId(Long localId) {
        this.localId = localId;
    }
}
