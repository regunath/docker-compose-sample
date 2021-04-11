package lab.ragu.docker.compose.salaryservice.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * The type Employee salary.
 */
@Entity
@Data
public class Salary {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  private Integer EmployeeId;
  private String type;
  private float value;

}
