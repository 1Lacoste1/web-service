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
  <div>
    <h5>Заказы</h5>
    <ul>
      <li v-for="reservation in reservations" :key="reservation.id">
        {{ reservation.id }}
        {{ reservation.name }} {{ reservation.address }}
        {{ reservation.amount }} {{ reservation.date_creation.toString()}}
        <ul>
          <li v-for="(product, index) in getProductsByReservationId(reservation.id)" :key="index">
              {{ product.id }} {{ product.serial }} {{ product.name }} {{ product.quantity }}
          </li>
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
      reservations: [],
      products: []
    }
  },
  computed: {
    getProductsByReservationId:function(reservationId) {
      return this.products.filter(product => product.orders_id === reservationId);
    }
  }
}
</script>