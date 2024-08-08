This is the Student Registration form the student details are stored on Mysql database permanently.
create table name is student below given sql structure execute this 
CREATE TABLE `student` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `lastname` varchar(45) NOT NULL,
  `phoneNumber` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `age` int NOT NULL,
  `dateOfBirth` date NOT NULL,
  `gender` varchar(45) NOT NULL,
  `department` varchar(45) NOT NULL,
  `yearOfPassing` int NOT NULL,
  `skills` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) 
