//Se llama al typedef (esquema) de cada submodulo
const reservaTypeDefs = require('./reserva_type_defs');
const transactionTypeDefs = require('./transaction_type_defs');
const authTypeDefs = require('./auth_type_defs');

//Se unen
const schemasArrays = [authTypeDefs, reservaTypeDefs, transactionTypeDefs];

//Se exportan
module.exports = schemasArrays;