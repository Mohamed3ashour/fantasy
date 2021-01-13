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
-- Table structure for table `defenders`
--

DROP TABLE IF EXISTS `defenders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `defenders` (
  `Player_name` varchar(45) NOT NULL,
  `Team` varchar(35) NOT NULL,
  `Total_points` int DEFAULT NULL,
  `Cost` double DEFAULT NULL,
  `Position` varchar(2) NOT NULL,
  UNIQUE KEY `Player_name_UNIQUE` (`Player_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `defenders`
--

LOCK TABLES `defenders` WRITE;
/*!40000 ALTER TABLE `defenders` DISABLE KEYS */;
INSERT INTO `defenders` VALUES ('Ajayi ','West Brom ',2,5,'df'),('Aké ','Man City',79,5.5,'df'),('Alderweireld ','Spurs ',100,5.5,'df'),('Alioski ','Leeds ',0,4.5,'df'),('Amartey',' Leicester ',0,4,'df'),('Aurier ','Spurs',141,5.5,'df'),('Ayling ','Leeds ',0,4.5,'df'),('Bailly ','Man Utd ',17,5,'df'),('Balbuena',' West Ham',40,4.5,'df'),('Baldock ','Sheffield Utd ',142,5.5,'df'),('Bartley ','West Brom ',0,4.5,'df'),('Basham ','Sheffield Utd ',123,5,'df'),('Bednarek',' Southampton ',84,4.5,'df'),('Bellerín ','Arsenal ',44,5,'df'),('Benkovic ','Leicester ',0,4.5,'df'),('Bennett ','Wolves ',32,4.5,'df'),('Bernardo ','Brighton ',21,4,'df'),('Bertrand ','Southampton ',75,5,'df'),('Boly ','Wolves ',97,5.5,'df'),('Branthwaite ','Everton ',11,4,'df'),('Bryan ','Fulham ',0,5,'df'),('Buur ','Wolves ',0,4,'df'),('Cahill ','Crystal Palace ',70,4.5,'df'),('Cancelo',' Man City',45,5.5,'df'),('Casey ','Leeds ',0,4,'df'),('Cash ','Aston Villa ',0,5,'df'),('Cédric ','Arsenal ',61,5,'df'),('Chambers',' Arsenal ',42,4.5,'df'),('Christensen','Chelsea ',34,5,'df'),('Christie ','Fulham ',0,4.5,'df'),('Clark ','Newcastle ',49,4.5,'df'),('Coady ','Wolves ',118,5,'df'),('Coleman','Everton ',55,5,'df'),('Connell',' Sheffield Utd ',111,5,'df'),('Cooper',' Leeds ',0,4.5,'df'),('Cresswell',' West Ham ',79,5,'df'),('Dallas ','Leeds ',0,4.5,'df'),('Dalot ','Man Utd ',4,5,'df'),('Dann ','Crystal Palace ',51,4.5,'df'),('Davies ','Spurs ',41,5,'df'),('Davis ','Leeds ',0,4,'df'),('Dier ','Spurs ',36,5,'df'),('Diop ','West Ham ',76,4.5,'df'),('Douglas ','Leeds ',0,4,'df'),('Dummett ','Newcastle ',44,4.5,'df'),('Dunk ','Brighton ',128,5,'df'),('Egan ','Sheffield Utd ',133,5,'df'),('El Mohamady',' Aston Villa ',39,4.5,'df'),('Emerson',' Chelsea ',19,5,'df'),('Ferguson',' Crystal Palace ',0,4,'df'),('Fernández ','Newcastle ',102,5,'df'),('Fernandinho',' Man City ',55,5.5,'df'),('Fosu-Mensah',' Man Utd ',7,4.5,'df'),('Foyth ','Spurs ',3,4.5,'df'),('Fredericks',' West Ham ',74,4.5,'df'),('Fuchs ','Leicester ',26,4.5,'df'),('Furlong',' West Brom ',0,4.5,'df'),('Gabriel ','Arsenal ',0,5,'df'),('Garcia',' Man City ',38,5,'df'),('Gibbs',' West Brom',0,4.5,'df'),('Gibson ','Burnley ',0,4,'df'),('Gomez ','Liverpool ',93,5.5,'df'),('Hector ','Fulham ',0,4.5,'df'),('Hegazi ','West Brom ',0,4.5,'df'),('Holding ','Arsenal ',16,4.5,'df'),('Holgate',' Everton ',71,5,'df'),('Jack Robinson',' Sheffield Utd ',14,4.5,'df'),('James ','Chelsea ',61,5,'df'),('Johnson ','West Ham ',6,4,'df'),('Jones',' Man Utd ',2,5,'df'),('Jonny',' Wolves ',123,5.5,'df'),('Justin ','Leicester ',35,4.5,'df'),('Keane','Everton',90,5,'df'),('Kelly ','Crystal Palace ',64,4.5,'df'),('Kenny ','Everton ',0,4.5,'df'),('Kilman ','Wolves ',5,4,'df'),('Koch ','Leeds ',0,4.5,'df'),('Kolasinac ','Arsenal ',55,5,'df'),('Krafth ','Newcastle ',37,4.5,'df'),('Lascelles ','Newcastle ',73,4.5,'df'),('Le Marchand ','Fulham ',0,4.5,'df'),('Lejeune ','Newcastle ',24,4.5,'df'),('Lindelöf',' Man Utd ',116,5,'df'),('Maguire',' Man Utd ',123,5.5,'df'),('Maitland-Niles ','Arsenal ',41,5,'df'),('Manquillo',' Newcastle ',65,4.5,'df'),('Marí ','Arsenal ',8,4.5,'df'),('Masuaku',' West Ham ',26,4.5,'df'),('Mawson ','Fulham ',0,4.5,'df'),('Mee ','Burnley ',110,5,'df'),('Mengi',' Man Utd ',0,4,'df'),('Mings',' Aston Villa ',90,5,'df'),('Mitchell ','Crystal Palace ',4,4,'df'),('Morgan ','Leicester ',19,4.5,'df'),('Mustafi ','Arsenal ',43,5,'df'),('Ogbonna ','West Ham ',81,5,'df'),('Otamendi ','Man City ',82,5,'df'),('Ream',' Fulham ',0,4.5,'df'),('Robinson ','Fulham ',0,4.5,'df'),('Rojo ','Man Utd ',3,5,'df'),('Rose ','Spurs ',47,5,'df'),('Rüdiger ','Chelsea ',63,5,'df'),('Saïss ','Wolves ',103,5,'df'),('Sakho ','Crystal Palace',11,4.5,'df'),('Saliba ','Arsenal ',0,4.5,'df'),('Salisu ','Southampton ',0,4.5,'df'),('Sánchez',' Spurs ',64,5.5,'df'),('Schär ','Newcastle ',55,5,'df'),('Sessegnon',' Fulham',0,4.5,'df'),('Shaw',' Man Utd ',67,5,'df'),('Shea ','West Brom ',0,4.5,'df'),('Smalling',' Man Utd ',0,5,'df'),('Sokratis',' Arsenal ',57,5,'df'),('Stephens ','Southampton ',85,5,'df'),('Stevens ','Sheffield Utd',142,5.5,'df'),('Stones',' Man City',34,5,'df'),('Struijk ','Leeds ',0,4,'df'),('Tanganga ','Spurs ',17,5,'df'),('Taylor ','Burnley',84,4.5,'df'),('Thiago Silva ','Chelsea ',0,5.5,'df'),('Thomas',' Leicester ',15,4.5,'df'),('Tomori ','Chelsea ',48,5,'df'),('Townsend ','West Brom ',0,4.5,'df'),('Tsimikas',' Liverpool ',0,5,'df'),('Tuanzebe',' Man Utd ',7,4.5,'df'),('Valery ','Southampton ',18,5,'df'),('Vestergaard',' Southampton ',51,4.5,'df'),('Vinagre ','Wolves ',32,4.5,'df'),('Vokins ','Southampton ',2,4,'df'),('Walker-Peters ','Southampton ',32,4.5,'df'),('Wan-Bissaka ','Man Utd ',127,5.5,'df'),('Ward ','Crystal Palace',77,4.5,'df'),('Watts',' Newcastle ',1,4,'df'),('Williams ','Man Utd ',51,4.5,'df'),('Yedlin ','Newcastle ',26,4.5,'df'),('Zinchenko',' Man City ',49,5.5,'df'),('Zouma',' Chelsea ',62,5,'df');
/*!40000 ALTER TABLE `defenders` ENABLE KEYS */;
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
