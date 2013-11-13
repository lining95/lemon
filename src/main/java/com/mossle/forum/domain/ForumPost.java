package com.mossle.forum.domain;

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
 * ForumPost .
 * 
 * @author Lingo
 */
@Entity
@Table(name = "FORUM_POST")
public class ForumPost implements java.io.Serializable {
    private static final long serialVersionUID = 0L;

    /** null. */
    private Long id;

    /** null. */
    private ForumTopic forumTopic;

    /** null. */
    private String content;

    /** null. */
    private Date createTime;

    /** null. */
    private Long userId;

    /** null. */
    private Integer priority;

    public ForumPost() {
    }

    public ForumPost(ForumTopic forumTopic, String content, Date createTime,
            Long userId, Integer priority) {
        this.forumTopic = forumTopic;
        this.content = content;
        this.createTime = createTime;
        this.userId = userId;
        this.priority = priority;
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
    @JoinColumn(name = "TOPIC_ID")
    public ForumTopic getForumTopic() {
        return this.forumTopic;
    }

    /**
     * @param forumTopic
     *            null.
     */
    public void setForumTopic(ForumTopic forumTopic) {
        this.forumTopic = forumTopic;
    }

    /** @return null. */
    @Column(name = "CONTENT", length = 200)
    public String getContent() {
        return this.content;
    }

    /**
     * @param content
     *            null.
     */
    public void setContent(String content) {
        this.content = content;
    }

    /** @return null. */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_TIME", length = 26)
    public Date getCreateTime() {
        return this.createTime;
    }

    /**
     * @param createTime
     *            null.
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /** @return null. */
    @Column(name = "USER_ID")
    public Long getUserId() {
        return this.userId;
    }

    /**
     * @param userId
     *            null.
     */
    public void setUserId(Long userId) {
        this.userId = userId;
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
}
