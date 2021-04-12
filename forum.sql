-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Gép: 127.0.0.1
-- Létrehozás ideje: 2021. Ápr 12. 23:24
-- Kiszolgáló verziója: 10.4.14-MariaDB
-- PHP verzió: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Adatbázis: `forum`
--

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `comment`
--

CREATE TABLE `comment` (
  `commentId` int(11) NOT NULL,
  `contentId` int(11) NOT NULL,
  `userName` varchar(30) NOT NULL,
  `content` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- A tábla adatainak kiíratása `comment`
--

INSERT INTO `comment` (`commentId`, `contentId`, `userName`, `content`) VALUES
(1, 1, 'GpuGéza', 'Igen jól sikerültek a 30-as széria tagjai nekem Founders edition-om van és teljesen jól működik és a pletykák ellenére nem volt vele bajom'),
(2, 1, 'Core', 'A bajos kártyák a 30-as szériából a kissebb partner gyártóknál fordultak elő ugyanis valamelyik chipből a rosszabb minőségűt rakták bele.'),
(3, 2, 'WoodenPC', 'Nekem egy 2080-am volt és még a régebbi rendszerben is átlagosan-5% al jobban teljesít WQHD-n, persze ez PCIE4.0-ás alaplapban jobban teljesít'),
(4, 3, 'AngryGamer', 'Eléggé nagy baj, hogy ilyen szinten megy mivel a pc piac nagyot drágult emiatt és a hétköznapi felhasználók bánják, az ál szimpátia a gyártók részéről hazugság ugyanis nekik csak a profit számít.'),
(5, 3, 'Cápa', 'Valószínűsíthető a kriptovaluták érték csökkenése viszont a lufi nem fog kipukkanni kb. az értéke jó esetben 20-30k USD-ra fog csökkenni.'),
(6, 4, 'NewBee', 'Nemrég határoztam el hogy újra motorozni fogok és az új védőfelszerelésem értéke kb 800k Ft lenne így viszont lehet egy részét le tudom faragni az árnak köszönöm a tanácsot'),
(8, 1, 'TEST', 'TEST');

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `subcontent`
--

CREATE TABLE `subcontent` (
  `contentId` int(11) NOT NULL,
  `topicId` int(11) NOT NULL,
  `title` varchar(30) NOT NULL,
  `userName` varchar(30) NOT NULL,
  `content` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- A tábla adatainak kiíratása `subcontent`
--

INSERT INTO `subcontent` (`contentId`, `topicId`, `title`, `userName`, `content`) VALUES
(1, 2, 'RTX 3080 Specifikációk', 'Sobod', 'GPU Engine Specs: NVIDIA CUDA® Cores 8704\r\nBoost Clock (GHz) 1.71\r\nBase Clock (GHz) 1.44\r\nMemory Specs: Standard Memory Config 10 GB GDDR6X\r\nMemory Interface Width	320-bit'),
(2, 2, 'RTX 3070 Specifikációk', 'Sobod', 'GPU Engine Specs:	NVIDIA CUDA® Cores 5888\r\nBoost Clock (GHz)	1.73\r\nBase Clock (GHz)	1.50\r\nMemory Specs: Standard Memory Config 8 GB GDDR6\r\nMemory Interface Width	256-bit'),
(3, 1, 'Bitcoin?', 'TomHash', 'A BBITCOIN jelenlegi árfolyama 55K-60K USD között mozog naponta.\r\nSokan úgy gondolják hogy most érdemes belefogni. De vajon ez igaz?\r\nAzok a bányászok akik már régen kezdték úgy gondolják hogy nem mivel,\r\npillanatnyilag hatalmas tőke beruházás lenne szükséges, hogy egy év alatt\r\nmegtérüljön a befektetés.\r\nViszont nem kell attól agódni hogy a lufi kipukkan mert a világunkban már INC.-k is beáltak a sorba valamint bankok és nemzetek is elkezdik a saját kriptovaluta fejlesztésüket.'),
(4, 4, 'Minimális felszerelés', 'DoDor', 'Kezdő motorosoknak ajánlom hogy ha nincs sok pénzük a megfelelő öltözékre \r\n legalább a bukósisakra 70E Ft-ot költsenek, mert ez már megfelelő minőségű ebben az árban.\r\n A bakancsot lehet helyettesíteni bármilyen vastagabb magas szárű cipővel.\r\n A kabátot egy olcsóbb bőr vagy műbőr dzsekivel helyettesíthető illetve ha nincs protektorunk\r\n akkor egy hátizsákot tömjünk ki rongyal és deréktájon kössük össze, hogy ne essen le ha elestünk mert már ez is tud adni egy minimális gerinc védelmet'),
(5, 5, 'Csokis muffin', 'CupCake', ' \r\nHozzávalók: \r\n15dkg liszt \r\n0.5csom sütőpor	\r\n15dkg cukor	\r\n5dkg kakaópor	\r\n2db	tojás	\r\n15dkg vaj	\r\n3ek	baracklekvár	\r\n5dkg étcsokoládé\r\nElkészítés\r\nEgy tálban összekeverjük a száraz hozzávalókat, majd folyamatos keverés mellett hozzáadjuk a tojást, a vajat, a baracklekvárt, végül a darabokra tört étcsokoládét.\r\nA tésztát egy 12 darabos, papírkapszlival bélelt muffinformába adagoljuk, majd 170 fokra előmelegített sütőben 20-25 perc alatt készre sütjük.');

-- --------------------------------------------------------

--
-- Tábla szerkezet ehhez a táblához `topic`
--

CREATE TABLE `topic` (
  `topicId` int(11) NOT NULL,
  `topic` varchar(50) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  `title` varchar(30) NOT NULL,
  `userName` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- A tábla adatainak kiíratása `topic`
--

INSERT INTO `topic` (`topicId`, `topic`, `description`, `title`, `userName`) VALUES
(1, 'Kriptovaluta', 'Bármilyen kriptovalutával kapcsolatos információk és érdekességek', 'Bitcoin', 'BitMineRRR'),
(2, 'PC-HARDWARE', 'Hardwarek A-tól Z-ig', 'Videókártya', 'GPU_Géza'),
(3, 'Smink', '???', 'Alapozó', 'Beast&Beauty'),
(4, 'Motorozás', 'Motoros tippek és tanácsok', 'Felszerelés', 'DoDor'),
(5, 'Főzés', 'Receptek tippek trükkök praktikák', 'Konyha pult', 'Lecsó');

--
-- Indexek a kiírt táblákhoz
--

--
-- A tábla indexei `comment`
--
ALTER TABLE `comment`
  ADD PRIMARY KEY (`commentId`),
  ADD KEY `contentId` (`contentId`);

--
-- A tábla indexei `subcontent`
--
ALTER TABLE `subcontent`
  ADD PRIMARY KEY (`contentId`),
  ADD KEY `topicId` (`topicId`);

--
-- A tábla indexei `topic`
--
ALTER TABLE `topic`
  ADD PRIMARY KEY (`topicId`);

--
-- A kiírt táblák AUTO_INCREMENT értéke
--

--
-- AUTO_INCREMENT a táblához `comment`
--
ALTER TABLE `comment`
  MODIFY `commentId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT a táblához `subcontent`
--
ALTER TABLE `subcontent`
  MODIFY `contentId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT a táblához `topic`
--
ALTER TABLE `topic`
  MODIFY `topicId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- Megkötések a kiírt táblákhoz
--

--
-- Megkötések a táblához `comment`
--
ALTER TABLE `comment`
  ADD CONSTRAINT `comment_ibfk_1` FOREIGN KEY (`contentId`) REFERENCES `subcontent` (`contentId`);

--
-- Megkötések a táblához `subcontent`
--
ALTER TABLE `subcontent`
  ADD CONSTRAINT `subcontent_ibfk_1` FOREIGN KEY (`topicId`) REFERENCES `topic` (`topicId`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
