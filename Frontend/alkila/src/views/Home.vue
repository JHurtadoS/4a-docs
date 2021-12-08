<template>
  <div class="home">
    <navbar />
    <Footer />
  </div>
</template>

<script>
// @ is an alias to /src
import Footer from "../components/footer.vue";
import navbar from "../components/navbar.vue";

export default {
  name: "Home",
  components: {
    Footer,
    navbar,
  },
};
</script>

<style lang="scss" src="../styles/scss/app.scss"></style>
