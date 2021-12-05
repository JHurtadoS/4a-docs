const {ApolloServer } = require('apollo-server');

const typeDefs = require('./typeDefs');
const resolvers = require('./resolvers');
const AlquilerAPI = require('./dataSources/alquiler_api');
const RegistroAPI = require('./dataSources/registro_api');
const authentication = require('./utils/authentication');

const server = new ApolloServer({
    context: authentication,
    typeDefs,
    resolvers,
    dataSources: () => ({
        alquilerAPI: new AlquilerAPI(),
        registroAPI: new RegistroAPI(),
    }),
    introspection: true,
    playground: true
});

server.listen(process.env.PORT || 4000).then(({ url }) => {
    console.log(` Server ready at ${url}`);
});
