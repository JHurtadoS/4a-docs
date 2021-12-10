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
        path: "/about",
        name: "About",
        // route level code-splitting
        // this generates a separate chunk (about.[hash].js) for this route
        // which is lazy-loaded when the route is visited.
        component: () =>
            import ( /* webpackChunkName: "about" */ "../views/About.vue"),
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