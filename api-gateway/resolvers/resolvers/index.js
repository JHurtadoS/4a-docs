const reservaResolver = require('./reserva_resolver');
const transactionResolver = require('./transaction_resolver');

const authResolver = require('./auth_resolver');

const lodash = require('lodash');

const resolvers = lodash.merge(reservaResolver, transactionResolver, authResolver);

module.exports = resolvers;