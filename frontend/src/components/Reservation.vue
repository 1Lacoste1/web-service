<script setup>

import { ref } from 'vue'

const reservations = ref([])
const products = ref([])

const GetReservation = async () => {
  const response = await fetch('http://localhost:6060/orders')
  const data = await response.json()
  reservations.value = data
}

const GetProduct = async () => {
  const response = await fetch('http://localhost:6060/products')
  const data = await response.json()
  products.value = data
}

GetReservation()
GetProduct()
</script>

<template>

  <div v-if="reservations">
    <h5>Заказы</h5>
    <ul>
      <li v-for="reservation in reservations" :key="reservation.id">
        {{ reservation.id}} {{ reservation.name }} {{ reservation.address }}
        {{ reservation.amount }} {{ reservation.date_creation.toString()}}
      </li>
      <li v-for="product in products" :key="product.id">
        {{ product.serial }} {{ product.name }} {{ product.quantity }}
      </li>
    </ul>
  </div>
  <div v-if="!reservations" >
    Error
  </div>
</template>

<script>
export default {
  name: "ReservationItems"
}
</script>