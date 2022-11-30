package in.ashokit.service;
import in.ashokit.beans.IReport;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
@Service
public class ReportCreater 
{
	@Autowired
	@Qualifier("EmailReport")
	private IReport ireport;
	public void createMyReport()
	{
		ireport.generateReport();
	}

}
