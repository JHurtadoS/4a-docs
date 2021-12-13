<template>
  <main class="login">
    <div class="contenedor-grid contenedor">
      <div class="contenedor-vacio"></div>
      <div class="contenedor-form-login">
        <h2>Registro</h2>
        <form action="">
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
                type="text"
                v-model="user.password"
                placeholder="Username"
              />
            </div>
            <div class="campo">
              <label for="">name</label>
              <input type="text" v-model="user.name" placeholder="Username" />
            </div>
            <div class="campo">
              <label for="">email</label>
              <input type="text" v-model="user.email" placeholder="Username" />
            </div>
          </div>
          <div class="btn btn-submit">
            <input type="submit" value="Registrar" />
          </div>
        </form>
      </div>
    </div>
  </main>
  <Footer />
</template>


<script>
import Footer from "../components/footer.vue";
//import navbar from "../components/navbar.vue";
import gql from "graphql-tag";

export default {
  name: "SingUp",
  components: {
    Footer,
    //navbar,
  },
  data: function () {
    return {
      user: {
        username: "",
        password: "",
        name: "",
        email: "",
      },
    };
  },

  methods: {
    processSignUp: async function () {
      await this.$apollo
        .mutate({
          mutation: gql`
            mutation ($userInput: SignUpInput!) {
              signUpUser(userInput: $userInput) {
                refresh
                access
              }
            }
          `,
          variables: {
            userInput: this.user,
          },
        })
        .then((result) => {
          let dataLogIn = {
            username: this.user.username,
            token_access: result.data.signUpUser.access,
            token_refresh: result.data.signUpUser.refresh,
          };

          this.$emit("completedSignUp", dataLogIn);
        })
        .catch((error) => {
          console.log(error);
          alert("ERROR: Fallo en el registro.");
        });
    },
  },
};
</script>

<style lang="scss" src="../styles/scss/app.scss"></style>