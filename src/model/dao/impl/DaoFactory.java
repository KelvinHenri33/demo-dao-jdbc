package model.dao.impl;

import db.DB;
import model.SellerDao;

public class DaoFactory {

    public  static SellerDao createSellerDao(){
        return new SellerDaoJDBC(DB.getConnection());
    }


}
