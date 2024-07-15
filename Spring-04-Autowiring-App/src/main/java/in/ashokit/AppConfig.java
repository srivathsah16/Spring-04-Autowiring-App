package in.ashokit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import in.ashokit.beans.ReportService;

@Configuration
@ComponentScan
public class AppConfig {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		ReportService service = context.getBean(ReportService.class);
		service.generateReport();
	}
}
