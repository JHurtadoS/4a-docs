/* eslint-disable prettier/prettier */
import { createApp } from "vue";
import App from "./App.vue";

import { library } from "@fortawesome/fontawesome-svg-core";

import { faHouseUser } from "@fortawesome/free-solid-svg-icons";
import { faUser } from "@fortawesome/free-solid-svg-icons";

import { FontAwesomeIcon } from "@fortawesome/vue-fontawesome";

library.add(faHouseUser);
library.add(faUser);

/*

Vue.component("font-awesome-icon", FontAwesomeIcon);
*/
import router from "./router";
import {
    ApolloClient,
    createHttpLink,
    InMemoryCache,
} from "@apollo/client/core";
import { createApolloProvider } from "@vue/apollo-option";

import { setContext } from "apollo-link-context";
const httpLink = createHttpLink({
    uri: "https://alkilaapi.herokuapp.com/",
});
const authLink = setContext((_, { headers }) => {
    return {
        headers: {
            ...headers,
            Authorization: localStorage.getItem("token_access") || "",
        },
    };
});
const apolloClient = new ApolloClient({
    link: authLink.concat(httpLink),
    cache: new InMemoryCache(),
});
const apolloProvider = new createApolloProvider({
    defaultClient: apolloClient,
});
createApp(App)
    .component("font-awesome-icon", FontAwesomeIcon)
    .use(router)
    .use(apolloProvider)
    .mount("#app");