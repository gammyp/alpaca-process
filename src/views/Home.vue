<template>
  <div class="home">
    <p><HelloWorld msg="Hello"/>
    <span>{{firstSubject.subjectName}} </span>
    </p>
    <img id="logo-img" alt="logo" src="../assets/logo.gif" >
  </div>
</template>

<script>
// @ is an alias to /src
import HelloWorld from '@/components/HelloWorld.vue'
import axios from 'axios'
export default {
  name: 'home',
  components: {
    HelloWorld
  },

  data(){
    return{
      firstSubject: ''
    }
  },
  mounted(){
    this.fetchFirstSubject()
  },
  methods:{
    fetchFirstSubject: async function (){
      let firstSubject= await axios.get("http://localhost:8081/subject/1")

    this.firstSubject=firstSubject.data
    console.log(this.firstSubject)
    }
  }


  

}
</script>

<style scoped>
#logo-img{
  width: 180px;
  transition: width 2s, height 2s, transform 2s;
}

#logo-img:hover{
  width: 300px;
  transform: rotate(360deg);
}

</style>
