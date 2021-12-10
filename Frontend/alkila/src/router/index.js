/* eslint-disable prettier/prettier */
import { createRouter, createWebHistory } from "vue-router";
import Home from "../views/Home.vue";

import Login from "../views/Login.vue";

import SingUp from "../views/SingUp.vue";
import Propiedades from "../views/CasasDisponibles.vue";
import propiedad from "../views/CasaAlquilar.vue";

const routes = [{
        path: "/",
        name: "Home",
        component: Home,
    },

    {
        path: "/login",
        name: "Login",
        component: Login,
    },
    {
        path: "/SingUp",
        name: "SingUp",
        component: SingUp,
    },
    {
        path: "/propiedades",
        name: "Propiedades",
        component: Propiedades,
    },
    {
        path: "/propiedad",
        name: "propiedad",
        component: propiedad,
    },
];

const router = createRouter({
    history: createWebHistory(process.env.BASE_URL),
    routes,
});

export default router;