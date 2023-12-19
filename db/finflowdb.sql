/*
SQLyog Ultimate v13.1.1 (64 bit)
MySQL - 10.4.28-MariaDB : Database - finflowdb
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`finflowdb` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci */;

USE `finflowdb`;

/*Table structure for table `accounts` */

DROP TABLE IF EXISTS `accounts`;

CREATE TABLE `accounts` (
  `account_no` bigint(20) NOT NULL AUTO_INCREMENT,
  `account_name` varchar(255) DEFAULT NULL,
  `nid` bigint(17) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `initial_deposit` decimal(20,2) DEFAULT NULL,
  `maturity_date` date DEFAULT NULL,
  `nominee_name` varchar(255) DEFAULT NULL,
  `nominee_nid` bigint(20) DEFAULT NULL,
  `account_type` varbinary(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`account_no`)
) ENGINE=InnoDB AUTO_INCREMENT=100013 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

/*Data for the table `accounts` */

insert  into `accounts`(`account_no`,`account_name`,`nid`,`dob`,`address`,`initial_deposit`,`maturity_date`,`nominee_name`,`nominee_nid`,`account_type`,`gender`) values 
(100004,'S.M. Akash',8243903454,'2023-12-14','Mirpur-13',500.00,'2033-12-19','Tom',8234823423,'Savings',NULL),
(100005,'Mosharraf',989897656,'1990-12-13','Dhaka',1000.00,'2033-12-19','Moinul',989765678,'Savings',NULL),
(100006,'d',4,'2023-12-15','4',4.00,'2023-12-07','4',4,'4',NULL),
(100007,'4',44,'2023-12-12','4',4.00,'2023-12-13','4',4,'4',NULL),
(100008,'4',3,'2023-12-09','3',3.00,'2023-12-16','3',3,'3',NULL),
(100009,'2',2,'2023-12-04','2',2.00,'2023-12-15','2',2,'2',NULL),
(100010,'4',4,'2023-12-16','4',4.00,'2023-12-15','4',3,'5',NULL),
(100011,'7',7,'2023-12-07','7',7.00,'2023-12-23','7',7,'7',NULL),
(100012,'4',4,'2023-12-14','4',4.00,'2023-12-03','4',6,'Savings','Male');

/*Table structure for table `transactions` */

DROP TABLE IF EXISTS `transactions`;

CREATE TABLE `transactions` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `account_no` varchar(255) DEFAULT NULL,
  `trans_date` date DEFAULT NULL,
  `deposit_amount` decimal(10,2) DEFAULT NULL,
  `withdraw_amount` decimal(10,2) DEFAULT NULL,
  `from_account_no` varchar(255) DEFAULT NULL,
  `to_account_no` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

/*Data for the table `transactions` */

insert  into `transactions`(`id`,`account_no`,`trans_date`,`deposit_amount`,`withdraw_amount`,`from_account_no`,`to_account_no`) values 
(1,'100004','1970-01-01',500.00,0.00,NULL,NULL),
(2,'100004','2023-12-19',344.00,0.00,NULL,NULL),
(3,'100004','2023-12-19',0.00,200.00,NULL,NULL),
(4,'100004','2023-12-19',0.00,100.00,NULL,'100005'),
(5,'100005','2023-12-19',100.00,0.00,'100004',NULL),
(6,'100004','2023-12-19',0.00,5.00,NULL,'100005'),
(7,'100005','2023-12-19',5.00,0.00,'100004',NULL),
(8,'100004','2023-12-19',0.00,20.00,NULL,'100005'),
(9,'100005','2023-12-19',20.00,0.00,'100004',NULL),
(10,'100004','2023-12-19',199.00,0.00,NULL,NULL),
(11,'100004','2023-12-19',288.00,0.00,NULL,NULL),
(12,'100004','2023-12-19',244.00,0.00,NULL,NULL),
(13,'100004','2023-12-19',123.00,0.00,NULL,NULL),
(14,'100004','2023-12-19',222.00,0.00,NULL,NULL),
(15,'100004','2023-12-19',235.00,0.00,NULL,NULL),
(16,'100004','2023-12-19',235.00,0.00,NULL,NULL),
(17,'100004','2023-12-19',333.00,0.00,NULL,NULL);

/*Table structure for table `user_master` */

DROP TABLE IF EXISTS `user_master`;

CREATE TABLE `user_master` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `USER_ID` varchar(255) NOT NULL,
  `USER_NAME` varchar(255) NOT NULL,
  `USER_TYPE` varchar(10) DEFAULT NULL,
  `STATUS` varchar(19) NOT NULL,
  `PASSWORD` varchar(255) DEFAULT NULL,
  `REMARKS` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`USER_ID`),
  KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

/*Data for the table `user_master` */

insert  into `user_master`(`id`,`USER_ID`,`USER_NAME`,`USER_TYPE`,`STATUS`,`PASSWORD`,`REMARKS`) values 
(1,'admin','admin','admin','A','akash',NULL),
(2,'test','Test User',NULL,'A','test','For Test Purpose'),
(4,'test2','Test Again',NULL,'A','test2','For Test');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
