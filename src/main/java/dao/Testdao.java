package dao;

import entities.Client;

public class Testdao {

	public static void main(String[] args) {
		ClientdaoImpl dao = new ClientdaoImpl();
		Client c = dao.save(new Client("test1","test2","test3"));

	}

}
