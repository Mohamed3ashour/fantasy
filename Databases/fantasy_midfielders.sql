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
-- Table structure for table `midfielders`
--

DROP TABLE IF EXISTS `midfielders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `midfielders` (
  `Player_name` varchar(45) NOT NULL,
  `Team` varchar(35) NOT NULL,
  `Total_points` int DEFAULT NULL,
  `Cost` double DEFAULT NULL,
  `Position` varchar(2) NOT NULL,
  UNIQUE KEY `Player_name_UNIQUE` (`Player_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `midfielders`
--

LOCK TABLES `midfielders` WRITE;
/*!40000 ALTER TABLE `midfielders` DISABLE KEYS */;
INSERT INTO `midfielders` VALUES ('Aarons','Newcastle',0,5,'mf'),('Albrighton','Leicester',38,5.5,'mf'),('Alli','Spurs',117,8,'mf'),('Almirón','Newcastle',109,6,'mf'),('Alzate','Brighton',33,4.5,'mf'),('André Gomes','Everton',39,5.5,'mf'),('Anguissa','Fulham',23,4.5,'mf'),('Armstrong','Southampton',98,5.5,'mf'),('Atsu','Newcastle',37,5.5,'mf'),('Aubameyang','Arsenal',205,12,'mf'),('Barkley','Chelsea',61,6,'mf'),('Barnes','Leicester',133,7,'mf'),('Berge','Sheffield Utd',40,5,'mf'),('Bergwijn','Spurs',173,7.5,'mf'),('Bernard','Everton',72,6,'mf'),('Bernardo Silva','Man City',116,7.5,'mf'),('Bissouma','Brighton',39,4.5,'mf'),('Boufal','Southampton',34,5.5,'mf'),('Bowen','West Ham',44,6.5,'mf'),('Brady','Burnley',32,5,'mf'),('Brownhill','Burnley',21,5,'mf'),('Burke','West Brom',0,4.5,'mf'),('Cairney','Fulham',0,5.5,'mf'),('Cavaleiro','Fulham',0,5.5,'mf'),('Chamberlain','Liverpool',76,6.5,'mf'),('Chong','Man Utd',3,4.5,'mf'),('Choudhury','Leicester',35,5,'mf'),('Cork','Burnley',70,5,'mf'),('Costa','Leeds',0,5.5,'mf'),('Davies','Everton',59,5.5,'mf'),('De Bruyne','Man City',251,11.5,'mf'),('Delph','Everton',24,5,'mf'),('Dendoncker','Wolves',100,5,'mf'),('Diangana','West Ham',0,5.5,'mf'),('Djenepo','Southampton',40,5.5,'mf'),('Douglas Luiz','Aston Villa',90,5,'mf'),('Doyle','Man City',1,4.5,'mf'),('Edwards','West Brom',0,5,'mf'),('El Ghazi','Aston Villa',93,6,'mf'),('Elliott','Liverpool',2,4.5,'mf'),('Eze','Crystal Palace',0,6,'mf'),('Fabinho','Liverpool',77,5.5,'mf'),('Felipe Anderson','West Ham',66,6.5,'mf'),('Fernandes','Man Utd',117,10.5,'mf'),('Field','West Brom',0,5,'mf'),('Fleck','Sheffield Utd',101,6,'mf'),('Foden','Man City',69,6.5,'mf'),('Fornals','West Ham',93,6.5,'mf'),('Forshaw','Leeds',0,5,'mf'),('Fred','Man Utd',50,5.5,'mf'),('Freeman','Sheffield Utd1',3,5,'mf'),('Garner','Man Utd',1,4.5,'mf'),('Gbamin','Everton',4,5,'mf'),('Gibbs-White','Wolves',11,5,'mf'),('Gilmour','Chelsea',9,4.5,'mf'),('Gordon','Everton',17,4.5,'mf'),('Gray','Leicester',44,5.5,'mf'),('Grealish','Aston Villa',149,7,'mf'),('Greenwood','Man Utd',103,7.5,'mf'),('Grosicki','West Brom',0,5.5,'mf'),('Groß','Brighton',76,6,'mf'),('Grot','Leeds',0,5,'mf'),('Gudmundsson','Burnley',30,5.5,'mf'),('Guendouzi','Arsenal',48,5,'mf'),('Gündogan','Man City',65,5.5,'mf'),('Harper','West Brom',0,4.5,'mf'),('Harrison','Leeds',0,5.5,'mf'),('Harry Wilson','Liverpool',91,5.5,'mf'),('Hayden','Newcastle',73,5,'mf'),('Helvey','Newcastle',105,5.5,'mf'),('Henderson','Liverpool',116,5.5,'mf'),('Hendrick','Newcastle',67,5,'mf'),('Hernández','Leeds',0,6,'mf'),('Højbjerg','Spurs',75,5,'mf'),('Hourihane','Aston Villa',83,6,'mf'),('Hudson-Odoi','Chelsea',53,6,'mf'),('Iwobi','Everton',52,6,'mf'),('Izquierdo','Brighton',0,5.5,'mf'),('Jahanbakhsh','Brighton',28,5.5,'mf'),('James','Man Utd',95,6.5,'mf'),('Johansen','Fulham',0,5,'mf'),('Jones','Liverpool',13,4.5,'mf'),('Jordao','Wolves',1,4.5,'mf'),('Jorginho','Chelsea',92,5,'mf'),('Jota','Wolves',105,6.5,'mf'),('Kamara','Fulham',0,5,'mf'),('Kanté','Chelsea',57,5,'mf'),('Kebano','Fulham',0,5,'mf'),('Keita','Liverpool',52,5.5,'mf'),('Klich','Leeds',0,5.5,'mf'),('Knockaert','Fulham',0,5.5,'mf'),('Kouyaté','Crystal Palace',85,5,'mf'),('Kovacic','Chelsea',68,5.5,'mf'),('Lallana','Brighton',27,6.5,'mf'),('Lamela','Spurs',65,6,'mf'),('Lansbury','Aston Villa',12,4.5,'mf'),('Lanzini','West Ham',50,6.5,'mf'),('Leko','West Brom',0,4.5,'mf'),('Lemina','Fulham',0,4.5,'mf'),('Lingard','Man Utd',32,6,'mf'),('Livermore','West Brom',0,5,'mf'),('Lo Celso','Spurs',54,7,'mf'),('Loftus-Cheek','Chelsea',12,6,'mf'),('Lucas Moura','Spurs',100,7,'mf'),('Lundstram','Sheffield Utd',144,5.5,'mf'),('Mac Allister','Brighton',12,5.5,'mf'),('Maddison','Leicester',125,7,'mf'),('Mahrez','Man City',175,8.5,'mf'),('Mané','Liverpool',221,12,'mf'),('March','Brighton',38,5,'mf'),('Martinelli','Arsenal',39,5,'mf'),('Mata','Man Utd',38,6,'mf'),('Matic','Man Utd',55,5,'mf'),('MattyLongstaff','Newcastle',27,5,'mf'),('McArthur','Crystal Palace',92,5.5,'mf'),('McCarthy','CrystalPalace',41,4.5,'mf'),('McDonald','Fulham',0,5,'mf'),('McGinn','Aston Villa',84,5.5,'mf'),('McNeil','Burnley',123,6,'mf'),('McTominay','Man Utd',74,5,'mf'),('Meyer','Crystal Palace',23,5,'mf'),('Milivojevic','Crystal Palace',81,6,'mf'),('Milner','Liverpool',49,5.5,'mf'),('Minamino','Liverpool',11,6.5,'mf'),('Mooy','Brighton',80,5,'mf'),('Mount','Chelsea',137,7,'mf'),('Moutinho','Wolves',113,5.5,'mf'),('Nakamba','Aston Villa',43,4.5,'mf'),('Ndidi','Leicester',85,5,'mf'),('Ndombele','Spurs',45,6,'mf'),('Nelson','Arsenal',30,5.5,'mf'),('Neto','Wolves',57,5.5,'mf'),('Neves','Wolves',97,5.5,'mf'),('Noble','West Ham',105,5,'mf'),('Norwood','Sheffield Utd',98,5,'mf'),('Onomah','Fulham',0,5,'mf'),('Oriol Romeu','Southampton',51,4.5,'mf'),('Osborn','Sheffield Utd',19,5,'mf'),('Özil','Arsenal',53,7,'mf'),('Pépé','Arsenal',106,8,'mf'),('Pereira','Man Utd',60,5,'mf'),('Pérez','Leicester',129,6.5,'mf'),('Phillips','West Brom',0,5.5,'mf'),('Pierrick','Crystal Palace',2,4.5,'mf'),('Podence','Wolves',25,5.5,'mf'),('Pogba','Man Utd',51,8,'mf'),('Poveda-Ocampo','Leeds',0,4.5,'mf'),('Praet','Leicester',54,5.5,'mf'),('Pröpper','Brighton',78,5,'mf'),('Pulisic','Chelsea',127,8.5,'mf'),('Rashford','Man Utd',177,9.5,'mf'),('Redmond','Southampton',107,6.5,'mf'),('Reed','Fulham',0,4.5,'mf'),('Rice','West Ham',105,5,'mf'),('Riedewald','CrystalPalace',22,4.5,'mf'),('Ritchie','Newcastle',74,5,'mf'),('Roberts','Leeds',0,5,'mf'),('Rodrigo','Man City',92,5.5,'mf'),('Saint-Maximin','Newcastle',92,5.5,'mf'),('Saka','Arsenal',71,5.5,'mf'),('Salah','Liverpool',233,12,'mf'),('Sawyers','West Brom',0,5,'mf'),('Schlupp','Crystal Palace',51,5.5,'mf'),('Sean Longstaff','Newcastle',44,5,'mf'),('Seri','Fulham',0,5,'mf'),('Shackleton','Leeds',0,5,'mf'),('Shaqiri','Liverpool',15,6.5,'mf'),('Sigurdsson','Everton',95,7,'mf'),('Silva','Leicester',0,4.5,'mf'),('Sims','Southampton',0,4.5,'mf'),('Sissoko','Spurs',69,5,'mf'),('Skipp','Spurs',7,4.5,'mf'),('Smallbone','Southampton',24,4.5,'mf'),('Smith Rowe','Arsenal',4,4.5,'mf'),('Snodgrass','West Ham',87,6,'mf'),('Son','Spurs',169,9,'mf'),('Soucek','West Ham',41,5,'mf'),('Stephens','Brighton',63,4.5,'mf'),('Sterling','Man City',204,11.5,'mf'),('Stevens','Leeds',0,4.5,'mf'),('Tielemans','Leicester',117,6.5,'mf'),('Torreira','Arsenal',46,5,'mf'),('Torres','Man City',0,7,'mf'),('Townsend','Crystal Palace',48,6,'mf'),('Traoré','Wolves',130,6.5,'mf'),('Trézéguet','Aston Villa',98,5.5,'mf'),('Trossard','Brighton',104,6,'mf'),('van de Beek','Man Utd',0,7,'mf'),('Walcott','Everton',63,6,'mf'),('Ward-Prowse','Southampton',117,6,'mf'),('Westwood','Burnley',118,5.5,'mf'),('Wijnaldum','Liverpool',107,5.5,'mf'),('Willian','Arsenal',168,8,'mf'),('Willock','Arsenal',41,5,'mf'),('Wilshere','West Ham',8,5,'mf'),('Winks','Spurs',52,5.5,'mf'),('Xhaka','Arsenal',73,5.5,'mf'),('Yarmolenko','West Ham',70,6,'mf'),('Zaha','Crystal Palace',120,7,'mf'),('Ziyech','Chelsea',0,8,'mf');
/*!40000 ALTER TABLE `midfielders` ENABLE KEYS */;
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
