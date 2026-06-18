package application;


import entities.Department;
import entities.Seller;
import model.SellerDao;
import model.dao.impl.DaoFactory;

import java.util.Date;

public class Main {
    public static void main(String[] args) {


        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(3);

        System.out.println(seller);






    }
}