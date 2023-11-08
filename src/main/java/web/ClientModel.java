package web;

import java.util.ArrayList;
import java.util.List;

import entities.Client;

public class ClientModel {
	private String motCle;
	private Client client = new Client();
	private List<Client> clients=new ArrayList<Client>();
	private String errors;
	private String mode="ajout";
	
    public String getMotCle() {
		return motCle;
	}
	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public List<Client> getClients() {
		return clients;
	}
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
	public String getErrors() {
		return errors;
	}
	public void setErrors(String errors) {
		this.errors = errors;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	
	

}
