<template>
  <nav>
    <div class="contenedor-nav contenedor">
      <div class="alkila-logo">
        <div class="icono-casa">
          <font-awesome-icon icon="house-user" fixed-width size="2x" />
        </div>
        <h1>Alkila</h1>
      </div>

      <div class="enlaces">
        <div class="links">
          <router-link v-if="!is_auth" to="/Singup">SingUp</router-link>
          <router-link v-if="!is_auth" to="/Login">Login</router-link>
          <router-link v-if="is_auth" v-on:click="logOut" to="/"
            >Cerrar Sesion</router-link
          >
          <router-link
            v-if="is_auth"
            v-on:click="LoadPropiedades"
            to="/propiedades"
            >Propiedades</router-link
          >
        </div>

        <div class="profile">
          <font-awesome-icon icon="user" fixed-width size="1x" />
        </div>
      </div>
    </div>
  </nav>
</template>



<script>
export default {
  name: "navbar",
  computed: {
    is_auth: {
      get: function () {
        return this.$route.meta.requieresAuth;
      },
      set: function () {},
    },
  },

  methods: {
    LoadPropiedades: function () {
      this.$router.push({ name: "propiedades" });
    },

    logOut: function () {
      localStorage.clear();
      alert("Sesión Cerrada");
      this.verifyAuth();
    },
  },
};
</script>

<style lang="scss"></style>
