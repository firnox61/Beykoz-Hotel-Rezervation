package com.bag.hotelmanagementsystem.repository;

import com.bag.hotelmanagementsystem.model.CategoryModel;
import com.bag.hotelmanagementsystem.model.HotelModel;
import com.bag.hotelmanagementsystem.model.RoomModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CategoryRepository extends JpaRepository<CategoryModel, Long> {

    @Query(value = "SELECT * FROM hotel.category c where c.categoryId = ?;", nativeQuery = true)
    public CategoryModel getCategoryByid(Long categorId);
}
