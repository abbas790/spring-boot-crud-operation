package af.mcitp.SpringBootProject.main.Controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import af.mcitp.SpringBootProject.main.Model.Employee;
import af.mcitp.SpringBootProject.main.Service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	@GetMapping("/")
    public List<Employee> getAll() {
		return service.get();
	}
	@GetMapping("/{id}")
	public Optional<Employee> findEmployee(@PathVariable long id) {
		
      return service.Find(id);
     }
	 @DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		service.Delete(id);
	}
	@PostMapping("/")
	public Employee save(@RequestBody Employee em) {
		
		return service.saveOrUpdate(em);
	}
	@PutMapping("/{id}")
	public Employee update(@RequestBody Employee em,@PathVariable Long id) {
	  em.setID(id);
	  return service.saveOrUpdate(em);
		
	}

}
