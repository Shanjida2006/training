create database training;
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int(50) NOT NULL,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
);
insert  into `employee`(`id`,`name`) values 
(101,'Murphy'),
(102,'Patterson');

select * from employee;

