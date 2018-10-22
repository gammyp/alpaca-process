<template>
  <div class="home">
    <div class="welcomeMsg">
      <p><HelloWorld msg="Hello"/>
      </p>
    </div>
    <img class="fluid-img imgzoom" id="logo-img" alt="logo" src="../assets/logo.gif" >
  </div>
</template>

<script>
// @ is an alias to /src
import HelloWorld from '@/components/HelloWorld.vue'
export default {
  name: 'home',
  components: {
    HelloWorld
  }
}
</script>

<style scoped>
.welcomeMsg {
  background-color: #fef9e7;
  padding: 5px;
  margin-top: 15px;
  margin-bottom: 15px;
}

.imgzoom:not(:hover) {
  width: 200px;
  transition: 2s;
}

.imgzoom:hover {
  width: 180px;
  transform: rotate(10deg);
  transition: 2s;
}
</style>
