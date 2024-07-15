package in.ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
//	@Autowired
//	@Qualifier("oracleDao")
	private ReportDao dao;

//	public ReportService() {
//		System.out.println("ReportService::0-param-Constructor");
//	}

	@Autowired
	public ReportService(ReportDao dao) {
		this.dao = dao;
		System.out.println("ReportService::param-Constructor, dao = "+dao);
	}
//	@Autowired
	public void setDao(ReportDao dao) {
		this.dao=dao;
		System.out.println("ReportService::setDao, dao ="+dao);
	}

	public void generateReport() {
		dao.getData();
		System.out.println("Generating the report...");
	}
}
