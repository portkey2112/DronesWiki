USE `drones_info`;


CREATE TABLE `dronemodel` (`ID` int not null, `name` varchar(255), `users` varchar(255), `country` varchar(255) ,  PRIMARY KEY(`ID`));
INSERT INTO `dronemodel` VALUES (1,'ghatak', 'military', 'india');
INSERT INTO `dronemodel` VALUES (3,'Parley SnotBot', 'marine biologists', 'usa');
INSERT INTO `dronemodel` VALUES (4,'DJI Sheep counter', 'Animal husbandry', 'usa');
INSERT INTO `dronemodel` VALUES (2, 'AgrasT30', 'Farmers', 'China');


