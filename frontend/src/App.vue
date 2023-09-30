<template>
  <img alt="Vue logo" src="./assets/logo.png">
  <TimeMoscow/>
  <ReservationItems/>
</template>

<script>
import TimeMoscow from './components/TimeMoscow.vue'
import ReservationItems from './components/Reservation.vue'

export default {
  name: 'App',
  components: {
    TimeMoscow,
    ReservationItems
  }
}

</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
