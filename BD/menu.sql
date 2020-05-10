-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-05-2020 a las 06:28:15
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `itodb`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `menu`
--

CREATE TABLE `menu` (
  `id_menu` int(11) NOT NULL,
  `id_restaurante` int(11) NOT NULL,
  `platillo` varchar(60) NOT NULL,
  `ingredientes` varchar(100) NOT NULL,
  `precio` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `menu`
--

INSERT INTO `menu` (`id_menu`, `id_restaurante`, `platillo`, `ingredientes`, `precio`) VALUES
(1, 1, 'Tostadas de Cazon', 'Tostada, cazon', 15),
(2, 1, 'Coctel de Camaron', 'Galletas, caldo, camaron', 45),
(3, 1, 'Mojarra frita', 'Mojarra, aceite, salsa', 70),
(7, 2, 'Torta de Jamon', 'Pan, jamon, mayonesa', 15),
(8, 2, 'Torta de Pierna', 'Pan, pierna, mayonesa', 16),
(9, 3, 'Torta de Pierna Pavitos', 'Pan, piernita, receta secreta', 18),
(10, 3, 'Torta de Jamon Pavitos', 'Pan, jamon serrano, salsa secreta', 25),
(11, 3, 'Agua de Horchata Pavitos', 'Agua, jarabe, leche, salsa secreta del abuelo', 35),
(12, 4, 'Desayuno: Huevos', 'Huevos al gusto, tortillas, agua', 30),
(13, 4, 'Desayuno: Enfrijoladas', 'Tortilla, frijol, queso, pollo, agua', 30),
(14, 4, 'Desayuno: Enchiladas', 'Tortilla, salsa ricolina, queso, pollo, agua', 30),
(15, 4, 'Comida: Milanesa', 'Milanesa de pollo, sazon secreto', 35),
(16, 5, 'Picaditas', 'Masa, salsa, queso, cebollita', 4),
(17, 5, 'Huaraches', 'Masa, aceite, flor de calabaza, chicharron', 17),
(18, 5, 'Empanadas', 'Masa, queso/picadillo/champinon', 7),
(19, 5, 'Aguas de Sabor 1 Litro', 'Agua, fruta al gusto', 15),
(20, 5, 'Desayuno Sorpresa', 'Solo dios sabe la verdad', 10),
(21, 6, 'Orden de Tacos al Pastor', '5 Tacos al pastor ', 35),
(22, 6, 'Tacos Arabes', '1 Tortilla, Carne, Queso, Salsa', 15),
(23, 6, 'Tacos Lady Gaga', '1 Gringa con Chorizo', 25),
(24, 6, 'Fortachon', 'Carnes de dudosa procedencia', 50),
(25, 6, 'Matahambre', 'Revoltijo de carnes de dudosa procedencia', 120),
(26, 6, 'Agua de horchata', 'Solo dios sabe de que es', 5),
(27, 7, 'Baguette de Quesos', 'Pan al gusto, 5 quesos y mermelada', 35),
(28, 7, 'Baguette Espanol', 'Cebolla caramelizada, jamon serrano, salsa especial', 30),
(29, 7, 'Baguette Italiano', 'Pepperoni, Champinon, Salami, especias', 37),
(30, 8, 'Cafe Negro', 'Cafe negro y... ya', 30),
(31, 8, 'Pan Especial', 'Pan barato', 8),
(32, 8, 'Coca con Hielo', 'Vaso, coca, hielo, ingrediente secreto que aumenta mucho su precio', 25);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `menu`
--
ALTER TABLE `menu`
  ADD PRIMARY KEY (`id_menu`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `menu`
--
ALTER TABLE `menu`
  MODIFY `id_menu` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
