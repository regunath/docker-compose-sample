
DROP DATABASE IF EXISTS test;

CREATE DATABASE test;

use test;


DROP TABLE IF EXISTS employee;

CREATE TABLE employee (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  department VARCHAR(250) DEFAULT NULL
);

INSERT INTO employee (first_name, last_name, department) VALUES
('Aliko', 'Dangote', 'CSE'),
('Bill', 'Gates', 'MCE'),
('Folrunsho', 'Alakija', 'CSE'),
('James', 'Smith', 'MCH'),
('Michael', 'Smith', 'MCH'),
('Robert', 'Smith', 'MCH'),
('Maria', 'Garcia', 'MCH'),
('David', 'Smith', 'MCH'),
('Maria', 'Rodriguez', 'MCH'),
('Mary', 'Smith', 'MCH'),
('Maria', 'Hernandez', 'MCH'),
('Maria', 'Martinez', 'MCH'),
('James', 'Johnson', 'MCH'),
('James', 'BOND', 'CDS');

INSERT INTO employee (first_name, last_name, department) VALUES
('Ragu', 'samy', 'IT');

INSERT INTO employee (first_name, last_name, department) VALUES
('Sindhu', 'RAGU', 'CHE');
