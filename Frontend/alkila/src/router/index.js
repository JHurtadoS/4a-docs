/* eslint-disable prettier/prettier */
import { createRouter, createWebHistory } from "vue-router";
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
    },
    {
        path: "/Reserva",
        name: "Reserva",
        component: Reserva,
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

    {
        path: "/ReservaCasa",
        name: "ReservaCasa",
        component: ReservaCasa,
    },
];

const router = createRouter({
    history: createWebHistory(process.env.BASE_URL),
    routes,
});

export default router;