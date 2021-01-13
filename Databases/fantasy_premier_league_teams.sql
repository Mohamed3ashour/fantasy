-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: fantasy
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `premier_league_teams`
--

DROP TABLE IF EXISTS `premier_league_teams`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `premier_league_teams` (
  `Team_name` varchar(35) NOT NULL,
  UNIQUE KEY `Team_name_UNIQUE` (`Team_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `premier_league_teams`
--

LOCK TABLES `premier_league_teams` WRITE;
/*!40000 ALTER TABLE `premier_league_teams` DISABLE KEYS */;
INSERT INTO `premier_league_teams` VALUES ('AFC Bournemouth'),('Arsenal'),('Aston Villa'),('Barnsley'),('Birmingham City'),('Blackburn Rovers'),('Brentford'),('Brighton'),('Bristol City'),('Burnley'),('Cardiff City'),('Charlton Athletic'),('Chelsea'),('Crystal Palace'),('Derby County'),('Everton'),('Fulham'),('Huddersfield Town'),('Hull City'),('Leeds United'),('Leicester City'),('Liverpool'),('Luton town'),('Manchester City'),('Manchester United'),('Middlesbrough'),('Millwall'),('Newcastle United'),('Norwich City'),('Nottingham Forest'),('Preston North End'),('Queens Park Rangers'),('Reading'),('Sheffield United'),('Sheffield Wednesday'),('Southampton'),('Stoke City'),('Swansea City'),('Tottenham Hotspur'),('Watford'),('West Bromwich Albion'),('West Ham United'),('Wigan Athletic'),('Wolverhampton Wanderers');
/*!40000 ALTER TABLE `premier_league_teams` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-13 15:39:24
