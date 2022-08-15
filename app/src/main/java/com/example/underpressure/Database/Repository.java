package com.example.underpressure.Database;

import android.app.Application;

import com.example.underpressure.DAO.BikesDAO;
import com.example.underpressure.DAO.UsersDAO;
import com.example.underpressure.Entity.Bikes;
import com.example.underpressure.Entity.Users;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Repository {
    private BikesDAO mBikesDAO;
    private UsersDAO mUsersDAO;
    private List<Bikes> mAllBikes;
    private List<Users> mAllUsers;

    private static int NUMBER_OF_THREADS=2;
    static final ExecutorService databaseExecutor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    public Repository(Application application) {
        BikePressureBuilder db = BikePressureBuilder.getDatabase(application);
        mBikesDAO = db.bikesDAO();
        mUsersDAO = db.usersDAO();
    }

    // Gets all bikes from the database
    public List<Bikes> getAllBikes(){
        databaseExecutor.execute(()->{
            mAllBikes = mBikesDAO.getAllBikes();
        });
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return mAllBikes;
    }

    // Inserts a bike to the database
    public void insertBike(Bikes bike) {
        databaseExecutor.execute(()->{
            mBikesDAO.insertBike(bike);
        });
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Updates a bike to the database
    public void updateBike(Bikes bike){
        databaseExecutor.execute(()->{
            mBikesDAO.updateBike(bike);
        });
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Deletes a bikes from the database
    public void deleteBike(Bikes bike){
        databaseExecutor.execute(()->{
            mBikesDAO.deleteBike(bike);
        });
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public List<Users> getAllUsers() {
        databaseExecutor.execute(() -> {
            mAllUsers = mUsersDAO.getAllUsers();
        });
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return mAllUsers;
    }

    public void insertUser(Users user) {
        databaseExecutor.execute(() -> {
            mUsersDAO.insertUser(user);
        });
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void updateUser(Users user) {
        databaseExecutor.execute(() -> {
            mUsersDAO.updateUser(user);
        });
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void deleteUser(Users user) {
        databaseExecutor.execute(() -> {
            mUsersDAO.deleteUser(user);
        });
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
