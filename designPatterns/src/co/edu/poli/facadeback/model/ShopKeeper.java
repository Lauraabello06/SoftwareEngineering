package co.edu.poli.facadeback.model;

import java.util.HashMap;


public class ShopKeeper {

	private HashMap<Integer, MobileShopInterface> arrayMobile;

	public ShopKeeper(HashMap<Integer, MobileShopInterface> a) {
		arrayMobile = a;
	}

	public String getMethods(int serial) {
		return arrayMobile.get(serial).modelNo() + " " +
				arrayMobile.get(serial).price();
	}

}