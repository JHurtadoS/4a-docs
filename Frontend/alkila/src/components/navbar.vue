/* eslint-disable prettier/prettier */
<template>
  <nav>
    <div class="contenedor-nav contenedor">
      <router-link to="/propiedades">
        <div class="alkila-logo">
          <div class="icono-casa">
            <font-awesome-icon icon="house-user" fixed-width size="2x" />
          </div>
          <h1>Alkila</h1>
        </div>
      </router-link>

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
        <router-link to="/reserva">
          <div class="profile">
            <font-awesome-icon icon="user" fixed-width size="1x" />
          </div>
        </router-link>
      </div>
    </div>
  </nav>
</template>

<script>
export default {
  name: "navbar",
};
</script>

<style lang="scss"></style>
