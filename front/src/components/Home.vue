<template>
  <div>
    <router-link to="/addProd">新增商品</router-link>
    <router-link to="/showOrder">新增訂單</router-link>
  </div>
</template>

<script>
import { RouterView } from 'vue-router';

export default {
  name: 'Home',
  data () {
    return {
      msg: 'Home'
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>
