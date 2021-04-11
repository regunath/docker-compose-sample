--Below SQL script will be executed automatically for the H2 Database. In case of Mysql, this needs to be executed manually

DROP TABLE IF EXISTS salary;

CREATE TABLE salary (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  Employee_Id Integer NOT NULL,
  type VARCHAR(250) NOT NULL,
  value float NOT NULL
);

INSERT INTO salary (type, Employee_Id, value) VALUES
('BASIC', 101, 20090),
('HRA', 101, 22340),
('BASIC', 102, 10090),
('HRA', 102, 12340);