package businesslogicservice.financialblservice;

import java.rmi.RemoteException;

import vo.RecordVO;

public interface RecordBLService {
	
	public boolean buildNewRecord (RecordVO vo) throws RemoteException;

	public String getRecordName();
	
}
