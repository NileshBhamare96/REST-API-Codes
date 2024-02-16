package in.nileshit.dao;

import org.springframework.stereotype.Repository;

@Repository("oracle")
public class OracleReportDaoImpl implements ReportDao {

	public OracleReportDaoImpl() {

		System.out.println("OracleReportDaoImpl :: Constructor");

	}

	@Override
	public String findData() {
		System.out.println("Fetching Report data from Oracle Database");
		return "Report Data";
	}

}
