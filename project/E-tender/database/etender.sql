-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Sep 10, 2019 at 10:27 AM
-- Server version: 10.1.30-MariaDB
-- PHP Version: 5.6.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `etender`
--

-- --------------------------------------------------------

--
-- Table structure for table `comments`
--

CREATE TABLE `comments` (
  `comment_id` int(11) NOT NULL,
  `comment` text NOT NULL,
  `user_id` int(11) NOT NULL,
  `tender_id` int(11) NOT NULL,
  `comment_parent_id` int(11) NOT NULL,
  `comment_date` datetime NOT NULL,
  `comment_dom` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `comment_status` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `comments`
--

INSERT INTO `comments` (`comment_id`, `comment`, `user_id`, `tender_id`, `comment_parent_id`, `comment_date`, `comment_dom`, `comment_status`) VALUES
(5, 'Hi, I am apply for this tender. i am new but not bed. Please select me.', 7, 5, 0, '2019-08-23 18:52:42', '2019-08-23 16:52:42', 1),
(6, 'hi', 7, 5, 5, '2019-08-24 10:56:29', '2019-08-24 08:56:29', 1),
(7, 'Hi', 4, 5, 6, '2019-09-10 10:14:09', '2019-09-10 08:14:09', 1);

-- --------------------------------------------------------

--
-- Table structure for table `constructors`
--

CREATE TABLE `constructors` (
  `constructor_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `company_name` varchar(255) DEFAULT NULL,
  `owner_name` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `gst` varchar(255) DEFAULT NULL,
  `tender_licence` varchar(255) DEFAULT NULL,
  `tin` varchar(255) DEFAULT NULL,
  `vat` varchar(255) DEFAULT NULL,
  `signeture` varchar(255) NOT NULL,
  `project_done` int(11) NOT NULL DEFAULT '0',
  `project_running` int(11) NOT NULL DEFAULT '0',
  `project_canceled` int(11) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `constructors`
--

INSERT INTO `constructors` (`constructor_id`, `user_id`, `company_name`, `owner_name`, `country`, `gst`, `tender_licence`, `tin`, `vat`, `signeture`, `project_done`, `project_running`, `project_canceled`) VALUES
(1, 4, '', '', '', '', '', '', '', '', 0, 1, 0),
(5, 7, '', '', '', '', '', '', '', '', 0, 2, 0);

-- --------------------------------------------------------

--
-- Table structure for table `divisions`
--

CREATE TABLE `divisions` (
  `division_id` int(11) NOT NULL,
  `division_name` varchar(255) NOT NULL,
  `ministry_id` int(11) NOT NULL,
  `division_status` tinyint(1) NOT NULL DEFAULT '1',
  `division_doc` datetime NOT NULL,
  `division_dom` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `division_creator` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `divisions`
--

INSERT INTO `divisions` (`division_id`, `division_name`, `ministry_id`, `division_status`, `division_doc`, `division_dom`, `division_creator`) VALUES
(1, 'Bangladesh Power Development Board (PDB)', 1, 1, '2019-08-19 22:16:00', '2019-08-20 16:59:11', 1),
(3, 'Education Engineering Department (EED)', 2, 1, '2019-08-19 22:16:00', '2019-08-19 18:03:05', 1),
(4, 'Bangladesh Rice Research Institute (BRRI)', 2, 1, '2019-08-19 22:10:00', '2019-09-10 06:58:11', 1),
(8, 'Ashugonj Power Station Company Limited', 4, 1, '2019-08-20 21:14:49', '2019-08-21 13:18:51', 1),
(9, 'Bangladesh Power Development Board', 4, 1, '2019-08-21 21:35:20', '2019-08-21 19:35:20', 1);

-- --------------------------------------------------------

--
-- Table structure for table `ministries`
--

CREATE TABLE `ministries` (
  `ministry_id` int(11) NOT NULL,
  `ministry_name` varchar(255) NOT NULL,
  `ministry_status` tinyint(1) NOT NULL DEFAULT '1',
  `ministry_doc` datetime NOT NULL,
  `ministry_dom` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `ministry_creator` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `ministries`
--

INSERT INTO `ministries` (`ministry_id`, `ministry_name`, `ministry_status`, `ministry_doc`, `ministry_dom`, `ministry_creator`) VALUES
(1, 'Agriculture', 1, '2019-08-19 21:33:00', '2019-08-19 15:31:26', 1),
(2, 'Education', 1, '2019-08-19 21:33:00', '2019-08-19 15:31:43', 1),
(3, 'Defence', 1, '2019-08-20 12:24:32', '2019-08-20 10:24:32', 1),
(4, 'Power', 1, '2019-08-20 21:14:04', '2019-08-20 19:14:04', 1),
(5, 'Commerce', 1, '2019-08-21 09:11:40', '2019-08-21 07:11:40', 1),
(6, 'University', 1, '2019-08-21 09:12:20', '2019-08-21 07:12:20', 1);

-- --------------------------------------------------------

--
-- Table structure for table `reports`
--

CREATE TABLE `reports` (
  `report_id` int(11) NOT NULL,
  `tender_id` int(11) NOT NULL,
  `report_content` text NOT NULL,
  `report_creator` int(11) NOT NULL,
  `report_status` tinyint(1) NOT NULL DEFAULT '1',
  `report_doc` datetime NOT NULL,
  `report_dom` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `reports`
--

INSERT INTO `reports` (`report_id`, `tender_id`, `report_content`, `report_creator`, `report_status`, `report_doc`, `report_dom`) VALUES
(1, 5, '<ol><li>dgthyrt</li><li>t</li><li>h</li><li>tgfh</li><li>gf</li><li>h</li></ol>', 8, 1, '2019-09-08 12:50:32', '2019-09-08 10:50:32');

-- --------------------------------------------------------

--
-- Table structure for table `subdivisions`
--

CREATE TABLE `subdivisions` (
  `subdivision_id` int(11) NOT NULL,
  `subdivision_name` varchar(255) NOT NULL,
  `division_id` int(11) NOT NULL,
  `subdivision_status` tinyint(1) NOT NULL DEFAULT '1',
  `subdivision_doc` datetime NOT NULL,
  `subdivision_dom` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `subdivision_creator` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `subdivisions`
--

INSERT INTO `subdivisions` (`subdivision_id`, `subdivision_name`, `division_id`, `subdivision_status`, `subdivision_doc`, `subdivision_dom`, `subdivision_creator`) VALUES
(2, 'Demo Sub', 8, 1, '2019-09-07 17:25:45', '2019-09-07 15:25:45', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tenders`
--

CREATE TABLE `tenders` (
  `tender_id` int(11) NOT NULL,
  `tender_name` varchar(255) NOT NULL,
  `tender_price` decimal(10,0) NOT NULL,
  `tender_work` text NOT NULL,
  `tender_no` text NOT NULL,
  `publish_date` date NOT NULL,
  `selling_end_date` date NOT NULL,
  `tender_opening_date` datetime NOT NULL,
  `tender_closing_date` datetime NOT NULL,
  `ministry_id` int(11) NOT NULL,
  `division_id` int(11) NOT NULL,
  `subdivision_id` int(11) NOT NULL,
  `constructor_id` int(11) NOT NULL DEFAULT '0',
  `tender_image` varchar(255) NOT NULL,
  `tender_des` text NOT NULL,
  `pe_office` varchar(255) NOT NULL,
  `tender_source` varchar(255) NOT NULL,
  `tender_location` varchar(255) NOT NULL,
  `tender_type` varchar(255) NOT NULL,
  `tender_nature` varchar(255) NOT NULL,
  `tender_entity` varchar(255) NOT NULL,
  `tender_method` varchar(255) NOT NULL,
  `tender_qualification` varchar(255) NOT NULL,
  `tender_status` tinyint(1) NOT NULL DEFAULT '1',
  `tender_doc` datetime NOT NULL,
  `tender_dom` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `tender_creator` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tenders`
--

INSERT INTO `tenders` (`tender_id`, `tender_name`, `tender_price`, `tender_work`, `tender_no`, `publish_date`, `selling_end_date`, `tender_opening_date`, `tender_closing_date`, `ministry_id`, `division_id`, `subdivision_id`, `constructor_id`, `tender_image`, `tender_des`, `pe_office`, `tender_source`, `tender_location`, `tender_type`, `tender_nature`, `tender_entity`, `tender_method`, `tender_qualification`, `tender_status`, `tender_doc`, `tender_dom`, `tender_creator`) VALUES
(1, ' Three Phase-Solid State CTS', '4000', 'Procurement of 50000 Nos. Single Phase and 5000 Nos. Three Phase-Solid State CTS Smart Pre-Payment Meter with Modem', '457112', '0000-00-00', '0000-00-00', '0000-00-00 00:00:00', '2019-09-30 00:00:00', 1, 1, 0, 0, '', 'Demo Text', 'Sayed Akram Ullah, Director, Directorate of Purchase, BPDB', '', '', '', '', '', '', '', 0, '2019-08-19 20:16:19', '2019-08-19 18:16:19', 1),
(2, ' Three Phase-Solid State CTS', '5000', 'Procurement of 50000 Nos. Single Phase and 5000 Nos. Three Phase-Solid State CTS Smart Pre-Payment Meter with Modem', '236831', '2019-08-23', '0000-00-00', '0000-00-00 00:00:00', '2019-09-30 00:00:00', 1, 1, 0, 7, '', 'tttt', 'Sayed Akram Ullah, Director, Directorate of Purchase, BPDB', '', '', '', '', '', '', '', 1, '2019-08-19 20:17:43', '2019-08-19 18:17:43', 1),
(3, 'Supply of Disc Insulator with Fittings', '5000', 'Supply of Disc Insulator with Fittings for 11 KV Line', '122369', '2019-09-10', '0000-00-00', '0000-00-00 00:00:00', '2019-11-30 00:00:00', 4, 8, 0, 0, '', 'Demo Text', 'Saiful Islam Azad, Secretary, Bangladesh Power Development Board (BPDB), WAPDA Building (1st Floor), Motijheel C/A', 'Alltender.com', 'Sylhet', 'Local', 'Service', 'Govt', 'EIO (Firm)', 'Sales', 1, '2019-08-20 21:21:20', '2019-08-20 19:21:20', 1),
(4, 'Supply of Keyboard & Mouse', '2500', 'Request For Quotation (RFQ) for the Supply of Keyboard & Mouse', '916796', '2019-08-21', '0000-00-00', '0000-00-00 00:00:00', '2019-08-30 00:00:00', 4, 8, 0, 7, '', 'Demo Text', 'Brac Sylhet Office', 'Prothom Alo', 'Sylhet', 'Local', 'Goods', 'NGO', 'EIO (Firm)', 'Sales', 1, '2019-08-21 07:16:16', '2019-08-21 05:16:16', 1),
(5, 'Issuance of Bid Documents & Others', '1500', 'Notice For the Issuance of Bid Documents For Selection of the Project Sponsors For Implementation of a 5 MW+-20% Grid Connected Waste to Power Project on Build, Own and Operate (BOO) Basis', '650398', '2019-08-22', '0000-00-00', '0000-00-00 00:00:00', '2019-09-30 00:00:00', 4, 9, 0, 4, 'tender_705894.jpg', 'Text', 'Saiful Islam Azad, Secretary, Bangladesh Power Development Board (BPDB), WAPDA Building (1st Floor), Motijheel C/A,', 'Alltender.com', 'Chattogram', 'Local', 'Service', 'Govt', 'EIO (Firm)', 'Sales', 1, '2019-08-21 21:39:36', '2019-08-21 19:39:36', 1);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `user_id` int(11) NOT NULL,
  `user_name` varchar(255) NOT NULL,
  `user_mobile` varchar(11) NOT NULL,
  `user_email` varchar(255) NOT NULL,
  `user_password` varchar(255) NOT NULL,
  `user_type` tinyint(1) NOT NULL,
  `user_profile` varchar(255) NOT NULL,
  `user_status` tinyint(1) NOT NULL DEFAULT '0',
  `user_doc` datetime NOT NULL,
  `user_dom` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `user_creator` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user_id`, `user_name`, `user_mobile`, `user_email`, `user_password`, `user_type`, `user_profile`, `user_status`, `user_doc`, `user_dom`, `user_creator`) VALUES
(1, 'admin', '01761152186', 'niharranjandasmu@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 4, 'avatar.png', 1, '2019-08-19 00:29:00', '2019-08-18 18:29:09', 0),
(3, 'Rahul Roy', '01983747464', 'rahulroy@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 1, '1566511216.jpg', 1, '2019-08-23 00:00:16', '2019-08-22 22:00:16', 0),
(4, 'Onik Roy', '09287336363', 'onik@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 2, '1566575638.png', 1, '2019-08-23 17:53:58', '2019-08-23 15:53:58', 0),
(7, 'Akash Das', '01623021319', 'akashdasmu@gmail.com', 'e10adc3949ba59abbe56e057f20f883e', 2, '1566578933.jpg', 1, '2019-08-23 18:48:53', '2019-08-23 16:48:53', 0),
(8, 'Sondip Dor', '0183763633', 'sondip@d.ck', 'e10adc3949ba59abbe56e057f20f883e', 3, 'avatar.png', 1, '2019-09-07 08:33:00', '2019-09-07 08:12:33', 0);

-- --------------------------------------------------------

--
-- Table structure for table `users_tenders`
--

CREATE TABLE `users_tenders` (
  `user_tender_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `tender_id` int(11) NOT NULL,
  `user_tender_result` tinyint(1) NOT NULL DEFAULT '1',
  `user_tender_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `user_tender_status` tinyint(1) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `users_tenders`
--

INSERT INTO `users_tenders` (`user_tender_id`, `user_id`, `tender_id`, `user_tender_result`, `user_tender_date`, `user_tender_status`) VALUES
(2, 4, 5, 1, '2019-08-23 16:02:41', 1),
(4, 7, 4, 1, '2019-08-23 18:25:22', 1),
(5, 7, 2, 1, '2019-08-24 08:56:45', 1),
(6, 4, 3, 1, '2019-09-10 08:08:05', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `comments`
--
ALTER TABLE `comments`
  ADD PRIMARY KEY (`comment_id`);

--
-- Indexes for table `constructors`
--
ALTER TABLE `constructors`
  ADD PRIMARY KEY (`constructor_id`);

--
-- Indexes for table `divisions`
--
ALTER TABLE `divisions`
  ADD PRIMARY KEY (`division_id`);

--
-- Indexes for table `ministries`
--
ALTER TABLE `ministries`
  ADD PRIMARY KEY (`ministry_id`);

--
-- Indexes for table `reports`
--
ALTER TABLE `reports`
  ADD PRIMARY KEY (`report_id`);

--
-- Indexes for table `subdivisions`
--
ALTER TABLE `subdivisions`
  ADD PRIMARY KEY (`subdivision_id`);

--
-- Indexes for table `tenders`
--
ALTER TABLE `tenders`
  ADD PRIMARY KEY (`tender_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`user_id`);

--
-- Indexes for table `users_tenders`
--
ALTER TABLE `users_tenders`
  ADD PRIMARY KEY (`user_tender_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `comments`
--
ALTER TABLE `comments`
  MODIFY `comment_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `constructors`
--
ALTER TABLE `constructors`
  MODIFY `constructor_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `divisions`
--
ALTER TABLE `divisions`
  MODIFY `division_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `ministries`
--
ALTER TABLE `ministries`
  MODIFY `ministry_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `reports`
--
ALTER TABLE `reports`
  MODIFY `report_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `subdivisions`
--
ALTER TABLE `subdivisions`
  MODIFY `subdivision_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `tenders`
--
ALTER TABLE `tenders`
  MODIFY `tender_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `users_tenders`
--
ALTER TABLE `users_tenders`
  MODIFY `user_tender_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
