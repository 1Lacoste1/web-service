<template>
  <div>
    <p>Текущее время: {{ currentTime }}</p>
  </div>

</template>

<script>

export default {
  name: 'TimeMoscow',

  data() {
    return {
      currentTime: ''
    }
  },
  mounted() {
    this.getCurrentTime();
  },
  methods: {
    getCurrentTime() {
      setInterval(() => {
        this.currentTime = new Date().toLocaleTimeString();
      }, 1000);
    }
  }
}
</script>

<style>

</style>
