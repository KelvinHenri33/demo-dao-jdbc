package model.dao.impl;

import model.SellerDao;

public class DaoFactory {

    public  static SellerDao createSellerDao(){
        return new SellerDaoJDBC();
    }


}
