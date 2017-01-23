-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jan 23, 2017 at 08:08 AM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `mazarintest`
--

-- --------------------------------------------------------

--
-- Table structure for table `t_audit`
--

CREATE TABLE IF NOT EXISTS `t_audit` (
  `audit_id` int(100) NOT NULL AUTO_INCREMENT COMMENT 'audit identification',
  `message` varchar(255) NOT NULL,
  `audit_date` date NOT NULL,
  PRIMARY KEY (`audit_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `t_audit`
--

INSERT INTO `t_audit` (`audit_id`, `message`, `audit_date`) VALUES
(1, 'harshika , aa@aa.com , asadaadasdad , transport: added', '2017-01-23'),
(2, 'drishan , aa@aa.com , sadasada , administration: added', '2017-01-23'),
(3, 'ranaweera , aa@aa.com , dasadas , promotions: added', '2017-01-23'),
(4, 'dasad asdasa , aadasa@aa.com , adsaadsa , administration: added', '2017-01-23');

-- --------------------------------------------------------

--
-- Table structure for table `t_customer`
--

CREATE TABLE IF NOT EXISTS `t_customer` (
  `customerId` int(10) NOT NULL AUTO_INCREMENT COMMENT 'customer identification number',
  `name` varchar(255) NOT NULL COMMENT 'customer name',
  `email` varchar(255) NOT NULL COMMENT 'customer email',
  `address` varchar(255) NOT NULL COMMENT 'customer address',
  `department` varchar(50) NOT NULL COMMENT 'customers department ',
  PRIMARY KEY (`customerId`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `t_customer`
--

INSERT INTO `t_customer` (`customerId`, `name`, `email`, `address`, `department`) VALUES
(1, 'ewewqeweq', 'aadasa@aa.com', 'saddasad', 'engineering'),
(2, 'harshika', 'aa@aa.com', 'asadaadasdad', 'transport'),
(3, 'drishan', 'aa@aa.com', 'sadasada', 'administration'),
(4, 'ranaweera', 'aa@aa.com', 'dasadas', 'promotions'),
(5, 'dasad asdasa', 'aadasa@aa.com', 'adsaadsa', 'administration');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
