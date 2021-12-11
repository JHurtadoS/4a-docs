<template>
  <div id="app" class="app">
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
export default {
  name: "App",

  computed: {
    is_auth: {
      get: function () {
        return this.$route.meta.requieresAuth;
      },
      set: function () {},
    },
  },

  methods: {


    completedLogIn: function (data) {
      localStorage.setItem("username", data.username);
      localStorage.setItem("token_access", data.token_access);
      localStorage.setItem("token_refresh", data.token_refresh);
      alert("Autenticación Exitosa");
      this.loadhome();
    },

    completedSignUp: function (data) {
      alert("Registro Exitoso");
      this.completedLogIn(data);
    },

    loadHome: function () {
      this.$router.push({ name: "home" });
    },

    loadReserva: function () {
      this.$router.push({ name: "reserva" });
    },

    loadTransaction: function () {
      this.$router.push({ name: "transaction" });
    },



  created: function(){
    this.verifyAuth()
  },

  },
};
</script>






<style>
</style>