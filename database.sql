CREATE DATABASE student_db;
USE student_db;

CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    roll VARCHAR(20) UNIQUE,
    department VARCHAR(50),
    marks INT,
    phone VARCHAR(15)
);

desc students;