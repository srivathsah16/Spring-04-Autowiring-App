package in.ashokit.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("mysqlDao")
@Primary
public class MysqlDBReportDao implements ReportDao {
	public MysqlDBReportDao() {
		System.out.println("MysqlDBReportDao:: constructor");
	}

	public void getData() {
		System.out.println("Getting data from MySql DB...");
	}

}
