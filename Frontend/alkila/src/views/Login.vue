<template>
  <navbar />
  <main class="login">
    <div class="contenedor-grid contenedor">
      <div class="contenedor-vacio"></div>
      <div class="contenedor-form-login">
        <h2>Login</h2>
        <form action="">
          <div class="campos">
            <div class="campo">
              <label for="">Username</label>
              <input type="text" name="" id="" />
            </div>
            <div class="campo">
              <label for="">Password</label>
              <input type="password" name="" id="" />
            </div>
          </div>
          <div class="links-recuperacion">
            <a href="#">Restore password</a>
            <a href="#">Restore Username</a>
          </div>

          <div class="btn btn-submit">
            <input type="submit" value="Ingresar" />
          </div>
        </form>
      </div>
    </div>
  </main>
  <Footer />
</template>

<script>
// @ is an alias to /src
import Footer from "../components/footer.vue";
import navbar from "../components/navbar.vue";

export default {
  name: "Login",
  components: {
    Footer,
    navbar,
  },
};
</script>

<style lang="scss" src="../styles/scss/app.scss"></style>