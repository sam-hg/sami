bpackage com.traficaccident.tool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.traficaccident.tool.Domain.Accident;
import com.traficaccident.tool.Domain.Motorolist;
import com.traficaccident.tool.Domain.Vehicle;
import com.traficaccident.tool.Repository.AccidentRepository;
import com.traficaccident.tool.Repository.MotorolistRepository;
import com.traficaccident.tool.Repository.VehicleRepository;

@SpringBootApplication
public class TraficaccidentApplication implements CommandLineRunner {
  @Autowired
  AccidentRepository acidentrepo;
  
  @Autowired
  VehicleRepository veclrepo;
  
  @Autowired
   MotorolistRepository motrrepo;
  
	public static void main(String[] args) {
		SpringApplication.run(TraficaccidentApplication.class, args);
		}

	@Override
	public void run(String... args) throws Exception {
		Accident aa = new Accident();
		aa.setAccidentid(10);
		aa.setAddress("adis");
	
		this.acidentrepo.save(aa);
		
		Vehicle vv = new Vehicle();
		vv.setMake("BMW");
		vv.setModel("BMW201");
		vv.setColor("black");
		vv.setVehicleIdentification("0jkl");
		vv.setAccident(aa);
		
		this.veclrepo.save(vv);
		
		Motorolist mm = new Motorolist();
		  mm.setFirstname("nati");
		  mm.setLastname("yosef");
		  mm.setAge(26);
		  mm.setDriverlicense("guy");
		  mm.setVehicle(vv);
		  
		  this.motrrepo.save(mm);
		  
		
	}

}
