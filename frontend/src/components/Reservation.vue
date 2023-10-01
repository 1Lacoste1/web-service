<script setup>

import { ref } from 'vue'
import "@/components/Reservation.vue";

const reservations = ref([])

const GetReservation = async () => {
  const response = await fetch('http://localhost:6060/orders')
  const data = await response.json()
  reservations.value = data
}

GetReservation()

</script>

<template>
  <div>
    <h5>Заказы</h5>
    <ul>
      <li v-for="reservation in reservations" :key="reservation.id">
        {{ reservation.id }}
        {{ reservation.name }} {{ reservation.address }}
        {{ reservation.amount }} {{ reservation.date_creation.toString()}}
        <ul>
          <p v-for="(product, index) in reservation.products" v-bind:key="index">
            {{product.serial}} {{product.name}} {{product.quantity}}
          </p>
        </ul>
      </li>
    </ul>
  </div>

  <div v-if="!reservations" >
    Error
  </div>
</template>

<script>
export default {
  name: "ReservationItems",
  data() {
    return {
      reservations: []
    }
  }
}
</script>