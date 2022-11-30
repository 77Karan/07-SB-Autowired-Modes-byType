package in.ashokit.beans;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
                                         //@Primary  1st Approach
@Component("EmailReport")         //2nd approach through @Qualifier("EmailReport")
                                          //@Qualifier will override the @Primary if @Primary is specifed in PdfReport
public class EmailReport implements IReport 
{

	public void generateReport()
	{
		System.out.println("Email Report generating");

	}

}
