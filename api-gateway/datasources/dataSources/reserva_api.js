const { RESTDataSource } = require('apollo-datasource-rest');

const serverConfig = require('../server');

class ReservaAPI extends RESTDataSource {

    constructor() {
        super();
        this.baseURL = serverConfig.reserva_api_url;
    }

    async createReserva(reserva) {
        reserva = new Object(JSON.parse(JSON.stringify(reserva)));
        return await this.post('/reserva', reserva);
    }

    async reservaByUsername(username) {
        return await this.get(`/reserva/${username}`);
    }

    async createTransaction(transaction) {
        transaction = new Object(JSON.parse(JSON.stringify(transaction)));
        return await this.post('/transactions', transaction);
    }

    async transactionByUsername(username) {
        return await this.get(`/transactions/${username}`);
    }
}

module.exports = ReservaAPI;