package in.ashokit.beans;

import org.springframework.stereotype.Repository;

@Repository("oracleDao")
public class OracleDBReportDao implements ReportDao {
	public OracleDBReportDao() {
		System.out.println("OracleDBReportDao:: Constructor");
	}

	public void getData() {
		System.out.println("Getting data from Oracle DB...");
	}

}
