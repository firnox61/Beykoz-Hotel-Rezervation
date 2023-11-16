package com.bag.hotelmanagementsystem.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name="campaign")
public class CampaignModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CampaignId;

    @Column(name = "categoryName",nullable=false)
    private String categoryName;

    @Column(name = "Discount",nullable=false)
    private Integer Discount;


    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startDate;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endDate;


}
