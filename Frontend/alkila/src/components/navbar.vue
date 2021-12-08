<template>
  <nav>
    <div class="contenedor-nav contenedor">
      <div class="alkila-logo">
        <div class="icono-casa">
          <img src="../assets/logo.png" alt="" srcset="" />
        </div>
        <h1>Alkila</h1>
      </div>

      <div class="enlaces">
        <div class="links">
          <router-link to="/Sinup">SingUp</router-link> |
          <router-link to="/Login">Login</router-link>
          <router-link to="/">Home</router-link>
        </div>

        <div class="profile">
          <img src="../assets/logo.png" alt="" srcset="" />
        </div>
      </div>
    </div>
  </nav>
</template>



<script>
export default {
  name: "navbar",
  computed: {},
};
</script>

<style lang="scss"></style>
