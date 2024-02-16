package in.nileshit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import in.nileshit.dao.MySQLReportDaoImpl;
import in.nileshit.dao.OracleReportDaoImpl;
import in.nileshit.dao.ReportDao;

@Service
public class ReportService {

	private OracleReportDaoImpl reportDao1;
	private MySQLReportDaoImpl reportDao2;
    
	
	/*Partial DI is not possible here means ,
	Both dependent objects will be injected   */
	
	@Autowired
	public ReportService(OracleReportDaoImpl reportDao1, MySQLReportDaoImpl reportDao2) {
		this.reportDao1 = reportDao1;
		this.reportDao2 = reportDao2;
	}

	public void generateReport() {
		reportDao2.findData();
		System.out.println("generating report....");
	}

	
}
