/* eslint-disable prettier/prettier */
import gql from "graphql-tag";
import { createRouter, createWebHistory } from "vue-router";
import {
    ApolloClient,
    createHttpLink,
    InMemoryCache,
} from "@apollo/client/core";
import Home from "../views/Home.vue";

import Login from "../views/Login.vue";

import SingUp from "../views/SingUp.vue";
import Propiedades from "../views/CasasDisponibles.vue";
import propiedad from "../views/CasaAlquilar.vue";
import ReservaCasa from "../views/ReservarCasa.vue";
import Reserva from "../components/Reserva.vue";

const routes = [{
        path: "/",
        name: "Home",
        component: Home,
        meta: { requiresAuth: false },
    },
    {
        path: "/Reserva",
        name: "Reserva",
        component: Reserva,
        meta: { requiresAuth: true },
    },
    {
        path: "/login",
        name: "Login",
        component: Login,
        meta: { requiresAuth: false },
    },
    {
        path: "/SingUp",
        name: "SingUp",
        component: SingUp,
        meta: { requiresAuth: false },
    },
    {
        path: "/propiedades",
        name: "Propiedades",
        component: Propiedades,
        meta: { requiresAuth: true },
    },
    {
        path: "/propiedad",
        name: "propiedad",
        component: propiedad,
        meta: { requiresAuth: true },
    },

    {
        path: "/ReservaCasa",
        name: "ReservaCasa",
        component: ReservaCasa,
        meta: { requiresAuth: true },
    },
];

const router = createRouter({
    history: createWebHistory(process.env.BASE_URL),
    routes,
});

const apolloClient = new ApolloClient({
    link: createHttpLink({ uri: "https://alkilaapi.herokuapp.com/" }),
    cache: new InMemoryCache(),
});
async function isAuth() {
    if (
        localStorage.getItem("token_access") === null ||
        localStorage.getItem("token_refresh") === null
    ) {
        return false;
    }

    try {
        var result = await apolloClient.mutate({
            mutation: gql `
        mutation ($refresh: String!) {
          refreshToken(refresh: $refresh) {
            access
          }
        }
      `,
            variables: {
                refresh: localStorage.getItem("token_refresh"),
            },
        });

        localStorage.setItem("token_access", result.data.refreshToken.access);
        return true;
    } catch {
        localStorage.clear();
        alert("Su sesión expiró, por favor vuelva a iniciar sesión");
        return false;
    }
}

router.beforeEach(async(to, from) => {
    var is_auth = await isAuth();

    if (is_auth == to.meta.requiresAuth) return true;

    //if (is_auth) return { path: '/' };
    //return { name: "Home" };
});

export default router;