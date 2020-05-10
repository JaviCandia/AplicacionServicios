-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-05-2020 a las 06:28:03
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
-- Estructura de tabla para la tabla `restaurante`
--

CREATE TABLE `restaurante` (
  `id_restaurante` int(11) NOT NULL,
  `ciudad` varchar(45) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `descripcion` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `restaurante`
--

INSERT INTO `restaurante` (`id_restaurante`, `ciudad`, `nombre`, `direccion`, `descripcion`) VALUES
(1, 'Cosamaloapan', 'Jaiba Cosamaloapena', 'Calle 3 Avenida 2', 'Jaibas jarochas de Cosamayork'),
(2, 'Cosamaloapan', 'Tortas de la Cuenca', 'Parque Dolores', 'Tortas con estilo unico'),
(3, 'Orizaba', 'Tortas Pavitos', 'Colonia Central', 'Tortas pequenas tradicionales'),
(4, 'Orizaba', 'Sal y pimienta', 'Frente al ITO', 'Comida rapida y economica'),
(5, 'Fortin', 'Lluvia de Mana', 'Por el parque', 'Antojitos y memelas'),
(6, 'Cordoba', 'Tacos de Cordoba', 'Avenida 1 Calle 1', 'Venta de taquitos al pastor'),
(7, 'Orizaba', 'Rovianda Plus', 'Cerca de la facultad de enfermeria', 'Comida Fancy para nada pretenciosa'),
(8, 'Cordoba', 'Los Portales de Cordoba', 'A un costado del palacio', 'Lugar Fancy para nada pretencioso');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `restaurante`
--
ALTER TABLE `restaurante`
  ADD PRIMARY KEY (`id_restaurante`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `restaurante`
--
ALTER TABLE `restaurante`
  MODIFY `id_restaurante` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
