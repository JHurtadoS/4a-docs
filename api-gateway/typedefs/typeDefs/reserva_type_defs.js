const { gql } = require('apollo-server');

const accountTypeDefs = gql `
    type Reserva {
        username: String!
        balance: Int!
        codigocasa: String!
        tiempoestadia: Int!
        lastChange: String!
    }

    extend type Query {
        reservaByUsername(username: String!): Reserva
    }
`;

module.exports = accountTypeDefs;