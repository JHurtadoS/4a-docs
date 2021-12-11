<template>
  <navbar />
  <main class="login">
    <div class="contenedor-grid contenedor">
      <div class="contenedor-vacio"></div>
      <div class="contenedor-form-login">
        <h2>Login</h2>
        <form v-on:submit.prevent="processLogInUser">
          <div class="campos">
            <div class="campo">
              <label for="">Username</label>
              <input
                type="text"
                v-model="user.username"
                placeholder="Username"
              />
            </div>
            <div class="campo">
              <label for="">Password</label>
              <input
                type="password"
                v-model="user.password"
                placeholder="Password"
              />
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
  data: function () {
    return {
      user: {
        username: "",
        password: "",
      },
    };
  },

  methods: {
    processLogInUser: async function () {
      await this.$apollo
        .mutate({
          mutation: gql`
            mutation ($credentials: CredentialsInput!) {
              logIn(credentials: $credentials) {
                refresh
                access
              }
            }
          `,
          variables: {
            credentials: this.user,
          },
        })
        .then((result) => {
          let dataLogIn = {
            username: this.user.username,
            token_access: result.data.logIn.access,
            token_refresh: result.data.logIn.refresh,
          };

          this.$emit("completedLogIn", dataLogIn);
        })
        .catch((error) => {
          alert("ERROR 401: Credenciales Incorrectas.");
        });
    },
  },
};
</script>


<style lang="scss" src="../styles/scss/app.scss"></style>