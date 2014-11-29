package businesslogicservice.userblservice.driver;

import java.rmi.RemoteException;

import po.UserPO;
import vo.UserVO;
import businesslogic.userbl.stub.UserManagerStub;
import businesslogicservice.userblservice.UserBLService;

public class UserBLService_Driver {
	public void drive(UserBLService userBLService){
		UserVO user = new UserVO("Nero","x092","sad242");
		try {
			boolean result = userBLService.addUser(user);
			if(result){
				System.out.println("add user pass");
			}else{
				System.out.println("add user failed");
			}
			
			result = userBLService.deleteUser(user);
			if(result){
				System.out.println("delete user pass");
			}else{
				System.out.println("delete user failed");
			}
			
			result = userBLService.updateUser(user);
			if(result){
				System.out.println("update user pass");
			}else{
				System.out.println("update user failed");
			}
			
			UserPO findedUser = userBLService.findUser("x90");
			if(findedUser != null){
				System.out.println("find user pass");
			}else{
				System.out.println("find user failed");
			}
			
			result = userBLService.login("asdsa", "sad232");
			if(findedUser != null){
				System.out.println("login user pass");
			}else{
				System.out.println("login user failed");
			}
			

		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		UserBLService_Driver driver = new UserBLService_Driver();
		UserBLService userBLService = new UserManagerStub();
		driver.drive(userBLService);
	}
}
