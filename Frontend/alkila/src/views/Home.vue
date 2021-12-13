<template>
  <div class="home">
    <main class="mainpage">
      <div class="contenedor-mainpage contenedor">
        <div class="contenido-mainpage">
          <h2>Encuentra tu lugar ideal</h2>
          <p>
            lorem ipsum Lorem lorem ipsum Loremlorem ipsum Lorem lorem ipsum
            Lorem vlorem ipsum Lorem lorem ipsum Lorem lorem ipsum Loremlorem
            ipsum Lorem lorem ipsum Loremlorem ipsum Loremlorem ipsum Loremv
          </p>
          <input type="search" name="" id="" placeholder="Encuentralo Ya" />
        </div>
      </div>
    </main>
    <Footer />
  </div>
</template>

<script>
// @ is an alias to /src
import Footer from "../components/footer.vue";
//import navbar from "../components/navbar.vue";

export default {
  name: "Home",
  components: {
    Footer,
    //navbar,
  },
};
</script>

<style lang="scss" src="../styles/scss/app.scss"></style>
