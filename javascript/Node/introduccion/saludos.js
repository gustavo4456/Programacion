const saludar = (nombre) => {
  return `Hola, ${nombre}`;
};

const saludarHolaMundo = () => {
  return `Hola mundo!`;
};

// module.exports.saludar = saludar;
// module.exports.saludarHolaMundo = saludarHolaMundo;

module.exports = {
  saludar: saludar,
  saludarHolaMundo: saludarHolaMundo,
};
