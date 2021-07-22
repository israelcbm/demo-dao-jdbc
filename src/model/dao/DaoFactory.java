package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	
	public static SellerDao createSellerSao() {
		return new SellerDaoJDBC();
	}

}
