package com.sqeteam.sqerecruitment.pojo;
// Generated Apr 7, 2017 2:45:05 AM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Experiences generated by hbm2java
 */
@Entity
@Table(name="experiences"
    ,catalog="sqe_recruitment"
)
public class Experiences  implements java.io.Serializable {


     private Integer idExperiences;
     private EmploymentLevels employmentLevels;
     private JobTitles jobTitles;
     private Persons persons;
     private Date dateStarted;
     private Date dateFinished;
     private String otherJobTitle;
     private String keyDuties;
     private String employerName;
     private Boolean verified;
     private String howVerified;

    public Experiences() {
    }

	
    public Experiences(JobTitles jobTitles, Persons persons, Date dateStarted) {
        this.jobTitles = jobTitles;
        this.persons = persons;
        this.dateStarted = dateStarted;
    }
    public Experiences(EmploymentLevels employmentLevels, JobTitles jobTitles, Persons persons, Date dateStarted, Date dateFinished, String otherJobTitle, String keyDuties, String employerName, Boolean verified, String howVerified) {
       this.employmentLevels = employmentLevels;
       this.jobTitles = jobTitles;
       this.persons = persons;
       this.dateStarted = dateStarted;
       this.dateFinished = dateFinished;
       this.otherJobTitle = otherJobTitle;
       this.keyDuties = keyDuties;
       this.employerName = employerName;
       this.verified = verified;
       this.howVerified = howVerified;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idExperiences", unique=true, nullable=false)
    public Integer getIdExperiences() {
        return this.idExperiences;
    }
    
    public void setIdExperiences(Integer idExperiences) {
        this.idExperiences = idExperiences;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="EmploymentLevels_idLevelsOfEmployment")
    public EmploymentLevels getEmploymentLevels() {
        return this.employmentLevels;
    }
    
    public void setEmploymentLevels(EmploymentLevels employmentLevels) {
        this.employmentLevels = employmentLevels;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="JobTitles_idJobTitles", nullable=false)
    public JobTitles getJobTitles() {
        return this.jobTitles;
    }
    
    public void setJobTitles(JobTitles jobTitles) {
        this.jobTitles = jobTitles;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Persons_idUser", nullable=false)
    public Persons getPersons() {
        return this.persons;
    }
    
    public void setPersons(Persons persons) {
        this.persons = persons;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="dateStarted", nullable=false, length=10)
    public Date getDateStarted() {
        return this.dateStarted;
    }
    
    public void setDateStarted(Date dateStarted) {
        this.dateStarted = dateStarted;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="dateFinished", length=10)
    public Date getDateFinished() {
        return this.dateFinished;
    }
    
    public void setDateFinished(Date dateFinished) {
        this.dateFinished = dateFinished;
    }

    
    @Column(name="otherJobTitle", length=45)
    public String getOtherJobTitle() {
        return this.otherJobTitle;
    }
    
    public void setOtherJobTitle(String otherJobTitle) {
        this.otherJobTitle = otherJobTitle;
    }

    
    @Column(name="keyDuties")
    public String getKeyDuties() {
        return this.keyDuties;
    }
    
    public void setKeyDuties(String keyDuties) {
        this.keyDuties = keyDuties;
    }

    
    @Column(name="employerName", length=45)
    public String getEmployerName() {
        return this.employerName;
    }
    
    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    
    @Column(name="verified")
    public Boolean getVerified() {
        return this.verified;
    }
    
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    
    @Column(name="howVerified", length=45)
    public String getHowVerified() {
        return this.howVerified;
    }
    
    public void setHowVerified(String howVerified) {
        this.howVerified = howVerified;
    }




}


