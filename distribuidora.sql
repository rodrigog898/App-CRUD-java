-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 23-11-2020 a las 18:00:10
-- Versión del servidor: 10.4.14-MariaDB
-- Versión de PHP: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `distribuidora`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `camara`
--

CREATE TABLE `camara` (
  `id` int(11) NOT NULL,
  `marca` varchar(50) NOT NULL,
  `modelo` varchar(50) NOT NULL,
  `memoria` varchar(50) NOT NULL,
  `mpx` varchar(50) NOT NULL,
  `accesorios` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `camara`
--

INSERT INTO `camara` (`id`, `marca`, `modelo`, `memoria`, `mpx`, `accesorios`) VALUES
(2, 'Nikon', '256GB', 'a680sd', '48', '7');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `notebook`
--

CREATE TABLE `notebook` (
  `id` int(11) NOT NULL,
  `marca` varchar(50) NOT NULL,
  `modelo` varchar(50) NOT NULL,
  `procesador` varchar(50) NOT NULL,
  `ram` varchar(50) NOT NULL,
  `grafica` varchar(50) NOT NULL,
  `almacenamiento` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `notebook`
--

INSERT INTO `notebook` (`id`, `marca`, `modelo`, `procesador`, `ram`, `grafica`, `almacenamiento`) VALUES
(1, 'Acer', 'Nitro 5', 'Ryzen 3600x', '16GB', 'RTX 2060', '1 TB');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `teclado`
--

CREATE TABLE `teclado` (
  `id` int(11) NOT NULL,
  `marca` varchar(50) NOT NULL,
  `modelo` varchar(50) NOT NULL,
  `switch` varchar(50) NOT NULL,
  `color` varchar(50) NOT NULL,
  `velocidad` varchar(50) NOT NULL,
  `cantidadteclas` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `telefono`
--

CREATE TABLE `telefono` (
  `imei` int(11) NOT NULL,
  `marca` varchar(50) NOT NULL,
  `modelo` varchar(50) NOT NULL,
  `color` varchar(50) NOT NULL,
  `mpxcamara` varchar(50) NOT NULL,
  `ram` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `telefono`
--

INSERT INTO `telefono` (`imei`, `marca`, `modelo`, `color`, `mpxcamara`, `ram`) VALUES
(231231, 'Iphone', 'X', 'Negro', '216', '16GB');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `television`
--

CREATE TABLE `television` (
  `id` int(11) NOT NULL,
  `marca` varchar(50) NOT NULL,
  `modelo` varchar(50) NOT NULL,
  `pulgada` varchar(50) NOT NULL,
  `cantidadentradas` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `television`
--

INSERT INTO `television` (`id`, `marca`, `modelo`, `pulgada`, `cantidadentradas`) VALUES
(1, 'LG', 'OLED65B', '56', '8'),
(342, 'LG', 'OLED65C7', '56', '8');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `camara`
--
ALTER TABLE `camara`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `notebook`
--
ALTER TABLE `notebook`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `teclado`
--
ALTER TABLE `teclado`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `telefono`
--
ALTER TABLE `telefono`
  ADD PRIMARY KEY (`imei`);

--
-- Indices de la tabla `television`
--
ALTER TABLE `television`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
