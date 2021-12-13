/* eslint-disable prettier/prettier */
<template>
  <main class="casa-page">
    <div class="contenedor-casa-page contenedor">
      <div class="imagen-casa-page">
        <img src="@/assets/mountains-gfb9370467_1920.jpg" />

        <div class="info-casa">
          <div class="info-item precio">
            <span>Precio</span>
            <span>100000$</span>
          </div>
          <div class="info-item propietiario">
            <span>Propetario</span>
            <span>Miguel Estepa</span>
          </div>
          <div class="info-item estado">
            <span>Estado</span>
            <span>Acupado</span>
          </div>
          <div class="info-item direccion">
            <span>Direccion</span>
            <span>Cr69l 64h-84</span>
          </div>

          <div class="social-media">
            <div class="btn whatsapp-btn">
              <font-awesome-icon icon="house-user" fixed-width size="2x" />
              <span> Enviar un mensaje</span>
            </div>

            <div class="btn compatir-btn">
              <font-awesome-icon icon="house-user" fixed-width size="2x" />
              <span> Compartir</span>
            </div>
          </div>
        </div>
      </div>

      <div class="desc-ampli">
        <p>
          Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem
          ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum
          Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem
          ipsum Lorem ipsum Lorem ipsum Lorem ipsum Lorem ipsum
        </p>
      </div>

      <div class="btn btn-reserva">
        <router-link to="/ReservaCasa">Reserva</router-link>
      </div>
    </div>
  </main>
  <Footer />
</template>

<script>
import Footer from "../components/footer.vue";
//import navbar from "../components/navbar.vue";

export default {
  name: "propiedad",
  components: {
    Footer,
    //navbar,
  },
};
</script>

<style lang="scss" src="../styles/scss/app.scss"></style>