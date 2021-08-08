package lab.ragu.docker.compose.employeeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * This is a Mock up Employee controller to show case the old way of creating controller for an entity class with the
 * manual annotation using the @RestController and creating the methods manually
 */
@RestController
@RequestMapping("/employee_old_extra")
public class EmployeeController {

  @Autowired
  JdbcTemplate jdbcTemplate;

  /**
   * Rest service returning the employee details in a fixed JSON format using the Map.
   * <i>Note: The DAO access should be separated to the DAO layer rather than in the rest layer.</i>
   * @return
   */
  @GetMapping
  public List<Map<String, Object>> employee(){
    List<Map<String, Object>> test = jdbcTemplate.queryForList("select * from employee");
    Map<String, Object> extra = new HashMap<>();
    extra.put("Extra_Ragu", "Extra_sindhu");
    test.add(extra);
    return test;
  }
}
