const reservaResolver = {
    Query: {
        reservaByUsername: async(_, { username }, { dataSources, userIdToken }) => {
            usernameToken = (await dataSources.authAPI.getUser(userIdToken)).username
            if (username == usernameToken)
                return await dataSources.reservaAPI.reservaByUsername(username)
            else
                return null
        },
    },
    Mutation: {}
};

module.exports = reservaResolver;