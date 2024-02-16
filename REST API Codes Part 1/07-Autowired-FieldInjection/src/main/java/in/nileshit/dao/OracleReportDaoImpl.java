package in.nileshit.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository

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
