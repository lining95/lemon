package com.mossle.bpm.persistence.domain;

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
 * BpmProcess .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "BPM_PROCESS")
public class BpmProcess implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** null. */
    private Long id;

    /** null. */
    private BpmCategory bpmCategory;

    /** null. */
    private String name;

    /** null. */
    private String processDefinitionId;

    /** null. */
    private String processDefinitionKey;

    /** null. */
    private Integer priority;

    /** null. */
    private String descn;

    /** null. */
    private String startStrategy;

    public BpmProcess() {
    }

    public BpmProcess(BpmCategory bpmCategory, String name,
            String processDefinitionId, String processDefinitionKey,
            Integer priority, String descn, String startStrategy) {
        this.bpmCategory = bpmCategory;
        this.name = name;
        this.processDefinitionId = processDefinitionId;
        this.processDefinitionKey = processDefinitionKey;
        this.priority = priority;
        this.descn = descn;
        this.startStrategy = startStrategy;
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
    @JoinColumn(name = "CATEGORY_ID")
    public BpmCategory getBpmCategory() {
        return this.bpmCategory;
    }

    /**
     * @param bpmCategory
     *            null.
     */
    public void setBpmCategory(BpmCategory bpmCategory) {
        this.bpmCategory = bpmCategory;
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
    @Column(name = "PROCESS_DEFINITION_ID", length = 200)
    public String getProcessDefinitionId() {
        return this.processDefinitionId;
    }

    /**
     * @param processDefinitionId
     *            null.
     */
    public void setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
    }

    /** @return null. */
    @Column(name = "PROCESS_DEFINITION_KEY", length = 200)
    public String getProcessDefinitionKey() {
        return this.processDefinitionKey;
    }

    /**
     * @param processDefinitionKey
     *            null.
     */
    public void setProcessDefinitionKey(String processDefinitionKey) {
        this.processDefinitionKey = processDefinitionKey;
    }

    /** @return null. */
    @Column(name = "PRIORITY")
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @param priority
     *            null.
     */
    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /** @return null. */
    @Column(name = "DESCN", length = 200)
    public String getDescn() {
        return this.descn;
    }

    /**
     * @param descn
     *            null.
     */
    public void setDescn(String descn) {
        this.descn = descn;
    }

    /** @return null. */
    @Column(name = "START_STRATEGY", length = 50)
    public String getStartStrategy() {
        return this.startStrategy;
    }

    /**
     * @param startStrategy
     *            null.
     */
    public void setStartStrategy(String startStrategy) {
        this.startStrategy = startStrategy;
    }
}
