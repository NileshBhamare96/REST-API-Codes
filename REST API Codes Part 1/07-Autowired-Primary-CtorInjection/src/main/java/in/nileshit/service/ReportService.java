package in.nileshit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import in.nileshit.dao.ReportDao;

@Service
public class ReportService {

	private ReportDao reportDao;

//	public ReportService() {
//
//		System.out.println(" ReportService :: 0-param- Constructor ");
//	}
//	
//	
//	@Autowired
	public ReportService(ReportDao reportDao) {
		System.out.println(" ReportService :: parametrized- Constructor ");
		this.reportDao = reportDao;
	}

//	@Autowired
//	public void setReportdao(ReportDao reportDao) {
//		System.out.println("setReportdao(..) method called...");
//		this.reportDao = reportDao;
//	}

	public void generateReport() {
		reportDao.findData();
		System.out.println("generating report....");
	}

}
