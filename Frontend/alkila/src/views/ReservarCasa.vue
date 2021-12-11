<template>
  <navbar />
  <main class="reserva-casa">
    <div class="contenedor-reserva-casa contenedor">
      <div class="form-container">
        <h2>Reservar</h2>
        <form action="">
          <div class="campo">
            <label for="">Ejemplo</label>
            <input type="text" name="Ejemplo" id="" />
          </div>
          <div class="campo">
            <label for="">Ejemplo</label>
            <input type="text" name="Ejemplo" id="" />
          </div>
          <div class="campo">
            <label for="">Ejemplo</label>
            <input type="text" name="Ejemplo" id="" />
          </div>
          <div class="campo">
            <label for="">Ejemplo</label>
            <input type="text" name="Ejemplo" id="" />
          </div>

          <div class="btn-submit btn">
            <input type="submit" value="Enviar" />
          </div>
        </form>
      </div>
    </div>
  </main>
  <Footer />
</template>

<script>
import navbar from "../components/navbar.vue";
import Footer from "../components/footer.vue";

export default {
  name: "ReservaCasa",
  components: {
    Footer,
    navbar,
  },
};
</script>

<style>
</style>