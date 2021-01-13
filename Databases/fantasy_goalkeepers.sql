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
-- Table structure for table `goalkeepers`
--

DROP TABLE IF EXISTS `goalkeepers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `goalkeepers` (
  `Player_name` varchar(45) NOT NULL,
  `Team` varchar(35) NOT NULL,
  `Total_points` int DEFAULT NULL,
  `Cost` double DEFAULT NULL,
  `Position` varchar(2) NOT NULL,
  UNIQUE KEY `Player_name_UNIQUE` (`Player_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `goalkeepers`
--

LOCK TABLES `goalkeepers` WRITE;
/*!40000 ALTER TABLE `goalkeepers` DISABLE KEYS */;
INSERT INTO `goalkeepers` VALUES ('Adrián',' Liverpool',27,4.5,'gk'),('Alisson','Liverpool',122,6,'gk'),('Arrizabalaga',' Chelsea',90,5,'gk'),('Bettinelli',' Fulham',22,4.5,'gk'),('Bravo',' Man City',11,4.5,'gk'),('Button',' Brighton',0,4,'gk'),('Caballero',' Chelsea ',13,5,'gk'),('Casilla',' Leeds',0,4.5,'gk'),('Darlow',' Newcastle',0,5,'gk'),('de Gea',' Man Utd',143,5.5,'gk'),('Dubravka',' Newcastle',143,5,'gk'),('Ederson',' Man City',133,6,'gk'),('Fabianski',' West Ham',83,5,'gk'),('Fabri',' Fulham',0,4,'gk'),('Foderingham',' Sheffield Utd',0,4.5,'gk'),('Gazzaniga',' Spurs',58,4.5,'gk'),('Gillespie',' Newcastle',0,4.5,'gk'),('Guaita',' Crystal Palace',137,5,'gk'),('Gunn',' Southampton',29,4.5,'gk'),('Hart',' Spurs',0,4.5,'gk'),('Heaton',' Aston Villa ',59,4.5,'gk'),('Henderson',' Man Utd',160,5.5,'gk'),('Hennessey',' Crystal Palace',7,4.5,'gk'),('Johnstone',' West Brom',0,4.5,'gk'),('Leno',' Arsenal',114,5,'gk'),('Lloris',' Spurs',98,5.5,'gk'),('Lössl',' Everton',0,4.5,'gk'),('Martin',' West Ham',20,4,'gk'),('Martínez',' Arsenal',33,4.5,'gk'),('McCarthy',' Southampton',104,4.5,'gk'),('Meslier',' Leeds',0,4.5,'gk'),('Miazek',' Leeds',0,4,'gk'),('Moore',' Sheffield Utd',3,4.5,'gk'),('Nyland',' Aston Villa ',15,4,'gk'),('Patrício',' Wolves',153,5.5,'gk'),('Peacock-Farrell',' Burnley',0,4,'gk'),('Pickford',' Everton',117,5,'gk'),('Pope',' Burnley',170,5.5,'gk'),('Ramsdale',' Sheffield Utd',126,5,'gk'),('Randolph',' West Ham',3,4.5,'gk'),('Roberto',' West Ham',18,4.5,'gk'),('Rodák',' Fulham',0,4.5,'gk'),('Romero',' Man Utd',0,5,'gk'),('Ruddy',' Wolves',0,4.5,'gk'),('Ryan',' Brighton ',135,4.5,'gk'),('Sarkic',' Wolves',0,4.5,'gk'),('Schmeichel',' Leicester',156,5.5,'gk'),('Steer',' Aston Villa',1,4,'gk'),('Virgínia',' Everton',0,4.5,'gk'),('Ward',' Leicester',0,4.5,'gk');
/*!40000 ALTER TABLE `goalkeepers` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-13 15:39:25
