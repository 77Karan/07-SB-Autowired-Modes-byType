package in.ashokit.beans;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PdfReport implements IReport {

	public void generateReport() 
	{
		System.out.println("PDF Report generating");

	}

}
