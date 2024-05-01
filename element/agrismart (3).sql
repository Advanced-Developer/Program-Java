-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 01, 2024 at 10:49 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `agrismart`
--

-- --------------------------------------------------------

--
-- Table structure for table `crophistory`
--

CREATE TABLE `crophistory` (
  `HistoryId` int(20) NOT NULL,
  `CropType` varchar(30) NOT NULL,
  `PlantingDate` varchar(50) NOT NULL,
  `HarvestYield` varchar(50) NOT NULL,
  `Notes` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `crophistory`
--

INSERT INTO `crophistory` (`HistoryId`, `CropType`, `PlantingDate`, `HarvestYield`, `Notes`) VALUES
(2, 'beans', '25.apr.2023', 'dec', 'after three months');

-- --------------------------------------------------------

--
-- Table structure for table `croprecommendation`
--

CREATE TABLE `croprecommendation` (
  `CropId` int(40) NOT NULL,
  `CropName` varchar(50) NOT NULL,
  `PlantingSeason` varchar(50) NOT NULL,
  `RecommendedPractices` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `croprecommendation`
--

INSERT INTO `croprecommendation` (`CropId`, `CropName`, `PlantingSeason`, `RecommendedPractices`) VALUES
(1, 'mangoes', 'summer', 'irrigations'),
(2, 'tomatoes', 'winter', 'clean on land'),
(3, 'bannas', 'summer', 'dig');

-- --------------------------------------------------------

--
-- Table structure for table `soilmoisturedata`
--

CREATE TABLE `soilmoisturedata` (
  `DataId` int(30) NOT NULL,
  `TimeStamp` varchar(50) NOT NULL,
  `MoisrureLevel` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `soilmoisturedata`
--

INSERT INTO `soilmoisturedata` (`DataId`, `TimeStamp`, `MoisrureLevel`) VALUES
(2, '10.apr.2022', 'two');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `crophistory`
--
ALTER TABLE `crophistory`
  ADD PRIMARY KEY (`HistoryId`);

--
-- Indexes for table `croprecommendation`
--
ALTER TABLE `croprecommendation`
  ADD PRIMARY KEY (`CropId`);

--
-- Indexes for table `soilmoisturedata`
--
ALTER TABLE `soilmoisturedata`
  ADD PRIMARY KEY (`DataId`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
