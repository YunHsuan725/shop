<template>
  <div id="app">
    <img class="logo" src="./assets/homeLogo.jpg">
    <router-view/>
  </div>
</template>

<script>
export default {
  name: 'App'
}
</script>

<style>
#app {
  display: flex;
  flex-direction: column;
}

.logo {
  display: inline;
  float: left;
  width: 20%;
  height: 20%;
}
</style>
