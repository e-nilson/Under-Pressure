package com.example.underpressure.DAO;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.underpressure.Entity.Bikes;

import java.util.List;

// Inserts bikes into the database
public interface BikesDAO {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insertBike(Bikes bike);

    @Update
    void updateBike(Bikes bike);

    @Delete
    void deleteBike(Bikes bike);

    @Query("SELECT * FROM bikes_table ORDER BY bikeID ASC")
    List<Bikes> getAllBikes();

    @Query("DELETE FROM bikes_table")
    void deleteAllTerms();

}
