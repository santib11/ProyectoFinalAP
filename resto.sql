-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-10-2023 a las 16:17:49
-- Versión del servidor: 10.4.14-MariaDB
-- Versión de PHP: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `resto`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mesa`
--

CREATE TABLE `mesa` (
  `idMesa` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `numero` int(11) NOT NULL,
  `capacidad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `mesa`
--

INSERT INTO `mesa` (`idMesa`, `estado`, `numero`, `capacidad`) VALUES
(1, 1, 1, 10),
(2, 0, 2, 8),
(3, 1, 3, 2),
(4, 1, 4, 4),
(5, 1, 5, 4),
(6, 1, 6, 6),
(8, 0, 7, 6),
(9, 1, 8, 10),
(10, 1, 9, 4),
(12, 1, 10, 10);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mesero`
--

CREATE TABLE `mesero` (
  `idMesero` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `dni` int(11) NOT NULL,
  `idUser` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `mesero`
--

INSERT INTO `mesero` (`idMesero`, `nombre`, `dni`, `idUser`) VALUES
(1, 'Luis Neyra', 123456, 1),
(2, 'Juan Neyra', 35577, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedido`
--

CREATE TABLE `pedido` (
  `idPedido` int(11) NOT NULL,
  `idMesa` int(11) NOT NULL,
  `idMesero` int(11) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `fecha` date NOT NULL,
  `importe` double NOT NULL,
  `cobrado` tinyint(1) NOT NULL,
  `hora` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pedido`
--

INSERT INTO `pedido` (`idPedido`, `idMesa`, `idMesero`, `estado`, `fecha`, `importe`, `cobrado`, `hora`) VALUES
(2, 2, 1, 1, '2023-10-20', 400, 1, '11:04:36'),
(3, 1, 1, 0, '2023-10-20', 1600, 1, '11:06:31'),
(4, 1, 1, 1, '2023-10-20', 1600, 0, '11:19:02'),
(5, 1, 1, 0, '2023-10-20', 5200, 0, '11:41:13'),
(6, 3, 1, 0, '2023-10-20', 135000, 0, '12:04:33'),
(7, 2, 1, 0, '2023-10-20', 2000, 0, '12:13:15'),
(8, 1, 2, 0, '2023-10-24', 3500, 1, '10:48:22'),
(9, 2, 1, 0, '2023-10-24', 2800, 1, '10:50:19'),
(10, 5, 1, 1, '2023-10-25', 9000, 1, '10:51:36'),
(11, 5, 1, 1, '2023-10-25', 3600, 0, '11:12:42'),
(12, 9, 1, 1, '2023-10-25', 11400, 0, '11:16:01'),
(13, 3, 2, 1, '2023-10-25', 4800, 1, '11:23:13'),
(14, 1, 2, 0, '2023-10-25', 4500, 0, '11:35:55'),
(15, 5, 2, 1, '2023-10-25', 1900, 1, '11:47:21'),
(16, 4, 2, 0, '2023-10-25', 2500, 0, '12:02:31'),
(17, 10, 1, 0, '2023-10-25', 3400, 0, '12:09:05'),
(18, 6, 1, 0, '2023-10-25', 2800, 0, '12:09:39'),
(19, 6, 1, 0, '2023-10-25', 2500, 0, '12:13:39'),
(20, 2, 1, 1, '2023-10-26', 3900, 1, '10:36:44'),
(21, 1, 1, 0, '2023-10-26', 2400, 0, '10:42:46'),
(22, 1, 1, 0, '2023-10-26', 400, 0, '11:23:15');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedidoproducto`
--

CREATE TABLE `pedidoproducto` (
  `idPedidoProducto` int(11) NOT NULL,
  `idPedido` int(11) NOT NULL,
  `idProducto` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pedidoproducto`
--

INSERT INTO `pedidoproducto` (`idPedidoProducto`, `idPedido`, `idProducto`, `cantidad`) VALUES
(4, 2, 1, 1),
(5, 3, 3, 3),
(6, 3, 1, 1),
(7, 4, 3, 2),
(8, 4, 1, 2),
(9, 5, 3, 6),
(10, 5, 1, 7),
(11, 6, 10, 150),
(12, 7, 10, 1),
(13, 7, 3, 1),
(14, 7, 1, 1),
(15, 8, 3, 5),
(16, 9, 3, 4),
(17, 10, 10, 10),
(18, 11, 12, 1),
(19, 11, 15, 1),
(20, 12, 11, 2),
(21, 12, 14, 1),
(22, 12, 17, 1),
(23, 12, 18, 1),
(24, 13, 10, 2),
(25, 13, 13, 1),
(26, 14, 14, 2),
(27, 14, 3, 1),
(28, 15, 1, 1),
(29, 15, 17, 1),
(30, 16, 11, 1),
(31, 17, 14, 1),
(32, 17, 17, 1),
(33, 18, 10, 1),
(34, 18, 14, 1),
(35, 19, 11, 1),
(36, 20, 3, 2),
(37, 20, 11, 1),
(38, 21, 12, 1),
(39, 22, 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idProducto` int(11) NOT NULL,
  `precio` double NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `codigo` int(11) NOT NULL,
  `stock` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idProducto`, `precio`, `nombre`, `codigo`, `stock`) VALUES
(1, 400, 'Agua Mineral', 1, 98),
(3, 700, 'Agua levite', 2, 107),
(10, 900, 'Pepso', 3, 187),
(11, 2500, 'Hamburguesa doble', 4, 15),
(12, 2400, 'Pizza muzarella', 5, 28),
(13, 3000, 'Lomo salteado', 6, 14),
(14, 1900, 'Taco mexicano', 7, 45),
(15, 1200, 'Coca Cola', 8, 199),
(16, 1200, 'Brahma', 9, 300),
(17, 1500, 'Heineken', 10, 297),
(18, 3000, 'Papas rusticas', 11, 89),
(19, 1000, 'Mirinda', 13, 200);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `idReserva` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `dni` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `idMesa` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `reserva`
--

INSERT INTO `reserva` (`idReserva`, `nombre`, `dni`, `fecha`, `estado`, `idMesa`) VALUES
(1, 'Luis Neyra', 123465, '2023-10-10', 1, 1),
(2, 'gato', 1234, '2023-10-01', 0, 1),
(3, 'Juan', 12345, '2023-10-11', 0, 2),
(4, 'Juncga', 766768, '2023-10-26', 0, 2),
(5, 'Ju', 464326, '2023-10-15', 0, 1),
(6, 'Ismael', 123456, '2023-10-26', 1, 12),
(7, 'Raul', 567843, '2023-10-31', 1, 5),
(8, 'Tony', 8074343, '2023-10-30', 1, 9),
(9, 'Ricardo', 469393, '2023-10-25', 0, 6),
(10, 'erre', 135, '2023-10-03', 0, 3),
(11, 'pepe', 1345646, '2023-10-25', 0, 4),
(12, 'lopeee', 132561, '2023-10-25', 0, 10),
(13, 'lalo', 12353126, '2023-10-25', 0, 6);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user`
--

CREATE TABLE `user` (
  `idUser` int(11) NOT NULL,
  `usuario` varchar(50) NOT NULL,
  `contraseña` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `user`
--

INSERT INTO `user` (`idUser`, `usuario`, `contraseña`) VALUES
(1, 'luislp', '1234'),
(2, 'juanlp', '1234');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `mesa`
--
ALTER TABLE `mesa`
  ADD PRIMARY KEY (`idMesa`),
  ADD UNIQUE KEY `numero` (`numero`);

--
-- Indices de la tabla `mesero`
--
ALTER TABLE `mesero`
  ADD PRIMARY KEY (`idMesero`),
  ADD UNIQUE KEY `dni` (`dni`),
  ADD KEY `idUser` (`idUser`);

--
-- Indices de la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD PRIMARY KEY (`idPedido`),
  ADD KEY `idMesa` (`idMesa`),
  ADD KEY `idMesero` (`idMesero`);

--
-- Indices de la tabla `pedidoproducto`
--
ALTER TABLE `pedidoproducto`
  ADD PRIMARY KEY (`idPedidoProducto`),
  ADD KEY `idPedido` (`idPedido`),
  ADD KEY `idProducto` (`idProducto`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idProducto`),
  ADD UNIQUE KEY `codigo` (`codigo`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`idReserva`),
  ADD KEY `idMesa` (`idMesa`);

--
-- Indices de la tabla `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`idUser`),
  ADD UNIQUE KEY `usuario` (`usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `mesa`
--
ALTER TABLE `mesa`
  MODIFY `idMesa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `mesero`
--
ALTER TABLE `mesero`
  MODIFY `idMesero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `pedido`
--
ALTER TABLE `pedido`
  MODIFY `idPedido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT de la tabla `pedidoproducto`
--
ALTER TABLE `pedidoproducto`
  MODIFY `idPedidoProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=40;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `idProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `idReserva` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de la tabla `user`
--
ALTER TABLE `user`
  MODIFY `idUser` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `mesero`
--
ALTER TABLE `mesero`
  ADD CONSTRAINT `mesero_ibfk_2` FOREIGN KEY (`idUser`) REFERENCES `user` (`idUser`);

--
-- Filtros para la tabla `pedido`
--
ALTER TABLE `pedido`
  ADD CONSTRAINT `pedido_ibfk_1` FOREIGN KEY (`idMesa`) REFERENCES `mesa` (`idMesa`),
  ADD CONSTRAINT `pedido_ibfk_2` FOREIGN KEY (`idMesero`) REFERENCES `mesero` (`idMesero`);

--
-- Filtros para la tabla `pedidoproducto`
--
ALTER TABLE `pedidoproducto`
  ADD CONSTRAINT `pedidoproducto_ibfk_1` FOREIGN KEY (`idPedido`) REFERENCES `pedido` (`idPedido`),
  ADD CONSTRAINT `pedidoproducto_ibfk_2` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`);

--
-- Filtros para la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `reserva_ibfk_1` FOREIGN KEY (`idMesa`) REFERENCES `mesa` (`idMesa`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
