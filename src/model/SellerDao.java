package model;

import entities.Department;
import entities.Seller;

import java.util.List;

public interface SellerDao {
    void insert(Seller obj);
    void update(Seller obj);
    void deleteById(Seller obj);
    Seller findById(Integer id);
    List<Seller>findyAll();
    List<Seller> findByDepartment(Department department);
}
