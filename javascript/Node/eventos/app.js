const EventEmitter = require("events");

const emisorProductos = new EventEmitter();

emisorProductos.on("compra", (total, numeroProductos) => {
  console.log(`Total de la compra: $${total}`);
  console.log(`Numero de productos: ${numeroProductos}`);
});

emisorProductos.emit("compra", 400, 32);
