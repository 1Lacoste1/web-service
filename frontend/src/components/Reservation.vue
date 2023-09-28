<script setup>

import { ref } from 'vue'

const reservations = ref([])

const GetReservation = async () => {
  await fetch('http://localhost:6060/orders').then((response) => {
    reservations.value = response.data
  })
}
GetReservation()
</script>

<template>
  <ul>
    <li v-for="reservation in reservations" :key="reservation.id">
      <p>
        {{ reservation.name }}
      </p>
      <p>
        {{ reservation.price }}
      </p>
    </li>
  </ul>
</template>

<script>
export default {
  name: "Reservation"
}
</script>