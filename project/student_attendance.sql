-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 31, 2017 at 09:12 AM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `student_attendance`
--

-- --------------------------------------------------------

--
-- Table structure for table `attendance`
--

CREATE TABLE IF NOT EXISTS `attendance` (
  `date` varchar(111) NOT NULL,
  `S_id` varchar(111) NOT NULL,
  `S_name` varchar(111) NOT NULL,
  `c_code` varchar(111) NOT NULL,
  `dept` varchar(111) NOT NULL,
  `status` varchar(111) NOT NULL,
  `T-id` varchar(111) NOT NULL,
  `section` varchar(11) NOT NULL,
  `session` varchar(111) NOT NULL,
  `Year` varchar(111) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `attendance`
--

INSERT INTO `attendance` (`date`, `S_id`, `S_name`, `c_code`, `dept`, `status`, `T-id`, `section`, `session`, `Year`) VALUES
('31/12/2017', '150103020049', 'Sabuj Chandra Paul', 'CSE-300', 'CSE', 'Present', 'TTT', 'A', 'Spring', '2015'),
('31/12/2017', '150103020049', 'Sabuj Chandra Paul', 'CSE-300', 'CSE', 'Absense', 'TTT', 'A', 'Spring', '2015'),
('31/12/2017', '150103020049', 'Sabuj Chandra Paul', 'CSE-300', 'CSE', 'Present', 'TTT', 'A', 'Spring', '2015'),
('31/12/2017', '160103020035', 'Sri Linkon Chandra Das', 'CSE-300', 'CSE', 'Present', 'TTT', 'A', 'Spring', '2015');

-- --------------------------------------------------------

--
-- Table structure for table `author`
--

CREATE TABLE IF NOT EXISTS `author` (
  `A-id` varchar(111) NOT NULL,
  `A_name` varchar(111) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `author`
--

INSERT INTO `author` (`A-id`, `A_name`) VALUES
('n', '1');

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE IF NOT EXISTS `course` (
  `C_code` varchar(111) NOT NULL,
  `C_title` varchar(111) NOT NULL,
  `Dept_name` varchar(111) NOT NULL,
  `Credit` varchar(111) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`C_code`, `C_title`, `Dept_name`, `Credit`) VALUES
('CSE-300', 'Project Work-||', 'CSE', '2'),
('CSE-313', 'DBMS', 'CSE', '3');

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE IF NOT EXISTS `department` (
  `Dept_name` varchar(111) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`Dept_name`) VALUES
('BBA'),
('CSE'),
('ENG'),
('LAW');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE IF NOT EXISTS `student` (
  `S_name` varchar(111) NOT NULL,
  `S_id` varchar(111) NOT NULL,
  `Dept_name` varchar(111) NOT NULL,
  `S_user` varchar(111) NOT NULL,
  `S_pass` varchar(111) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`S_name`, `S_id`, `Dept_name`, `S_user`, `S_pass`) VALUES
('Sondip', '150103020005', 'CSE', 'CSE_S', '150103020005'),
('Nurul Islam Chowdory', '150103020013', 'CSE', 'CSE_S', '150103020013'),
('Sabuj Chandra Paul', '150103020049', 'CSE', 'SCP', 'SCP11'),
('Sri Linkon Chandra Das', '160103020035', 'CSE', 'CSE_S', '160103020035');

-- --------------------------------------------------------

--
-- Table structure for table `student_registration`
--

CREATE TABLE IF NOT EXISTS `student_registration` (
  `S_id` varchar(111) NOT NULL,
  `S_name` varchar(100) NOT NULL,
  `C_code` varchar(15) NOT NULL,
  `C_title` varchar(100) NOT NULL,
  `Dept` varchar(15) NOT NULL,
  `Session` varchar(15) NOT NULL,
  `Year` varchar(111) NOT NULL,
  `Section` varchar(5) NOT NULL,
  `C_teacher` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student_registration`
--

INSERT INTO `student_registration` (`S_id`, `S_name`, `C_code`, `C_title`, `Dept`, `Session`, `Year`, `Section`, `C_teacher`) VALUES
('150103020049', 'Sabuj Chandra Paul', 'CSE-300', 'Project Work-||', 'CSE', 'Spring', '2015', 'A', '12345'),
('160103020035', 'Sri Linkon Chandra Das', 'CSE-300', 'Project Work-||', 'CSE', 'Spring', '2015', 'A', '12345');

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

CREATE TABLE IF NOT EXISTS `teacher` (
  `T_id` varchar(111) NOT NULL,
  `T_name` varchar(111) NOT NULL,
  `dept_name` varchar(111) NOT NULL,
  `T_user` varchar(111) NOT NULL,
  `T_pass` varchar(111) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `teacher`
--

INSERT INTO `teacher` (`T_id`, `T_name`, `dept_name`, `T_user`, `T_pass`) VALUES
('1234', 'linnkon', 'CSE', 'CSE_t', 'CSE45'),
('TTT', '12345', 'CSE', 'SCPT', 'SCPT11');

-- --------------------------------------------------------

--
-- Table structure for table `teacher_registration`
--

CREATE TABLE IF NOT EXISTS `teacher_registration` (
  `T_id` varchar(111) NOT NULL,
  `T_name` varchar(100) NOT NULL,
  `C_code` varchar(15) NOT NULL,
  `C_title` varchar(100) NOT NULL,
  `Dept` varchar(15) NOT NULL,
  `Session` varchar(15) NOT NULL,
  `Year` varchar(111) NOT NULL,
  `Section` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `teacher_registration`
--

INSERT INTO `teacher_registration` (`T_id`, `T_name`, `C_code`, `C_title`, `Dept`, `Session`, `Year`, `Section`) VALUES
('TTT', '12345', 'CSE-300', 'Project Work-||', 'CSE', 'Spring', '2015', 'A');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `author`
--
ALTER TABLE `author`
 ADD PRIMARY KEY (`A-id`);

--
-- Indexes for table `course`
--
ALTER TABLE `course`
 ADD PRIMARY KEY (`C_code`);

--
-- Indexes for table `department`
--
ALTER TABLE `department`
 ADD PRIMARY KEY (`Dept_name`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
 ADD PRIMARY KEY (`S_id`);

--
-- Indexes for table `student_registration`
--
ALTER TABLE `student_registration`
 ADD PRIMARY KEY (`S_id`);

--
-- Indexes for table `teacher`
--
ALTER TABLE `teacher`
 ADD PRIMARY KEY (`T_id`);

--
-- Indexes for table `teacher_registration`
--
ALTER TABLE `teacher_registration`
 ADD PRIMARY KEY (`T_id`), ADD KEY `T_id` (`T_id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
