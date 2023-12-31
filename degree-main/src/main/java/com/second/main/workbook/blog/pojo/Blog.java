package com.second.main.workbook.blog.pojo;

import java.util.Date;

public class Blog {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.id
     *
     * @mbggenerated Fri Oct 21 15:15:23 CST 2022
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.author
     *
     * @mbggenerated Fri Oct 21 15:15:23 CST 2022
     */
    private String author;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.title
     *
     * @mbggenerated Fri Oct 21 15:15:23 CST 2022
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.labels
     *
     * @mbggenerated Fri Oct 21 15:15:23 CST 2022
     */
    private String labels;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.description
     *
     * @mbggenerated Fri Oct 21 15:15:23 CST 2022
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.type
     *
     * @mbggenerated Fri Oct 21 15:15:23 CST 2022
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.release_date
     *
     * @mbggenerated Fri Oct 21 15:15:23 CST 2022
     */
    private Date releaseDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog.content
     *
     * @mbggenerated Fri Oct 21 15:15:23 CST 2022
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.id
     *
     * @return the value of blog.id
     *
     * @mbggenerated Fri Oct 21 15:15:23 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.id
     *
     * @param id the value for blog.id
     *
     * @mbggenerated Fri Oct 21 15:15:23 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.author
     *
     * @return the value of blog.author
     *
     * @mbggenerated Fri Oct 21 15:15:23 CST 2022
     */
    public String getAuthor() {
        return author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.author
     *
     * @param author the value for blog.author
     *
     * @mbggenerated Fri Oct 21 15:15:23 CST 2022
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.title
     *
     * @return the value of blog.title
     *
     * @mbggenerated Fri Oct 21 15:15:23 CST 2022
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.title
     *
     * @param title the value for blog.title
     *
     * @mbggenerated Fri Oct 21 15:15:23 CST 2022
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.labels
     *
     * @return the value of blog.labels
     *
     * @mbggenerated Fri Oct 21 15:15:23 CST 2022
     */
    public String getLabels() {
        return labels;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.labels
     *
     * @param labels the value for blog.labels
     *
     * @mbggenerated Fri Oct 21 15:15:23 CST 2022
     */
    public void setLabels(String labels) {
        this.labels = labels == null ? null : labels.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.description
     *
     * @return the value of blog.description
     *
     * @mbggenerated Fri Oct 21 15:15:23 CST 2022
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.description
     *
     * @param description the value for blog.description
     *
     * @mbggenerated Fri Oct 21 15:15:23 CST 2022
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.type
     *
     * @return the value of blog.type
     *
     * @mbggenerated Fri Oct 21 15:15:23 CST 2022
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.type
     *
     * @param type the value for blog.type
     *
     * @mbggenerated Fri Oct 21 15:15:23 CST 2022
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.release_date
     *
     * @return the value of blog.release_date
     *
     * @mbggenerated Fri Oct 21 15:15:23 CST 2022
     */
    public Date getReleaseDate() {
        return releaseDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.release_date
     *
     * @param releaseDate the value for blog.release_date
     *
     * @mbggenerated Fri Oct 21 15:15:23 CST 2022
     */
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog.content
     *
     * @return the value of blog.content
     *
     * @mbggenerated Fri Oct 21 15:15:23 CST 2022
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog.content
     *
     * @param content the value for blog.content
     *
     * @mbggenerated Fri Oct 21 15:15:23 CST 2022
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}