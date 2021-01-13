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
-- Table structure for table `farwards`
--

DROP TABLE IF EXISTS `farwards`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `farwards` (
  `Player_name` varchar(45) NOT NULL,
  `Team` varchar(35) NOT NULL,
  `Total_points` int DEFAULT NULL,
  `Cost` double DEFAULT NULL,
  `Position` varchar(2) NOT NULL,
  UNIQUE KEY `Player_name_UNIQUE` (`Player_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `farwards`
--

LOCK TABLES `farwards` WRITE;
/*!40000 ALTER TABLE `farwards` DISABLE KEYS */;
INSERT INTO `farwards` VALUES ('Abraham','Chelsea',153,7.5,'fw'),('Adams','Southampton',78,6,'fw'),('Aguero','Man City',144,10.5,'fw'),('Ajeti','West Ham',9,5.5,'fw'),('Andone','Brighton',5,5,'fw'),('Antonio','West Ham',111,6.5,'fw'),('Austin','West Brom',0,5.5,'fw'),('Ayew','Crystal Palace',132,6,'fw'),('Bamford','Leeds',0,5.5,'fw'),('Barnes','Burnley',61,6,'fw'),('Batshuayi','Chelsea',28,6,'fw'),('Benteke','Crystal Palace',42,5.5,'fw'),('Bonatini','Wolves',0,5,'fw'),('Callum Robinson','Sheffield Utd',33,5.5,'fw'),('Calvert-Lewin','Everton',126,7,'fw'),('Campana','Wolves',0,5,'fw'),('Carroll','Newcastle',34,5.5,'fw'),('Connolly','Brighton',61,5.5,'fw'),('Davis','Aston Villa',25,4.5,'fw'),('Decordova-Reid','Fulham',0,5.5,'fw'),('Firmino','Liverpool',155,9.5,'fw'),('Gayle','Newcastle',58,6,'fw'),('Giroud','Chelsea',68,7,'fw'),('Haller','West Ham',102,6.5,'fw'),('Hugill','West Ham',0,5.5,'fw'),('Ighalo','Man Utd',11,6.5,'fw'),('Iheanacho','Leicester',64,6,'fw'),('Ings','Southampton',198,8.5,'fw'),('Jesus','Man City',146,9.5,'fw'),('Jiménez','Wolves',194,8.5,'fw'),('Joelinton','Newcastle',78,6,'fw'),('Kane','Spurs',158,10.5,'fw'),('Kean','Everton',53,6,'fw'),('Lacazette','Arsenal',118,8.5,'fw'),('Long','Southampton',62,5.5,'fw'),('Martial','Man Utd',200,9,'fw'),('Maupay','Brighton',131,6.5,'fw'),('McBurnie','Sheffield Utd',86,6,'fw'),('McGoldrick','Sheffield Utd',65,5.5,'fw'),('Mitrović','Fulham',0,6,'fw'),('Mousset','Sheffield Utd',84,6,'fw'),('Murray','Brighton',36,5,'fw'),('Muto','Newcastle',9,5,'fw'),('Nketiah','Arsenal',25,6,'fw'),('Obafemi','Southampton',45,5,'fw'),('Origi','Liverpool',65,5.5,'fw'),('Richarlison','Everton',165,8,'fw'),('Robson-Kanu','West Brom',0,5.5,'fw'),('Rodrigo','Leeds',0,6,'fw'),('Rodriguez','Burnley',100,6,'fw'),('Samatta','Aston Villa',29,6,'fw'),('Sharp','Sheffield Utd',57,6,'fw'),('Tosun','Everton',24,6,'fw'),('Vardy','Leicester',210,10,'fw'),('Vassilev','Aston Villa',4,4.5,'fw'),('Vydra','Burnley',39,5,'fw'),('Werner','Chelsea',0,9.5,'fw'),('Wesley','AstonVilla',67,6,'fw'),('Wickham','Crystal Palace',15,4.5,'fw'),('Wood','Burnley',136,6.5,'fw'),('Zohore','West Brom',0,5,'fw');
/*!40000 ALTER TABLE `farwards` ENABLE KEYS */;
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
