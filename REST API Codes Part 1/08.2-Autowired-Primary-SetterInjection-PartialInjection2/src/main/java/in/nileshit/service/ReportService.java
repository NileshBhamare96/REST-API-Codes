package in.nileshit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import in.nileshit.dao.MySQLReportDaoImpl;
import in.nileshit.dao.OracleReportDaoImpl;
import in.nileshit.dao.ReportDao;

@Service
public class ReportService {

	private ReportDao reportDao1;
	private ReportDao reportDao2;
    
	@Autowired
	public void setReportDao1(ReportDao reportDao1) {
		System.out.println("setReportDao1(..) method called...");
		this.reportDao1 = reportDao1;
	}
    
	public void setReportDao2(ReportDao reportDao2) {
		System.out.println("setReportDao1(..) method called...");
		this.reportDao2 = reportDao2;
	}

	public void generateReport() {
		reportDao1.findData();
		System.out.println("generating report....");
	}

}
