-- Ejecutar una sola vez sobre bases de datos existentes.
ALTER TABLE `marcas`
  ADD COLUMN `precio` DECIMAL(10,2) NOT NULL DEFAULT 0.00,
  ADD COLUMN `cantidad` INT(11) NOT NULL DEFAULT 0;
