<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.hello{
  background-color: #FEF9E7;
  padding: 5px;
  margin-top: 15px;
  margin-bottom: 15px;
}
h3 {
  margin: 40px 0 0;
}

</style>
