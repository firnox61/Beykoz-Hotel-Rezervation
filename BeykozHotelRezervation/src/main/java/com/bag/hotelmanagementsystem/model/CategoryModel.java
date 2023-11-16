package com.bag.hotelmanagementsystem.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name="category")
public class CategoryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long CategoryId;

    @Column(name = "categoryName",nullable=false)
    private String categoryName;

  /*  @OneToMany(mappedBy = "category")
    private Set<RoomModel> room;
*/

}
