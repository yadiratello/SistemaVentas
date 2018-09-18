/*
MySQL Backup
Database: venta
Backup Time: 2018-09-18 02:34:38
*/

SET FOREIGN_KEY_CHECKS=0;
DROP TABLE IF EXISTS `venta`.`categoria`;
DROP TABLE IF EXISTS `venta`.`cliente`;
DROP TABLE IF EXISTS `venta`.`detalle_venta`;
DROP TABLE IF EXISTS `venta`.`empleado`;
DROP TABLE IF EXISTS `venta`.`producto`;
DROP TABLE IF EXISTS `venta`.`ventas`;
DROP PROCEDURE IF EXISTS `venta`.`actualizar_categoria`;
DROP PROCEDURE IF EXISTS `venta`.`actualizar_cliente`;
DROP PROCEDURE IF EXISTS `venta`.`actualizar_contrasenia`;
DROP PROCEDURE IF EXISTS `venta`.`actualizar_empleado`;
DROP PROCEDURE IF EXISTS `venta`.`actualizar_producto`;
DROP PROCEDURE IF EXISTS `venta`.`actualizar_venta`;
DROP PROCEDURE IF EXISTS `venta`.`aumentar_stock`;
DROP PROCEDURE IF EXISTS `venta`.`buscar_categoria`;
DROP PROCEDURE IF EXISTS `venta`.`buscar_cliente`;
DROP PROCEDURE IF EXISTS `venta`.`buscar_contrasenia`;
DROP PROCEDURE IF EXISTS `venta`.`buscar_empleado`;
DROP PROCEDURE IF EXISTS `venta`.`buscar_login`;
DROP PROCEDURE IF EXISTS `venta`.`buscar_producto`;
DROP PROCEDURE IF EXISTS `venta`.`buscar_tipo`;
DROP PROCEDURE IF EXISTS `venta`.`contar_categoria`;
DROP PROCEDURE IF EXISTS `venta`.`contar_cliente`;
DROP PROCEDURE IF EXISTS `venta`.`contar_detalle_venta`;
DROP PROCEDURE IF EXISTS `venta`.`contar_empleado`;
DROP PROCEDURE IF EXISTS `venta`.`contar_producto`;
DROP PROCEDURE IF EXISTS `venta`.`contar_venta`;
DROP PROCEDURE IF EXISTS `venta`.`disminuir_stock`;
DROP PROCEDURE IF EXISTS `venta`.`eliminar_categoria`;
DROP PROCEDURE IF EXISTS `venta`.`eliminar_cliente`;
DROP PROCEDURE IF EXISTS `venta`.`eliminar_detalle`;
DROP PROCEDURE IF EXISTS `venta`.`eliminar_empleado`;
DROP PROCEDURE IF EXISTS `venta`.`eliminar_producto`;
DROP PROCEDURE IF EXISTS `venta`.`eliminar_venta`;
DROP PROCEDURE IF EXISTS `venta`.`insertar_categoria`;
DROP PROCEDURE IF EXISTS `venta`.`insertar_cliente`;
DROP PROCEDURE IF EXISTS `venta`.`insertar_detalle_venta`;
DROP PROCEDURE IF EXISTS `venta`.`insertar_empleado`;
DROP PROCEDURE IF EXISTS `venta`.`insertar_producto`;
DROP PROCEDURE IF EXISTS `venta`.`insertar_venta`;
DROP PROCEDURE IF EXISTS `venta`.`listar_categoria`;
DROP PROCEDURE IF EXISTS `venta`.`listar_clientes`;
DROP PROCEDURE IF EXISTS `venta`.`listar_empleado`;
DROP PROCEDURE IF EXISTS `venta`.`listar_producto`;
CREATE TABLE `categoria` (
  `idcategoria` varchar(20) NOT NULL,
  `nombre_categoria` varchar(20) default NULL,
  PRIMARY KEY  (`idcategoria`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
CREATE TABLE `cliente` (
  `idcliente` varchar(20) NOT NULL,
  `nombre` varchar(50) default NULL,
  `apellidos` varchar(50) default NULL,
  `direccion` varchar(50) default NULL,
  `telefono` varchar(9) default NULL,
  `dni` varchar(8) default NULL,
  `ruc` varchar(11) default NULL,
  PRIMARY KEY  (`idcliente`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
CREATE TABLE `detalle_venta` (
  `iddetalle_venta` varchar(20) NOT NULL,
  `idventa` varchar(20) default NULL,
  `idproducto` varchar(20) default NULL,
  `cantidad` decimal(18,2) default NULL,
  `precio_unitario` decimal(18,2) default NULL,
  PRIMARY KEY  (`iddetalle_venta`),
  KEY `idventa` (`idventa`),
  KEY `idproducto` (`idproducto`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
CREATE TABLE `empleado` (
  `idempleado` varchar(20) NOT NULL,
  `nombre` varchar(50) default NULL,
  `apellidos` varchar(50) default NULL,
  `direccion` varchar(50) default NULL,
  `telefono` varchar(9) default NULL,
  `dni` varchar(8) default NULL,
  `login` varchar(50) default NULL,
  `tipo` varchar(50) default NULL,
  `contrasenia` varchar(50) default NULL,
  PRIMARY KEY  (`idempleado`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
CREATE TABLE `producto` (
  `idproducto` varchar(20) NOT NULL,
  `idcategoria` varchar(20) default NULL,
  `nombre` varchar(50) default NULL,
  `descripcion` varchar(50) default NULL,
  `stock` decimal(18,2) default NULL,
  `precio_compra` decimal(18,2) default NULL,
  `precio_venta` decimal(18,2) default NULL,
  `fecha_vencimiento` date default NULL,
  PRIMARY KEY  (`idproducto`),
  KEY `idcategoria` (`idcategoria`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
CREATE TABLE `ventas` (
  `idventa` varchar(20) NOT NULL,
  `idcliente` varchar(20) default NULL,
  `idempleado` varchar(20) default NULL,
  `fecha_venta` date default NULL,
  `tipo_documento` varchar(50) default NULL,
  `num_documento` varchar(50) default NULL,
  `total` decimal(18,2) default NULL,
  `igv` decimal(18,2) default NULL,
  `neto` decimal(18,2) default NULL,
  PRIMARY KEY  (`idventa`),
  KEY `idcliente` (`idcliente`),
  KEY `idempleado` (`idempleado`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
CREATE DEFINER=`root`@`localhost` PROCEDURE `actualizar_categoria`(
p_idcategoria VARCHAR(20),
p_nombre_categoria VARCHAR(50)
)
UPDATE categoria 
SET nombre_categoria=p_nombre_categoria
WHERE idcategoria=p_idcategoria;
CREATE DEFINER=`root`@`localhost` PROCEDURE `actualizar_cliente`(
p_idcliente VARCHAR(20),
p_nombre VARCHAR(50),
p_apellidos VARCHAR(50),
p_direccion VARCHAR(50),
p_telefono VARCHAR(9),
p_dni VARCHAR(8),
p_ruc VARCHAR(11)
)
UPDATE cliente 
SET nombre=p_nombre,apellidos=p_apellidos,direccion=p_direccion,telefono=p_telefono,dni=p_dni,ruc=p_ruc 
WHERE idcliente=p_idcliente;
CREATE DEFINER=`root`@`localhost` PROCEDURE `actualizar_contrasenia`(
p_login VARCHAR(50),
p_contrasenia VARCHAR(50)
)
UPDATE empleado
SET contrasenia=p_contrasenia 
WHERE login=p_login;
CREATE DEFINER=`root`@`localhost` PROCEDURE `actualizar_empleado`(
p_idempleado VARCHAR(20),
p_nombre VARCHAR(50),
p_apellidos VARCHAR(50),
p_direccion VARCHAR(50),
p_telefono VARCHAR(9),
p_dni VARCHAR(8),
p_login VARCHAR(50),
p_tipo VARCHAR(50),
p_contrasenia VARCHAR(50)
)
UPDATE empleado

SET nombre=p_nombre,apellidos=p_apellidos,direccion=p_direccion,
telefono=p_telefono,dni=p_dni,login=p_login,
tipo=p_tipo,contrasenia=p_contrasenia 

WHERE idempleado=p_idempleado;
CREATE DEFINER=`root`@`localhost` PROCEDURE `actualizar_producto`(
p_idproducto VARCHAR(20),
p_idcategoria VARCHAR(20),
p_nombre VARCHAR(50),
p_descripcion VARCHAR(50),
p_stock DECIMAL(18,2),
p_precio_compra DECIMAL(18,2),
p_precio_venta DECIMAL(18,2),
p_fecha_vencimiento DATE
)
UPDATE producto
SET idcategoria=p_idcategoria,nombre=p_nombre,descripcion=p_descripcion,stock=p_stock,precio_compra=p_precio_compra,precio_venta=p_precio_venta,fecha_vencimiento=p_fecha_vencimiento 
WHERE idproducto=p_idproducto;
CREATE DEFINER=`root`@`localhost` PROCEDURE `actualizar_venta`(
p_idventa VARCHAR(20),
p_idcliente VARCHAR(20),
p_idempleado VARCHAR(20),
p_fecha_venta DATE,
p_tipo_documento VARCHAR(50),
p_num_documento VARCHAR(50),
p_total DECIMAL(18,2),
p_igv DECIMAL(18,2),
p_neto DECIMAL(18,2)
)
UPDATE ventas
SET idcliente=p_idcliente,idempleado=p_idempleado,fecha_venta=p_fecha_venta,tipo_documento=p_tipo_documento,
num_documento=p_num_documento,total=p_total,igv=p_igv,neto=p_neto 
WHERE idventa=p_idventa;
CREATE DEFINER=`root`@`localhost` PROCEDURE `aumentar_stock`(
p_idproducto VARCHAR(20),
p_cantidad DECIMAL(18,2)
)
UPDATE producto SET stock=stock+p_cantidad
WHERE idproducto=p_idproducto;
CREATE DEFINER=`root`@`localhost` PROCEDURE `buscar_categoria`(
p_nombre_categoria VARCHAR(50)
)
SELECT * FROM categoria
WHERE nombre_categoria LIKE p_nombre_categoria;
CREATE DEFINER=`root`@`localhost` PROCEDURE `buscar_cliente`(
p_apellidos VARCHAR(50)
)
SELECT * FROM cliente
WHERE apellidos LIKE p_apellidos;
CREATE DEFINER=`root`@`localhost` PROCEDURE `buscar_contrasenia`(
p_login VARCHAR(50),
p_tipo VARCHAR(50),
p_contrasenia VARCHAR(50)
)
SELECT * FROM empleado
WHERE login=p_login AND tipo=p_tipo AND contrasenia=p_contrasenia;
CREATE DEFINER=`root`@`localhost` PROCEDURE `buscar_empleado`(
p_apellidos VARCHAR(50)
)
SELECT * FROM empleado
WHERE apellidos LIKE p_apellidos;
CREATE DEFINER=`root`@`localhost` PROCEDURE `buscar_login`(
p_login VARCHAR(50)
)
SELECT * FROM empleado
WHERE login=p_login;
CREATE DEFINER=`root`@`localhost` PROCEDURE `buscar_producto`(
p_nombre VARCHAR(50)
)
SELECT * FROM producto
WHERE nombre LIKE p_nombre;
CREATE DEFINER=`root`@`localhost` PROCEDURE `buscar_tipo`(
p_login VARCHAR(50),
p_tipo VARCHAR(50)
)
SELECT * FROM empleado
WHERE login=p_login AND tipo=p_tipo;
CREATE DEFINER=`root`@`localhost` PROCEDURE `contar_categoria`()
SELECT COUNT(*) FROM categoria;
CREATE DEFINER=`root`@`localhost` PROCEDURE `contar_cliente`()
SELECT COUNT(*) FROM cliente;
CREATE DEFINER=`root`@`localhost` PROCEDURE `contar_detalle_venta`()
SELECT COUNT(*) FROM detalle_venta;
CREATE DEFINER=`root`@`localhost` PROCEDURE `contar_empleado`()
SELECT COUNT(*) FROM empleado;
CREATE DEFINER=`root`@`localhost` PROCEDURE `contar_producto`()
SELECT COUNT(*) FROM producto;
CREATE DEFINER=`root`@`localhost` PROCEDURE `contar_venta`()
SELECT COUNT(*) FROM ventas;
CREATE DEFINER=`root`@`localhost` PROCEDURE `disminuir_stock`(
p_idproducto VARCHAR(20),
p_cantidad DECIMAL(18,2)
)
UPDATE producto SET stock=stock-p_cantidad
WHERE idproducto=p_idproducto;
CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminar_categoria`(
p_idcategoria VARCHAR(20)
)
DELETE FROM categoria
WHERE idcategoria=p_idcategoria;
CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminar_cliente`(
p_idcliente VARCHAR(20)
)
DELETE FROM cliente
WHERE idcliente=p_idcliente;
CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminar_detalle`(
p_iddetalle_venta VARCHAR(20)
)
DELETE FROM detalle_venta
WHERE iddetalle_venta=p_iddetalle_venta;
CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminar_empleado`(
p_empleado VARCHAR(20)
)
DELETE FROM empleado
WHERE idempleado=p_idempleado;
CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminar_producto`(
p_idproducto VARCHAR(20)
)
DELETE FROM producto
WHERE idproducto=p_idproducto;
CREATE DEFINER=`root`@`localhost` PROCEDURE `eliminar_venta`(
p_idventa VARCHAR(20)
)
DELETE FROM ventas
WHERE idventa=p_idventa;
CREATE DEFINER=`root`@`localhost` PROCEDURE `insertar_categoria`(
p_idcategoria VARCHAR(20),
p_nombre_categoria VARCHAR(50)
)
INSERT INTO categoria 
VALUE(p_idcategoria,p_nombre_categoria);
CREATE DEFINER=`root`@`localhost` PROCEDURE `insertar_cliente`(
p_idcliente VARCHAR(20),
p_nombre VARCHAR(50),
p_apellidos VARCHAR(50),
p_direccion VARCHAR(50),
p_telefono VARCHAR(9),
p_dni VARCHAR(8),
p_ruc VARCHAR(11)
)
INSERT INTO cliente 
VALUE(p_idcliente,p_nombre,p_apellidos,p_direccion,p_telefono,p_dni,p_ruc);
CREATE DEFINER=`root`@`localhost` PROCEDURE `insertar_detalle_venta`(
p_iddetalle_venta VARCHAR(20),
p_idventa VARCHAR(20),
p_idproducto VARCHAR(20),
p_cantidad DECIMAL(18,2),
p_precio_unitario DECIMAL(18,2)
)
INSERT INTO detalle_venta
VALUE(p_iddetalle_venta,p_idventa,p_idproducto,p_cantidad,p_precio_unitario);
CREATE DEFINER=`root`@`localhost` PROCEDURE `insertar_empleado`(
p_idempleado VARCHAR(20),
p_nombre VARCHAR(50),
p_apellidos VARCHAR(50),
p_direccion VARCHAR(50),
p_telefono VARCHAR(9),
p_dni VARCHAR(8),
p_login VARCHAR(50),
p_tipo VARCHAR(50),
p_contrasenia VARCHAR(50)
)
INSERT INTO empleado
VALUE(p_idempleado,p_nombre,p_apellidos,p_direccion,p_telefono,p_dni,p_login,p_tipo,p_contrasenia);
CREATE DEFINER=`root`@`localhost` PROCEDURE `insertar_producto`(
p_idproducto VARCHAR(20),
p_idcategoria VARCHAR(20),
p_nombre VARCHAR(50),
p_descripcion VARCHAR(50),
p_stock DECIMAL(18,2),
p_precio_compra DECIMAL(18,2),
p_precio_venta DECIMAL(18,2),
p_fecha_vencimiento DATE
)
INSERT INTO producto
VALUE(p_idproducto,p_idcategoria,p_nombre,p_descripcion,p_stock,p_precio_compra,p_precio_venta,p_fecha_vencimiento);
CREATE DEFINER=`root`@`localhost` PROCEDURE `insertar_venta`(
p_idventa VARCHAR(20),
p_idcliente VARCHAR(20),
p_idempleado VARCHAR(20),
p_fecha_venta DATE,
p_tipo_documento VARCHAR(50),
p_num_documento VARCHAR(50),
p_total DECIMAL(18,2),
p_igv DECIMAL(18,2),
p_neto DECIMAL(18,2)

)
INSERT INTO ventas
VALUE(p_idventa,p_idcliente,p_idempleado,p_fecha_venta,p_tipo_documento,p_num_documento,p_total,p_igv,p_neto);
CREATE DEFINER=`root`@`localhost` PROCEDURE `listar_categoria`()
SELECT * FROM categoria;
CREATE DEFINER=`root`@`localhost` PROCEDURE `listar_clientes`()
SELECT * FROM cliente;
CREATE DEFINER=`root`@`localhost` PROCEDURE `listar_empleado`()
SELECT * FROM empleado;
CREATE DEFINER=`root`@`localhost` PROCEDURE `listar_producto`()
SELECT idproducto,nombre_categoria,nombre,descripcion,stock,precio_compra,precio_venta,fecha_vencimiento
FROM producto 
INNER JOIN categoria 
ON producto.idcategoria=categoria.idcategoria;
BEGIN;
LOCK TABLES `venta`.`categoria` WRITE;
DELETE FROM `venta`.`categoria`;
INSERT INTO `venta`.`categoria` (`idcategoria`,`nombre_categoria`) VALUES ('CAT1', 'gaseosas'),('CAT2', 'fideos'),('CAT3', 'azúcar'),('CAT4', 'arroz'),('CAT5', 'limpieza '),('CAT6', 'embutidos'),('CAT7', 'especeria');
UNLOCK TABLES;
COMMIT;
BEGIN;
LOCK TABLES `venta`.`cliente` WRITE;
DELETE FROM `venta`.`cliente`;
INSERT INTO `venta`.`cliente` (`idcliente`,`nombre`,`apellidos`,`direccion`,`telefono`,`dni`,`ruc`) VALUES ('CLI1', 'anderson', 'murayari benavides', 'los angeles', '3573678', '25478547', '10254785472'),('CLI2', 'cesar', 'torres palomino', 'san bartolome', '3574812', '42174379', '10421743792'),('CLI3', 'vany', 'rodriguez barja', 'av. san andres', '3578471', '54789632', '10547896322'),('CLI4', 'cristina', 'lopez castro', 'ate vitarte', '9878766', '9878765', '8787666'),('CLI5', 'camila', 'sanchez carrion', 'cercado', '9875433', '98603319', '119876565'),('CLI6', 'esteban', 'uribe blas', 'ate', '987876543', '98987676', '987876567'),('CLI7', 'carmen', 'mala peres', 'lince', '9809878', '98787656', '987676565');
UNLOCK TABLES;
COMMIT;
BEGIN;
LOCK TABLES `venta`.`detalle_venta` WRITE;
DELETE FROM `venta`.`detalle_venta`;
INSERT INTO `venta`.`detalle_venta` (`iddetalle_venta`,`idventa`,`idproducto`,`cantidad`,`precio_unitario`) VALUES ('DET1', 'VEN1', 'PRO12', 1.00, 2.50),('DET2', 'VEN1', 'PRO1', 2.00, 2.50),('DET3', 'VEN1', 'PRO14', 2.00, 2.50),('DET4', 'VEN1', 'PRO13', 3.00, 3.00),('DET5', 'VEN2', 'PRO14', 0.00, 2.50),('DET6', 'VEN2', 'PRO14', 0.00, 2.50),('DET7', 'VEN4', 'PRO16', 2.00, 6.00);
UNLOCK TABLES;
COMMIT;
BEGIN;
LOCK TABLES `venta`.`empleado` WRITE;
DELETE FROM `venta`.`empleado`;
INSERT INTO `venta`.`empleado` (`idempleado`,`nombre`,`apellidos`,`direccion`,`telefono`,`dni`,`login`,`tipo`,`contrasenia`) VALUES ('emp01', 'ricardo', 'coello palomino', 'ate', '3573676', '42174379', 'ricardo', 'Administrador', '123'),('emp02', 'liliana', 'sanchez miranda', 'los angeles', '3573123', '42174123', 'liliana', 'Vendedora', 'liliana'),('emp03', 'jorge', 'cano rusel', 'chosica', '3573123', '42174123', 'cano', 'Asistente', 'cano'),('EMP4', 'julio', 'casas rios', 'lince', '988760654', '98765432', 'julio', 'Asistente', '123'),('EMP5', 'yadira', 'tello c', 'asas', '987654321', '73184205', 'yadira', 'Administrador', '123'),('EMP6', 'luis', 'lujan poma', 'lince', '987656565', '98098090', 'admin', 'Administrador', 'admin');
UNLOCK TABLES;
COMMIT;
BEGIN;
LOCK TABLES `venta`.`producto` WRITE;
DELETE FROM `venta`.`producto`;
INSERT INTO `venta`.`producto` (`idproducto`,`idcategoria`,`nombre`,`descripcion`,`stock`,`precio_compra`,`precio_venta`,`fecha_vencimiento`) VALUES ('PRO1', 'CAT1', 'inka kola', '1 litro', 98.00, 2.00, 2.50, '2014-08-02'),('PRO2', 'CAT1', 'inka kola', '2 litro', 100.00, 3.00, 3.50, '2014-08-02'),('PRO3', 'CAT2', 'fideos nicolini', '1 kilo', 100.00, 2.00, 2.50, '2014-08-02'),('PRO4', 'CAT2', 'fideos pennoni', '1 kilo ', 100.00, 2.00, 2.50, '2014-08-02'),('PRO5', 'CAT3', 'azucar blanco', '1 kilo', 100.00, 2.00, 2.50, '2014-08-02'),('PRO6', 'CAT3', 'azucar rubia', '1 kilo ', 100.00, 2.00, 2.50, '2014-08-02'),('PRO7', 'CAT4', 'arroz jazmin', 'grano largo de 1 kilo', 100.00, 2.00, 2.50, '2014-08-02'),('PRO8', 'CAT4', 'arroz basmati', 'grano largo de 1 kilo', 100.00, 2.00, 2.50, '2014-08-02'),('PRO9', 'CAT4', 'arroz bomba', 'grano medio de 1 kilo', 100.00, 2.00, 2.50, '2014-08-02'),('PRO10', 'CAT4', 'arroz carnaroli', 'grano medio de 1 kilo', 100.00, 2.00, 2.50, '2014-08-02'),('PRO11', 'CAT4', 'arroz arborio', 'grano corto de 1 kilo', 100.00, 2.00, 2.50, '2014-08-02'),('PRO12', 'CAT4', 'arroz vialone nano', 'grano corto de 1 kilo', 99.00, 2.00, 2.50, '2014-08-02'),('PRO13', 'CAT1', 'pescado jurel', 'bal blallala nala', 18.00, 2.00, 3.00, '2018-09-30'),('PRO14', 'CAT7', 'aji tari', 'aji picante mexicano', 20.00, 1.00, 2.50, '2018-09-29'),('PRO15', '', 'durazno', 'durazno grande', 12.00, 0.20, 0.50, '2018-09-28'),('PRO16', 'CAT8', 'pollo 2 kl', 'pollo entero de 2 kilos ', 10.00, 4.00, 6.00, '2018-09-30');
UNLOCK TABLES;
COMMIT;
BEGIN;
LOCK TABLES `venta`.`ventas` WRITE;
DELETE FROM `venta`.`ventas`;
INSERT INTO `venta`.`ventas` (`idventa`,`idcliente`,`idempleado`,`fecha_venta`,`tipo_documento`,`num_documento`,`total`,`igv`,`neto`) VALUES ('VEN1', 'CLI2', NULL, '2018-09-17', 'Factura', 'FACT1', 14.00, 3.00, 17.00),('VEN2', 'CLI7', 'emp01', '2018-09-18', 'Factura', 'FACT2', 6.00, 1.00, 7.00),('VEN3', 'CLI6', 'emp01', '2018-09-18', 'Factura', 'FACT4', 12.00, 2.00, 14.00),('VEN4', 'CLI6', NULL, '2018-09-18', 'Factura', 'FACT5', 12.00, 2.00, 14.00);
UNLOCK TABLES;
COMMIT;
