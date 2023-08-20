import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class RTO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter p = new PrintWriter(new FileWriter("Codes.txt",true));
		for(int i=0;i<71;i++)
		{
			p.println("KA-"+i);
		}
		p.close();
	}

}
