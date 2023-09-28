<script setup>

import { ref } from 'vue'

const reservations = ref([])

const GetReservation = async () => {
  await fetch('http://localhost:6060/orders', {
    mode: 'cors',
    headers: {
      'Access-Control-Allow-Origin':'*'
    }
  }).then((response) => {
    reservations.value = response.data

  })
  console.log(reservations);
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
        {{ reservation.address }}
      </p>
    </li>
  </ul>
</template>

<script>
export default {
  name: "ReservationItems"
}
</script>