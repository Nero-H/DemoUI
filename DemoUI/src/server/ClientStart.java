/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

/**
 *
 * @author HCW
 */
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import vo.ClientClassification;
import vo.ClientLevel;
import vo.ClientVO;
import businesslogicservice.clientblservice.ClientBLService;

public class ClientStart {
	public static void main(String[] args) {
		try {
			ServerInterface server = (ServerInterface)Naming.lookup("rmi://114.212.42.35:5000/ServerInterface");
			ClientBLService clientBLService = server.getClientService();
			ClientVO newClient = creatClientVO();
			clientBLService.addClient(newClient);
			ClientVO vo = clientBLService.findClientByNum("201400001");
			if (vo != null) {
				System.out.println("Find!");
				System.out.println("Client " + vo.getName() + " has been finded!");
			}else {
				System.out.println("Not find!");
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static ClientVO creatClientVO() {
		// TODO Auto-generated method stub
		ClientVO vo = new ClientVO();
		vo.setAddress("nju");
		vo.setClassification(ClientClassification.IMPORT_TRADER);
		vo.setDefaultSalesman("hcw");
		vo.setEmail("1016990109@qq.com");
		vo.setLevel(ClientLevel.FIVE);
		vo.setName("hch");
		vo.setNum("201400001");
		vo.setPayable(50);
		vo.setPostCode("20006");
		vo.setQuota(10);
		vo.setReceivable(100);
		vo.setTelephone("18668775879");
		return vo;
	}
}

