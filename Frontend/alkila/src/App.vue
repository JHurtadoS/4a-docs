/* eslint-disable prettier/prettier */
/* eslint-disable prettier/prettier */
<template>
  <div id="app" class="app">
    <navbar />
    <div class="main-component">
      <router-view
        v-on:completedLogIn="completedLogIn"
        v-on:completedSignUp="completedSignUp"
        v-on:logOut="logOut"
      >
      </router-view>
    </div>
  </div>
</template>




<script>
import navbar from "../src/components/navbar.vue";

export default {
  name: "App",

  components: {
    navbar,
  },

  computed: {
    is_auth: {
      get: function () {
        alert(this.$route.meta.requieresAuth);
        return this.$route.meta.requieresAuth;
      },
      set: function () {},
    },
  },

  methods: {
    verifyAuth: function () {
      this.is_auth = localStorage.getItem("isAuth") || false;
      alert(this.is_auth);
      if (this.is_auth == false) this.$router.push({ path: "/Login" });
      else this.$router.push({ path: "/propiedades" });
    },

    loadLogIn: function () {
      this.$router.push({ name: "logIn" });
    },

    loadSignUp: function () {
      this.$router.push({ name: "signUp" });
    },

    completedLogIn: function (data) {
      localStorage.setItem("username", data.username);
      localStorage.setItem("token_access", data.token_access);
      localStorage.setItem("token_refresh", data.token_refresh);
      alert("Autenticación Exitosa");
      this.verifyAuth();
    },

    completedSignUp: function (data) {
      alert("Registro Exitoso");
      this.completedLogIn(data);
    },

    loadHome: function () {
      this.$router.push({ name: "propiedades" });
    },

    loadReserva: function () {
      this.$router.push({ name: "reserva" });
    },

    loadTransaction: function () {
      this.$router.push({ name: "transaction" });
    },

    logOut: function () {
      localStorage.clear();
      alert("Sesión Cerrada");
      this.loadLogIn();
    },
  },
};
</script>

<style>
</style>