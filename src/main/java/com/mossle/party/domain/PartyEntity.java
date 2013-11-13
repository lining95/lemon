package com.mossle.party.domain;

// Generated by Hibernate Tools
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * PartyEntity .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "PARTY_ENTITY")
public class PartyEntity implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** null. */
    private Long id;

    /** null. */
    private PartyType partyType;

    /** null. */
    private String name;

    /** null. */
    private String reference;

    /** . */
    private Set<PartyStruct> parentStructs = new HashSet<PartyStruct>(0);

    /** . */
    private Set<PartyStruct> childStructs = new HashSet<PartyStruct>(0);

    public PartyEntity() {
    }

    public PartyEntity(PartyType partyType, String name, String reference,
            Set<PartyStruct> parentStructs, Set<PartyStruct> childStructs) {
        this.partyType = partyType;
        this.name = name;
        this.reference = reference;
        this.parentStructs = parentStructs;
        this.childStructs = childStructs;
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
    @JoinColumn(name = "TYPE_ID")
    public PartyType getPartyType() {
        return this.partyType;
    }

    /**
     * @param partyType
     *            null.
     */
    public void setPartyType(PartyType partyType) {
        this.partyType = partyType;
    }

    /** @return null. */
    @Column(name = "NAME", length = 100)
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
    @Column(name = "REFERENCE", length = 100)
    public String getReference() {
        return this.reference;
    }

    /**
     * @param reference
     *            null.
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "childEntity")
    public Set<PartyStruct> getParentStructs() {
        return this.parentStructs;
    }

    /**
     * @param parentStructs
     *            .
     */
    public void setParentStructs(Set<PartyStruct> parentStructs) {
        this.parentStructs = parentStructs;
    }

    /** @return . */
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "parentEntity")
    public Set<PartyStruct> getChildStructs() {
        return this.childStructs;
    }

    /**
     * @param childStructs
     *            .
     */
    public void setChildStructs(Set<PartyStruct> childStructs) {
        this.childStructs = childStructs;
    }
}
