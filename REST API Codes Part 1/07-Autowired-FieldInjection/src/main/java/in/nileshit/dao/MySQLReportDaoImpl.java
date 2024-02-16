package in.nileshit.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class MySQLReportDaoImpl implements ReportDao {

	public MySQLReportDaoImpl() {

		System.out.println("MySQLRportDaoImpl :: Constructor");

	}

	@Override
	public String findData() {
		System.out.println("Fetching Report data from MYSQL Database");
		return "Report Data";
	}

}
