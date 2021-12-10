/* eslint-disable prettier/prettier */
<template>
  <navbar />
  <main class="clases-disponibles">
    <div class="contenedor-casas-disponibles contenedor">
      <div class="contenedor-grid">
        <router-link to="/propiedad">
          <div class="contenedor-casa" id="cs-1">
            <div class="img-casa">
              <img src="@/assets/mountains-gfb9370467_1920.jpg" />
            </div>
            <div class="desc-casa">
              <div class="titulo">
                <h2>Casa En la playa</h2>
                <span>Dueño</span>
              </div>
            </div>
          </div>
        </router-link>

        <router-link to="/propiedad">
          <div class="contenedor-casa" id="cs-2">
            <div class="img-casa">
              <img src="@/assets/mountains-gfb9370467_1920.jpg" />
            </div>
            <div class="desc-casa">
              <div class="titulo">
                <h2>Casa En la playa</h2>
                <span>Dueño</span>
              </div>
            </div>
          </div>
        </router-link>

        <router-link to="/propiedad">
          <div class="contenedor-casa" id="cs-3">
            <div class="img-casa">
              <img src="@/assets/mountains-gfb9370467_1920.jpg" />
            </div>
            <div class="desc-casa">
              <div class="titulo">
                <h2>Casa En la playa</h2>
                <span>Dueño</span>
              </div>
            </div>
          </div>
        </router-link>

        <router-link to="/propiedad">
          <div class="contenedor-casa" id="cs-4">
            <div class="img-casa">
              <img src="@/assets/mountains-gfb9370467_1920.jpg" />
            </div>
            <div class="desc-casa">
              <div class="titulo">
                <h2>Casa En la playa</h2>
                <span>Dueño</span>
              </div>
            </div>
          </div>
        </router-link>

        <router-link to="/propiedad">
          <div class="contenedor-casa" id="cs-5">
            <div class="img-casa">
              <img src="@/assets/mountains-gfb9370467_1920.jpg" />
            </div>
            <div class="desc-casa">
              <div class="titulo">
                <h2>Casa En la playa</h2>
                <span>Dueño</span>
              </div>
            </div>
          </div>
        </router-link>

        <router-link to="/propiedad">
          <div class="contenedor-casa" id="cs-6">
            <div class="img-casa">
              <img src="@/assets/mountains-gfb9370467_1920.jpg" />
            </div>
            <div class="desc-casa">
              <div class="titulo">
                <h2>Casa En la playa</h2>
                <span>Dueño</span>
              </div>
            </div>
          </div>
        </router-link>

        <router-link to="/propiedad">
          <div class="contenedor-casa" id="cs-7">
            <div class="img-casa">
              <img src="@/assets/mountains-gfb9370467_1920.jpg" />
            </div>
            <div class="desc-casa">
              <div class="titulo">
                <h2>Casa En la playa</h2>
                <span>Dueño</span>
              </div>
            </div>
          </div>
        </router-link>
        <router-link to="/propiedad">
          <div class="contenedor-casa" id="cs-8">
            <div class="img-casa">
              <img src="@/assets/mountains-gfb9370467_1920.jpg" />
            </div>
            <div class="desc-casa">
              <div class="titulo">
                <h2>Casa En la playa</h2>
                <span>Dueño</span>
              </div>
            </div>
          </div>
        </router-link>

        <router-link to="/propiedad">
          <div class="contenedor-casa" id="cs-9">
            <div class="img-casa">
              <img src="@/assets/mountains-gfb9370467_1920.jpg" />
            </div>
            <div class="desc-casa">
              <div class="titulo">
                <h2>Casa En la playa</h2>
                <span> Dueño </span>
              </div>
            </div>
          </div>
        </router-link>
      </div>
    </div>
  </main>
  <Footer />
</template>

<script>
import Footer from "../components/footer.vue";
import navbar from "../components/navbar.vue";

export default {
  name: "Propiedades",
  components: {
    Footer,
    navbar,
  },
};
</script>

<style lang="scss" src="../styles/scss/app.scss"></style>